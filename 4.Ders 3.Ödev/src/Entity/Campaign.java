package Entity;

import Abstract.EntityService;

public class Campaign implements EntityService {
	
	private int id;
	private String name;
	private int discount;
	private boolean status;
	public Campaign() {
		
	}
	public Campaign(int id, String name, int discount, boolean status) {
		super();
		this.id = id;
		this.name = name;
		this.discount = discount;
		this.status = status;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getDiscount() {
		return discount;
	}
	public void setDiscount(int discount) {
		this.discount = discount;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
}
