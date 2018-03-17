package edu.neu.csye6200;

public class Item {

	private Integer id;
	private String name;
	private Double price;
	
	
	
	public Item(Integer id, String name, Double price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}
	
	public Item() {}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}
	
	
public String toString() {
		
		StringBuilder info = new StringBuilder("Item: ");
		info.append(" ID :").append(this.getId());
		info.append(" Name :").append(this.getName());
		info.append(" Price ").append(this.getPrice());
		return info.toString();
		
	}

public void showItem() {
	
	System.out.println(this.toString());
	// TODO Auto-generated method stub
	
}

	
	
	
}
