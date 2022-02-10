package rautomator.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import rautomator.model.User;

public interface UserRepository extends CrudRepository<User, String> {
	
	
//	@Query("SELECT User from user u WHERE u.id=:id")
//	public List<User> findUser(@Param("id") Long idUser);

}
