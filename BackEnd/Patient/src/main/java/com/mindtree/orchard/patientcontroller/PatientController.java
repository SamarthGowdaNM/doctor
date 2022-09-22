package com.mindtree.orchard.patientcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mindtree.orchard.patiententity.OutputResponse;
import com.mindtree.orchard.patiententity.Patient;
import com.mindtree.orchard.patiententity.VisitList;
import com.mindtree.orchard.patientinterface.PatientInterface;


@RestController
@CrossOrigin(origins="http://localhost:4200")
public class PatientController {
	
	
	@Autowired
	private PatientInterface patient;
	
	
	@GetMapping("/patient")
	public List<Patient> getAllPatients() {
		return patient.getAllPatient();
	}
	
	
	
	@GetMapping("/patient/{id}")
	public Patient getPatient(@PathVariable Integer id) {
		return patient.getPatient(id);
				
	}
	
	
	@GetMapping("/patient/{id}/visit")
	public OutputResponse getVisits(@PathVariable Integer id){
		return patient.getVisitDetails(id);
	}
	
	
	@PostMapping("/patient")
	public void addPatient(@RequestBody Patient pat ) {
		patient.addPatient(pat);
		
	}
	
	@GetMapping("/patient/doctor/{id}")
	public List<Patient> getDoctor(@PathVariable Integer id) {
		return patient.getDoctorById(id);
	}
	
	
	@PutMapping("/patient/{id}")
	public void updatePatient(@RequestBody Patient pat, @PathVariable Integer id) {
		patient.addPatient(pat);
	}
	
	
	@DeleteMapping("/patient/{id}")
	public void deletePatient(@PathVariable Integer id) {
		patient.deletePatientById(id);
	}
	
	
	@DeleteMapping("/patient/visit/{id}")
	public void deletePatientByVist(@PathVariable Integer id) {
		patient.deletePatientVist(id);
	}
	
}
