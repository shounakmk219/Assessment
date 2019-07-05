package com.bawarchi.model;

public class Dish implements Comparable<Dish>{
	private int id;
	private String name;
	private double calories;
	private double price;
	
	public Dish(int id, String name, double calories, double price) {
		this.id = id;
		this.name = name;
		this.calories = calories;
		this.price = price;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getCalories() {
		return calories;
	}
	public void setCalories(double calories) {
		this.calories = calories;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public int compareTo(Dish o) {
		return this.id-o.id;
	}
	
	@Override
	public String toString() {
		return "\nDish Id: "+id+", name: "+name+", Price: "+price+",  Calories: "+calories;
	}
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}
}
