package com.mindtree.orchard.patientrepository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mindtree.orchard.patiententity.Patient;


@Repository
public interface PatientRepository extends JpaRepository<Patient, Integer> {

	public List<Patient> findByPatid(Integer id);

	public void deleteByPatid(Integer pid);

	public List<Patient> findByDocvisited(Integer id);
	
	
	
}
