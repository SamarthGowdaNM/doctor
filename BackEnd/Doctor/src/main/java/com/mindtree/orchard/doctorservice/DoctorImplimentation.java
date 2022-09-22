package com.mindtree.orchard.doctorservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mindtree.orchard.doctorentiy.DoctorData;
import com.mindtree.orchard.doctorinterface.DoctorInterface;
import com.mindtree.orchard.doctorrepository.DoctorRepository;



@Service
public class DoctorImplimentation implements DoctorInterface {
	
	
	@Autowired
	private DoctorRepository docrepo;
	
	
	@Override
	public List<DoctorData> getAllDoctors() {
		// TODO Auto-generated method stub
		
		return docrepo.findAll();
	}

	@Override
	public DoctorData getDoctor(Integer id) {
		// TODO Auto-generated method stub
		return docrepo.findById(id).get();
	}

	@Override
	public void addDoctor(DoctorData doc) {
		// TODO Auto-generated method stub
		docrepo.save(doc);
	}

	@Override
	public void updateDoctor(DoctorData doc) {
		// TODO Auto-generated method stub
		docrepo.save(doc);
	}

	@Override
	public void deleteDoctor(Integer id) {
		// TODO Auto-generated method stub
		docrepo.deleteById(id);
	}

}
