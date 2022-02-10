package rautomator.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import rautomator.model.AnalysisSpec;

public interface AnalysisSpecRepository extends CrudRepository<AnalysisSpec, Long> {

}
