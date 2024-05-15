package JdbcApp2;

public class Product {
	
	
	
	private int pid;
	private String pName;
	private int quantity;
	private int price;
	
	public Product() {
		// TODO Auto-generated constructor stub
	}

	public Product(int pid, String pName, int quantity, int price) {
		super();
		this.pid = pid;
		this.pName = pName;
		this.quantity = quantity;
		this.price = price;
	}

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getpName() {
		return pName;
	}

	public void setpName(String pName) {
		this.pName = pName;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	
	
	
	

}
