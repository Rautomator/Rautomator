package rautomator.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import rautomator.model.Spec;

public interface SpecRepository extends CrudRepository<Spec, Long> {

}
