package rautomator.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import rautomator.model.Spec;

public interface SpecRepository extends JpaRepository<Spec, Long> {

}
