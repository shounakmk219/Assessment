package com.bawarchi.client;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import com.bawarchi.comparators.*;
import com.bawarchi.model.Dish;

public class Hotel {
	
	public static void main(String args[]) {
		List<Dish> dishList=new ArrayList<>();
		dishList.add(new Dish(5,"Neer-Dosa",100,50));
		dishList.add(new Dish(2,"Idli-Vada",200,40));
		dishList.add(new Dish(4,"Roti-Curry",250,100));
		dishList.add(new Dish(1,"Dosa",300,50));
		dishList.add(new Dish(3,"Pulav",330,80));
		
		Scanner scan=new Scanner(System.in);
		System.out.println("=============================Welcome==============================\r\n" + 
				"Please choose from the below options \r\n" + 
				"\r\n" + 
				"1 => To sort the dishes in the increasing order of calories\r\n" + 
				"2 => To sort the dishes in the decreasing order of calories\r\n" + 
				"3 => To sort the dishes in the increasing order of price\r\n" + 
				"4 => To sort the dishes in the decreasing order of price \r\n" + 
				"==================================================================\nEnter option: ");
		int sortId=scan.nextInt();
		
		switch(sortId) {
		case 1: Collections.sort(dishList, new CaloriesLTComparator()); break;
		case 2: Collections.sort(dishList, new CaloriesGTComparator()); break;
		case 3: Collections.sort(dishList, new PriceLTComparator()); break;
		case 4: Collections.sort(dishList, new PriceGTComparator()); break;
		}
		
		System.out.println("\nSorted Dish list:\n"+dishList);
		Collections.sort(dishList);
		System.out.println("\n=======Please select the Dish Id and hit enter==========\n"+dishList
				+ "\n============================================================\nEnter Dish Id: ");
		int dishId=scan.nextInt();
		Dish order=null;
		Iterator<Dish> it=dishList.iterator();
		while(it.hasNext()) {
			Dish curDish=it.next();
			if(curDish.getId()==dishId) {
				order=curDish;
				break;
			}
		}
		if(order==null)
			System.out.println("Invalid Dish Id!");
		else {
			System.out.println("==========You have selected "+order.getName()+"! =====================");
			System.out.print("Please enter your name: ");
			String user=scan.next();
			//user=user.substring(0, user.indexOf(" "));
			System.out.print(user+", Please pay the bill of Rs. "+order.getPrice()+"\nEnter amount: ");
			double amountPaid=scan.nextInt();
			amountPaid-=order.getPrice();
			if(amountPaid>0)
				System.out.println("========Thanks for your order. Please collect the change = Rs. "+amountPaid+" ================");
			else if(amountPaid<0)
				System.out.println("===========Amount paid is less than Bill Amount ================");
			else System.out.println("============Thanks for your order. ================\r\n");
		}
	}
	
	

}
