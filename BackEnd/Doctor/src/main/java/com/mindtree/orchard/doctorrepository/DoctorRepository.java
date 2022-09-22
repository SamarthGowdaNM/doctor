package com.mindtree.orchard.doctorrepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mindtree.orchard.doctorentiy.DoctorData;



@Repository
public interface DoctorRepository extends JpaRepository<DoctorData, Integer>{
	
	
}
