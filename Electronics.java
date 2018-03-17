package edu.neu.csye6200;

public class Electronics extends Item{

	private Double rating;

	public Electronics(Integer id, String name, Double price, Double rating) {
		super(id, name, price);
		this.rating = rating;
	}

	public Double getRating() {
		return rating;
	}

	public void setRating(Double rating) {
		this.rating = rating;
	}
	
public String toString() {
		
		StringBuilder info = new StringBuilder(super.toString());
	
		info.append(",Rating:  ").append(this.getRating()+ " ");
		
		
		return info.toString();
	}

public void showItem() {
	
	System.out.println(this.toString());
	// TODO Auto-generated method stub
	
}
	
	
}
