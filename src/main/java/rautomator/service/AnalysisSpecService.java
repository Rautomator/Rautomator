package rautomator.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import rautomator.model.AnalysisSpec;

import rautomator.repository.AnalysisSpecRepository;

@Service
public class AnalysisSpecService {

	private AnalysisSpecRepository analysisSpecRepository;

	@Autowired
	public AnalysisSpecService(AnalysisSpecRepository analysisSpecRepository) {
		this.analysisSpecRepository = analysisSpecRepository;
	}

	@Transactional
	public List<AnalysisSpec> findAll() {
		return (List<AnalysisSpec>) analysisSpecRepository.findAll();

	}

//	@Transactional
//	public void save(AnalysisSpec newAnalysisSpec) {
//		analysisSpecRepository.save(newAnalysisSpec);
//	}
	@Transactional
	public Optional<AnalysisSpec> findById(Long id) {
		return analysisSpecRepository.findById(id);

	}
}
