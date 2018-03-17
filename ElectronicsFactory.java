package edu.neu.csye6200;

public class ElectronicsFactory {

public Item CreateElectronics(Integer id, String name, Double price, Double rating) {
		
		Item obj = new Item();
		
		obj = new Electronics(id, name, price, rating);
		
		return obj;
		
	}
}
