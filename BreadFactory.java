package edu.neu.csye6200;

public class BreadFactory {
	
	
	public Item creatBread(Integer id, String name, Double price, Double slices) {
		
		
		
		Item obj = new Item();
		
		obj = new Bread(id, name, price, slices);
		
		return obj;
	}
	
	
	
	

}
