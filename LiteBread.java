package edu.neu.csye6200;

public class LiteBread extends Bread {

	private Double calories;

	public LiteBread(Integer id, String name, Double price, Double feature, Double calories) {
		super(id, name, price, feature);
		this.calories = calories;
	}
	
	public LiteBread() {}

	public Double getCalories() {
		return calories;
	}

	public void setCalories(Double calories) {
		this.calories = calories;
	}
	
	public Double caloriesValue() {
		return this.calories;
	}
	
	
public String toString() {
		
		StringBuilder info = new StringBuilder(super.toString());
	
		info.append(",calories:  ").append(this.getCalories()+ " ");
		
		
		return info.toString();
	}

public void showItem() {
	
	System.out.println(this.toString());
	// TODO Auto-generated method stub
	
}

	
	
}
