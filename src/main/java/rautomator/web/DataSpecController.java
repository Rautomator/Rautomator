package rautomator.web;

import java.util.Collection;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import rautomator.model.DataSpec;
import rautomator.repository.DataSpecRepository;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/data")
public class DataSpecController {

	private final DataSpecRepository repository;
	private final static HttpHeaders headers = new HttpHeaders();

	DataSpecController(DataSpecRepository repository) {
		this.repository = repository;
	}

	@RequestMapping(value = "", method = RequestMethod.GET, produces = "application/json")
	public ResponseEntity<Collection<DataSpec>> all() {
		Collection<DataSpec> data = this.repository.findAll();
		if (data.isEmpty()) {
			return new ResponseEntity<Collection<DataSpec>>(headers, HttpStatus.NOT_FOUND);
		} else {
			return new ResponseEntity<Collection<DataSpec>>(data, headers, HttpStatus.OK);
		}

	}

//	@RequestMapping(value = "/data", method = RequestMethod.GET, produces = "application/json")
//	List<DataSpec> all() {
//		return repository.findAll();
//	}

//	@PostMapping("/data")
//	DataSpec newDataSpec(@RequestBody DataSpec newDataSpec) {
//		return repository.save(newDataSpec);
//	}

//	@RequestMapping(value = "/{id}", method = RequestMethod.GET, produces = "application/json")
//	DataSpec one(@PathVariable Long id) {
//
//		return repository.findById(id).orElseThrow(() -> new NotFoundException(id));
//	}

}
