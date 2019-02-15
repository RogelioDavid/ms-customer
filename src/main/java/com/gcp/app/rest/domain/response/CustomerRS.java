package com.gcp.app.rest.domain.response;

import java.io.Serializable;

public class CustomerRS implements Serializable {

	private int idCustomer;
	private String  fullName;
	private int age;
	private boolean frequent;
	public CustomerRS(int idCustomer, String fullName, int age, boolean frequent) {
		super();
		this.idCustomer = idCustomer;
		this.fullName = fullName;
		this.age = age;
		this.frequent = frequent;
	}
	public int getIdCustomer() {
		return idCustomer;
	}
	public void setIdCustomer(int idCustomer) {
		this.idCustomer = idCustomer;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public boolean isFrequent() {
		return frequent;
	}
	public void setFrequent(boolean frequent) {
		this.frequent = frequent;
	}
	@Override
	public String toString() {
		return "CustomerRS [idCustomer=" + idCustomer + ", fullName=" + fullName + ", age=" + age + ", frequent="
				+ frequent + "]";
	}
	
	
	 
	
	
}
