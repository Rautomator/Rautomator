package rautomator.web;

import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.MediaTypes;
import org.springframework.hateoas.mediatype.problem.Problem;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import rautomator.model.User;
import rautomator.service.UserService;

@RestController
@RequestMapping("/users")
public class UserController {

	@Autowired
	private UserService userService;

	private final static HttpHeaders headers = new HttpHeaders();

	@PostMapping("user")
	public User login(@RequestParam("user") String username, @RequestParam("password") String pwd) {

		String token = getJWTToken(username);
		User user = new User();
		user.setUsername(username);
		user.setToken(token);
		return user;

	}

	@RequestMapping(value = "/login", method = RequestMethod.POST, produces = "application/json")
	public ResponseEntity<?> login(@RequestBody User credentials) {
		Optional<User> user = this.userService.findUser(credentials.getUsername());
		if (!user.isPresent()) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND)
					.header(HttpHeaders.CONTENT_TYPE, MediaTypes.HTTP_PROBLEM_DETAILS_JSON_VALUE).headers(headers)
					.body(Problem.create().withTitle("Usuario incorrecto").withDetail("El usuario no existe."));
		}
		if (user.get().getPassword().equals(credentials.getPassword())) {
			String token = getJWTToken(credentials.getUsername());
			user.get().setToken(token);
			this.userService.saveUser(user.get());
		} else {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST)
					.header(HttpHeaders.CONTENT_TYPE, MediaTypes.HTTP_PROBLEM_DETAILS_JSON_VALUE).headers(headers)
					.body(Problem.create().withTitle("Datos incorrectos")
							.withDetail("Algunos datos son incorrectos. Revisalos."));
		}
		return ResponseEntity.status(HttpStatus.OK).headers(headers).body(user.get());
	}

	@GetMapping("")
	List<User> all() {
		return userService.findAll();
	}

	@GetMapping("/{id}")
	Optional<User> one(@PathVariable String id) {

		return userService.findUser(id);
	}

	private String getJWTToken(String username) {
		String secretKey = "mySecretKey";
		List<GrantedAuthority> grantedAuthorities = AuthorityUtils.commaSeparatedStringToAuthorityList("ROLE_USER");

		String token = Jwts.builder().setId("softtekJWT").setSubject(username)
				.claim("authorities",
						grantedAuthorities.stream().map(GrantedAuthority::getAuthority).collect(Collectors.toList()))
				.setIssuedAt(new Date(System.currentTimeMillis()))
				.setExpiration(new Date(System.currentTimeMillis() + 600000))
				.signWith(SignatureAlgorithm.HS512, secretKey.getBytes()).compact();

		return "Bearer " + token;
	}
}
