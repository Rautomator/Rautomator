package rautomator.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import rautomator.model.DataSourceSpec;

public interface DataSourceSpecRepository extends CrudRepository<DataSourceSpec, Long>{

}
