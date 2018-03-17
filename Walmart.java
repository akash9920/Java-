package edu.neu.csye6200;

import java.util.ArrayList;
import java.util.List;



public class Walmart extends Store {

	
	
	static List<LiteBread> LiteBreadList =new ArrayList<LiteBread>();
	static List<Item> electronicsList =new ArrayList<Item>();
	static List<Item> BreadList =new ArrayList<Item>();
	
	
	public static void demo1() {
		
		
		ElectronicsFactory obj = new ElectronicsFactory();
		
		System.out.println("this is the starting of demo1() electronics-----\n");
		
		Item I1 = obj.CreateElectronics(1,"Apple" , 2000.0, 4.5);
		Item I2 = obj.CreateElectronics(2,"Microsoft" , 3000.0, 5.5);
		Item I3 = obj.CreateElectronics(3,"Google" , 5000.0, 6.5);
		Item I4 = obj.CreateElectronics(4,"Tesla" , 6000.0, 7.5);
		
		electronicsList.add(I1);
		electronicsList.add(I2);
		electronicsList.add(I3);
		electronicsList.add(I4);
			
	}
	
	public void showElectronicInventory() {
		
		System.out.println("---------------Electronics List------------------------\n");
		
		System.out.println("no of Electronics Item are: " + electronicsList.size() + " \n");
		for (Item E : electronicsList) {
			E.showItem();
		}
		
		System.out.println("\n");
		
	}
	
	
	
	public void sortElectronicItem() {
		
		System.out.println("\n\t   !!!!!!!!! Sort by price.!!!!!!!! \n");	
			electronicsList.sort((e1,e2)-> e2.getPrice().compareTo(e1.getPrice()));
			electronicsList.forEach(System.out::println);
			
	}
	
	public static void demo2() {
		
		BreadFactory obj = new BreadFactory();
		
		System.out.println("this is the starting of demo2() Bread-----\n");
		
		Item B1 = obj.creatBread(5, "Harvest", 5.0, 7.0);
		Item B2 = obj.creatBread(6, "Brittania", 6.0, 8.0);
		Item B3 = obj.creatBread(7, "Mother", 7.0, 9.0);
		Item B4 = obj.creatBread(8, "bakersClub", 8.0, 10.0);
		
		BreadList.add(B1);
		BreadList.add(B2);
		BreadList.add(B3);
		BreadList.add(B4);
	}
	
	public void showBreadInventory() {
		
		System.out.println("---------------Bread List------------------------\n");
		
		System.out.println("no of Bread Item are: " + BreadList.size() + " \n");
		for (Item B : BreadList) {
			B.showItem();
		}
		
		System.out.println("\n");
	}
	
	
	public void sortBread() {
		
		System.out.println("\n\t !!!!!!!!!Sort by ID.!!!!!!!!!! \n");
		BreadList.sort((b1,b2)-> b1.getId().compareTo(b2.getId())); 	
		BreadList.forEach(System.out::println);
	}
	
	
	
	public static void demo3() {
		
		LiteBreadFactory obj = new LiteBreadFactory();
		
		System.out.println("this is the starting of demo3() Bread-----\n");
		
		LiteBread L1 = obj.CreateLiteBread(9, "bostonBread", 10.0, 10.0,100.0);
		LiteBread L2 = obj.CreateLiteBread(10, "caliBread", 8.0, 20.0,150.0);
		LiteBread L3 = obj.CreateLiteBread(11, "miamiBread", 7.0, 30.0,180.0);
		LiteBread L4 = obj.CreateLiteBread(12, "oregonBread", 6.0,40.0, 200.0);
		
		LiteBreadList.add(L1);
		LiteBreadList.add(L2);
		LiteBreadList.add(L3);
		LiteBreadList.add(L4);
	}
	
	public  void showLiteBreadInventory() {
		
		
		
		
		System.out.println("---------------Lite Bread List------------------------\n");
				
		System.out.println("no of LiteBreads are: " + LiteBreadList.size() + " \n ");
		for (Item L : LiteBreadList) {
			L.showItem();
		}
		
		System.out.println("\n");
	
	}
	
	public void sortLiteBread() {
		
		System.out.println("\n\t !!!!!!!!!!Sort by calories.!!!!!!!!!! \n");
		LiteBreadList.sort((l1,l2)-> l2.getCalories().compareTo(l1.getCalories()));
		LiteBreadList.forEach(System.out::println);
		
	}
	
	

	
	
	@Override
	public void show() {
		
		System.out.println(this.getInventoryInfo());
		
	}

	@Override
	public String getInventoryInfo() {
		
		String info;
		
		Integer I = LiteBreadList.size()+BreadList.size()+electronicsList.size();
		
		
		
		
		info = ("total number of items in the store are:		" + I +"\n" );
		
		return info;
		
	}

	@Override
	public void sortInventory() {
		
		System.out.println("------------The Items in the Store are going to be sorted----------\n");
		
		sortElectronicItem();
		sortBread();
		sortLiteBread();
		
	}

	@Override
	public void clearInventory() {
		
		
		System.out.println(" -----Items are being removed from the store--------------- \n");
		
		electronicsList.clear();
		BreadList.clear();
		LiteBreadList.clear();
		
		System.out.println("------------Store has been cleared off--------   \n");
		
	}

	@Override
	public void showInventory() {
		
		System.out.println("--------------Soon you are going to see the inventory ------------\n");
		
		showElectronicInventory();
		showBreadInventory();
		showLiteBreadInventory();
		
	}
	
}
