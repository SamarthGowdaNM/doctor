package com.mindtree.orchard.patiententity;

import java.util.List;

public class OutputResponse {
	
	
	private String name;
	private Integer patage;
	
	
	private List<VisitList> listOfVisit;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public List<VisitList> getListOfVisit() {
		return listOfVisit;
	}
	public void setListOfVisit(List<VisitList> listOfVisit) {
		this.listOfVisit = listOfVisit;
	}
	public OutputResponse(String name,Integer patage,  List<VisitList> listOfVisit) {
		super();
		this.name = name;
		this.listOfVisit = listOfVisit;
		this.patage=patage;
	}
	public Integer getPatage() {
		return patage;
	}
	public void setPatage(Integer patage) {
		this.patage = patage;
	}
	public OutputResponse() {
		super();
	}
	
	
	
}
