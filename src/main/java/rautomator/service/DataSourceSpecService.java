package rautomator.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import rautomator.model.DataSourceSpec;
import rautomator.repository.DataSourceSpecRepository;

@Service
public class DataSourceSpecService {
	
	private DataSourceSpecRepository dataSourceSpecRepository;

	@Autowired
	public DataSourceSpecService(DataSourceSpecRepository dataSourceSpecRepository) {
		this.dataSourceSpecRepository = dataSourceSpecRepository;
	}

	@Transactional
	public List<DataSourceSpec> findAll() {
		return (List<DataSourceSpec>) dataSourceSpecRepository.findAll();

	}

//	@Transactional
//	public void save(AnalysisSpec newAnalysisSpec) {
//		analysisSpecRepository.save(newAnalysisSpec);
//	}
	@Transactional
	public Optional<DataSourceSpec> findById(Long id) {
		return dataSourceSpecRepository.findById(id);

	}

}
