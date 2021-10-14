package rautomator.web;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import rautomator.model.AnalysisSpec;
import rautomator.service.AnalysisSpecService;

@RestController
@RequestMapping("/analysis")
public class AnalysisSpecController {

	@Autowired
	private AnalysisSpecService analysisSpecService;

	@GetMapping("")
	List<AnalysisSpec> findAll() {
		return analysisSpecService.findAll();
	}

//	@PostMapping("/analysis")
//	void save(@RequestBody AnalysisSpec newAnalysisSpec) {
//		analysisSpecService.save(newAnalysisSpec);
//	}

	@GetMapping("/{id}")
	Optional<AnalysisSpec> findById(@PathVariable Long id) {

		return analysisSpecService.findById(id);
	}

}
