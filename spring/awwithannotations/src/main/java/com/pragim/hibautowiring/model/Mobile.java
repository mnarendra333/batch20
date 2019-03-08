package com.pragim.hibautowiring.model;

import org.springframework.stereotype.Component;

@Component
public class Mobile {
	
	
	private String model;
	private double price;
	private String name;
	
	public void setModel(String model) {
		this.model = model;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	
	public void showSpecs(){
		
		System.out.println("Mobile :"+name);
		System.out.println("model :"+name);
		System.out.println("price :"+name);
	}
	
	
	

}
