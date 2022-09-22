package com.mindtree.orchard.doctorcontroller;

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

import com.mindtree.orchard.doctorentiy.DoctorData;
import com.mindtree.orchard.doctorinterface.DoctorInterface;

@RestController
@CrossOrigin(origins="http://localhost:4200")
public class DoctorController {
	
	
	@Autowired
	private DoctorInterface docservice;
	
	
	@GetMapping("/doctor")
	public List<DoctorData> getAllDoctor(){
		return docservice.getAllDoctors();
	
	}
	
	
	@GetMapping("/doctor/{id}")
	public DoctorData getDoctor(@PathVariable Integer id) {
		return docservice.getDoctor(id);
	}
	
	@PostMapping("/doctor")
	public void addDoctor(@RequestBody DoctorData doc) {
		docservice.addDoctor(doc);
	}
	
	
	@PutMapping("/doctor/{id}")
	public void updateDoctor(@RequestBody DoctorData doc, @PathVariable Integer id) {
		docservice.updateDoctor(doc);
	}
	
	
	@DeleteMapping
	public void deleteDoctor(@PathVariable Integer id) {
		docservice.deleteDoctor(id);
	}
}
