package com.mindtree.orchard.patient;


import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.sql.Date;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.mindtree.orchard.patiententity.Patient;
import com.mindtree.orchard.patientinterface.PatientInterface;

@SpringBootTest
class PatientApplicationTests {
	
	
	@Autowired
	private PatientInterface patinf;

	@Test
	public void getAllPatientsinfo() {
		List<Patient> r=patinf.getAllPatient();
		assertThat(r).size().isGreaterThan(1);
	}
	
	@Test
	public void postpatient() {
		Patient p=new Patient(new Date(2002, 02, 22), 123,3, "sohail", 2, "dfghjhv");
	}

}
