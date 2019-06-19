package com.intershala.javaapp;

public class Pastry extends Cake{
	@Override
	void display() {
		System.out.println(getName()+" : "+getPrice()+" per piece");
	}
}
