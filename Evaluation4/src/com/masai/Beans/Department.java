package com.masai.Beans;

public class Department {
    
	private int did;
	private String dName;
	private String location;
	
	public Department() {
		// TODO Auto-generated constructor stub
	}

	public Department(int did, String dName, String location) {
		super();
		this.did = did;
		this.dName = dName;
		this.location = location;
	}

	public int getDid() {
		return did;
	}

	public void setDid(int did) {
		this.did = did;
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
