package com.masai.Beans;

public class Employee {
	
	private int eId;
	private String eName;
	private String address;
	private String email;
	private String password;
	private int salary;
	private int deptId;
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(int eId, String eName, String address, String email, String password, int salary, int deptId) {
		super();
		this.eId = eId;
		this.eName = eName;
		this.address = address;
		this.email = email;
		this.password = password;
		this.salary = salary;
		this.deptId = deptId;
	}

	public int geteId() {
		return eId;
	}

	public void seteId(int eId) {
		this.eId = eId;
	}

	public String geteName() {
		return eName;
	}

	public void seteName(String eName) {
		this.eName = eName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public int getDeptId() {
		return deptId;
	}

	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}
	
	

}
