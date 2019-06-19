package com.intershala.javaapp;

public class Cake {
	private String name;
	private double price;
	public void setName(String name){
		this.name=name;
	}
	public void setPrice(double price){
		this.price=price;
	}
	public String getName(){
		return this.name;
	}
	public double getPrice(){
		return this.price;
	}
	void display(){
		System.out.println(this.name+" : "+this.price+" per pound");
	}
}
