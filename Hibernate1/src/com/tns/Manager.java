package com.tns;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity

//single table inheritance
@DiscriminatorValue("MANAGER")


public class Manager extends Employee{
	
	private static final long serialVersionUID =1L;
	
	
	private String depName;
	

	
	public Manager() {
		
	}
	
	public Manager(String depName) {
		
		this.depName = depName;
	}
	
	
	public String getDepName() {
		return depName;
	}
	public void setDepName(String depName) {
		this.depName = depName;
	}
	

}