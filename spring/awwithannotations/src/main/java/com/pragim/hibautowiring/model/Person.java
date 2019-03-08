package com.pragim.hibautowiring.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Person {

	private int perId;
	private String perName;
	private String addr;

	
	private Mobile mobile;

	public void setPerId(int perId) {
		this.perId = perId;
	}

	public void setPerName(String perName) {
		this.perName = perName;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	
	/*public void setMobile(Mobile mobile) {
		this.mobile = mobile;
	}*/
	
	
	
	public void buyMobile(){
		System.out.println("Person name : "+perName);
		System.out.println("Person name : "+addr);
		mobile.showSpecs();
	}

	@Autowired
	public Person(Mobile mobile) {
		System.out.println("inside constuctor");
		//super();
		this.mobile = mobile;
	}

	

}
