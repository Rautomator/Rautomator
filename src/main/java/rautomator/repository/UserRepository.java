package rautomator.repository;

import org.springframework.data.repository.CrudRepository;

import rautomator.model.User;

public interface UserRepository extends CrudRepository<User, String> {

}
