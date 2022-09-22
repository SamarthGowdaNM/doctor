package com.mindtree.orchard.patiententity;

import java.sql.Date;

public class VisitList {
	
	
	private Integer visdoc;
	private String prescription;
	private java.util.Date date;
	private String docName;
	public Integer getVisdoc() {
		return visdoc;
	}
	public void setVisdoc(Integer visdoc) {
		this.visdoc = visdoc;
	}
	public String getPrescription() {
		return prescription;
	}
	public void setPrescription(String prescription) {
		this.prescription = prescription;
	}
	public java.util.Date getDate() {
		return date;
	}
	public void setDate(java.util.Date date) {
		this.date = date;
	}
	public VisitList(String docName,Integer visdoc, String prescription, java.util.Date date) {
		super();
		this.docName=docName;
		this.visdoc = visdoc;
		this.prescription = prescription;
		this.date = date;
	}
	public String getDocName() {
		return docName;
	}
	public void setDocName(String docName) {
		this.docName = docName;
	}
	public VisitList() {
		super();
	}
	
	
	
	
	
}
