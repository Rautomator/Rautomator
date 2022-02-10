package rautomator.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import rautomator.model.User;
import rautomator.repository.UserRepository;

@Service
public class UserService {

	private UserRepository userRepository;

	@Autowired
	public UserService(UserRepository userRepository) {
		this.userRepository = userRepository;
	}

	@Transactional
	public void saveUser(User user) throws DataAccessException {
		userRepository.save(user);
	}

	@Transactional(readOnly = true)
	public Optional<User> findUser(String username) {
		return userRepository.findById(username);
	}

	@Transactional
	public void delete(User user) {
		userRepository.delete(user);
	}

	@Transactional
	public List<User> findAll() {
		return (List<User>) userRepository.findAll();

	}
	
//	public List<User> findUser(Long id){
//		return userRepository.findUser(id);
//	}

}
