package JdbcApp3;

public class Employee {
	
	
	private int	empId;
	private String	ename;
	private String	address;
	private String	mobile;
	private int	deptid;
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(int empId, String ename, String address, String mobile, int deptid) {
		super();
		this.empId = empId;
		this.ename = ename;
		this.address = address;
		this.mobile = mobile;
		this.deptid = deptid;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public int getDeptid() {
		return deptid;
	}

	public void setDeptid(int deptid) {
		this.deptid = deptid;
	}
	
	

}
