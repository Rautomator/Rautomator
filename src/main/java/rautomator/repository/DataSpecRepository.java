package rautomator.repository;

import java.util.Collection;

import org.springframework.data.repository.CrudRepository;

import rautomator.model.DataSpec;

public interface DataSpecRepository extends CrudRepository<DataSpec, Long> {
	Collection<DataSpec> findAll();

}
