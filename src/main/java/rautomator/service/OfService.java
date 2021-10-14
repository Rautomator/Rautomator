package rautomator.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import rautomator.model.Of;
import rautomator.repository.OfRepository;

@Service
public class OfService {
	private OfRepository ofRepository;

	@Autowired
	public OfService(OfRepository ofRepository) {
		this.ofRepository = ofRepository;
	}

	@Transactional
	public List<Of> findAll() {
		return (List<Of>) ofRepository.findAll();

	}

	@Transactional(readOnly = true)
	public Optional<Of> findById(String id) {
		return ofRepository.findById(id);
	}

	@Transactional
	public void save(Of newOf) {
		ofRepository.save(newOf);

	}

}
