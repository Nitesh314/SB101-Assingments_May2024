package com.masai.Beans;

public class DepartmentDTO {
	
	private String dName;
	private String location;
	
	public DepartmentDTO() {
		// TODO Auto-generated constructor stub
	}

	public DepartmentDTO(String dName, String location) {
		super();
		this.dName = dName;
		this.location = location;
	}

	public String getdName() {
		return dName;
	}

	public void setdName(String dName) {
		this.dName = dName;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}
	
	

}
