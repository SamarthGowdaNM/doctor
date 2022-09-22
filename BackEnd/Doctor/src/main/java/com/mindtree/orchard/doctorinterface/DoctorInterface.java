package com.mindtree.orchard.doctorinterface;

import java.util.List;

import org.springframework.stereotype.Service;

import com.mindtree.orchard.doctorentiy.DoctorData;




@Service
public interface DoctorInterface {
	
	public List<DoctorData> getAllDoctors();
	public DoctorData getDoctor(Integer id);
	public void addDoctor(DoctorData doc);
	public void updateDoctor(DoctorData doc);
	public void deleteDoctor(Integer id);

}
