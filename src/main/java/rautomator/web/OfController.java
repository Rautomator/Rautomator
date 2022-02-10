package rautomator.web;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import rautomator.model.DataSpec;
import rautomator.model.Of;

import rautomator.repository.DataSpecRepository;
import rautomator.repository.OfRepository;

import rautomator.service.OfService;

@RestController
@RequestMapping("/of")
public class OfController {

	private final OfRepository repository;

	private final DataSpecRepository dataRepository;

	@Autowired
	private OfService ofService;

	private final static HttpHeaders headers = new HttpHeaders();

	OfController(OfRepository repository, DataSpecRepository dataRepository) {
		this.repository = repository;
		this.dataRepository = dataRepository;
	}

	@GetMapping("")
	List<Of> all() {
		return ofService.findAll();
	}

	@RequestMapping(value = "/{id_data}", method = RequestMethod.POST, produces = "application/json")
	ResponseEntity<Of> newOf(@RequestBody Of newOf, @PathVariable("id_data") Long id_data) {
		DataSpec dataSpec = dataRepository.findById(id_data).get();
		newOf.setDataSpec(dataSpec);
		dataSpec.addOf(newOf);
		this.repository.save(newOf);
		this.dataRepository.save(dataSpec);

		return new ResponseEntity<Of>(newOf, headers, HttpStatus.OK);
	}

	@GetMapping("/{id}")
	Optional<Of> one(@PathVariable String id) {
		return ofService.findById(id);
	}

//	@PostMapping("/of")
//	void save(@RequestBody Of newOf) {
//		ofService.save(newOf);
//	}

}
