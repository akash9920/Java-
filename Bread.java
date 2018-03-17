package edu.neu.csye6200;

public class Bread extends Item {

	private Double slices;

	public Bread(Integer id, String name, Double price, Double feature) {
		super(id, name, price);
		this.slices = feature;
	}
	
	public Bread() {}

	public Double getSlices() {
		return slices;
	}

	public void setSlices(Double slices) {
		this.slices = slices;
	}

	public Double calorivalue() {
		
		return 1.00;
	}
	
	
public String toString() {
		
		StringBuilder info = new StringBuilder(super.toString());
	
		info.append(",Slices:  ").append(this.getSlices()+ " ");
		
		return info.toString();
	}
	
	
public void showItem() {
		
		System.out.println(this.toString());
		
		
	}
	
	
}
