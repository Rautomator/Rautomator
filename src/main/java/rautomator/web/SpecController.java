package rautomator.web;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import rautomator.error.NotFoundException;
import rautomator.model.Spec;
import rautomator.repository.SpecRepository;

@RestController
public class SpecController {

	private final SpecRepository repository;

	SpecController(SpecRepository repository) {
		this.repository = repository;
	}

	@GetMapping("/spec")
	List<Spec> all() {
		return (List<Spec>) repository.findAll();
	}

//	@PostMapping("/spec")
//	Spec newSpec(@RequestBody Spec newSpec) {
//		return repository.save(newSpec);
//	}

	@GetMapping("/spec/{id}")
	Spec one(@PathVariable Long id) {

		return repository.findById(id).orElseThrow(() -> new NotFoundException(id));
	}

}
