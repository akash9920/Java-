package edu.neu.csye6200;

public class LiteBreadFactory {

	
	public LiteBread CreateLiteBread(Integer iD, String name, Double price, Double slices, Double calories) {
		
		LiteBread obj = new LiteBread();
			
			obj = new LiteBread(iD,name,price,slices,calories);
			
			
			return obj;
			
		}
}
