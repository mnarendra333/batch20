package com.pragim.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="actor_tab")
public class Actor {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "actor_seq")
    @SequenceGenerator(name = "actor_seq", sequenceName = "actor_seq",allocationSize=1,initialValue=100)
	private int actId;
	private String actName;
	private int age;
	
	
	public Actor(String actName, int age) {
		this.actName = actName;
		this.age = age;
	}


	public int getActId() {
		return actId;
	}


	public String getActName() {
		return actName;
	}


	public int getAge() {
		return age;
	}


	@Override
	public String toString() {
		return "Actor [actId=" + actId + ", actName=" + actName + ", age="
				+ age + "]";
	}
	
	
	
	
	
	
		
	
	
	

}
