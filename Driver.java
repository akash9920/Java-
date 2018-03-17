package edu.neu.csye6200;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Walmart obj = new Walmart();
		
		
		
		System.out.println("---------------demo()'s are being launched---------- \n");
		
		Walmart.demo1();
		Walmart.demo2();
		Walmart.demo3();
	
		obj.show();
		obj.showInventory();
		
		System.out.println("\n");
		obj.sortInventory();
		System.out.println("\n");
		obj.clearInventory();
		
	
	
	
	}
	

}



/*

---------------demo()'s are being launched---------- 

this is the starting of demo1() electronics-----

this is the starting of demo2() Bread-----

this is the starting of demo3() Bread-----

total number of items in the store are:		12

--------------Soon you are going to see the inventory ------------

---------------Electronics List------------------------

no of Electronics Item are: 4 

Item:  ID :1 Name :Apple Price 2000.0,Rating:  4.5 
Item:  ID :2 Name :Microsoft Price 3000.0,Rating:  5.5 
Item:  ID :3 Name :Google Price 5000.0,Rating:  6.5 
Item:  ID :4 Name :Tesla Price 6000.0,Rating:  7.5 


---------------Bread List------------------------

no of Bread Item are: 4 

Item:  ID :5 Name :Harvest Price 5.0,Slices:  7.0 
Item:  ID :6 Name :Brittania Price 6.0,Slices:  8.0 
Item:  ID :7 Name :Mother Price 7.0,Slices:  9.0 
Item:  ID :8 Name :bakersClub Price 8.0,Slices:  10.0 


---------------Lite Bread List------------------------

no of LiteBreads are: 4 
 
Item:  ID :9 Name :bostonBread Price 10.0,Slices:  10.0 ,calories:  100.0 
Item:  ID :10 Name :caliBread Price 8.0,Slices:  20.0 ,calories:  150.0 
Item:  ID :11 Name :miamiBread Price 7.0,Slices:  30.0 ,calories:  180.0 
Item:  ID :12 Name :oregonBread Price 6.0,Slices:  40.0 ,calories:  200.0 




------------The Items in the Store are going to be sorted----------


	   !!!!!!!!! Sort by price.!!!!!!!! 

Item:  ID :4 Name :Tesla Price 6000.0,Rating:  7.5 
Item:  ID :3 Name :Google Price 5000.0,Rating:  6.5 
Item:  ID :2 Name :Microsoft Price 3000.0,Rating:  5.5 
Item:  ID :1 Name :Apple Price 2000.0,Rating:  4.5 

	 !!!!!!!!!Sort by ID.!!!!!!!!!! 

Item:  ID :5 Name :Harvest Price 5.0,Slices:  7.0 
Item:  ID :6 Name :Brittania Price 6.0,Slices:  8.0 
Item:  ID :7 Name :Mother Price 7.0,Slices:  9.0 
Item:  ID :8 Name :bakersClub Price 8.0,Slices:  10.0 

	 !!!!!!!!!!Sort by calories.!!!!!!!!!! 

Item:  ID :12 Name :oregonBread Price 6.0,Slices:  40.0 ,calories:  200.0 
Item:  ID :11 Name :miamiBread Price 7.0,Slices:  30.0 ,calories:  180.0 
Item:  ID :10 Name :caliBread Price 8.0,Slices:  20.0 ,calories:  150.0 
Item:  ID :9 Name :bostonBread Price 10.0,Slices:  10.0 ,calories:  100.0 


 -----Items are being removed from the store--------------- 

------------Store has been cleared off--------   

*/




