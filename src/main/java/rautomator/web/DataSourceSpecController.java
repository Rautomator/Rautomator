package rautomator.web;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import rautomator.model.DataSourceSpec;

import rautomator.service.DataSourceSpecService;

@RestController
@RequestMapping("/url")
public class DataSourceSpecController {
	
	@Autowired
	private DataSourceSpecService dataSourceSpecService;

	@GetMapping("")
	List<DataSourceSpec> findAll() {
		return dataSourceSpecService.findAll();
	}
	@GetMapping("/{id}")
	Optional<DataSourceSpec> findById(@PathVariable Long id) {

		return dataSourceSpecService.findById(id);
	}


}
