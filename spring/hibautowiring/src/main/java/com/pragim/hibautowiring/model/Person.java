package com.pragim.hibautowiring.model;

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

	public void setMobile(Mobile mobile) {
		this.mobile = mobile;
	}
	
	
	
	public void buyMobile(){
		System.out.println("Person name : "+perName);
		System.out.println("Person name : "+addr);
		mobile.showSpecs();
	}

	/*public Person(Mobile mobile) {
		super();
		this.mobile = mobile;
	}*/

	public Person() {
		super();
	}

}
