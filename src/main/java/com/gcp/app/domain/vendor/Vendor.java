package com.gcp.app.domain.vendor;

import java.io.Serializable;

public class Vendor  implements Serializable{

	private Integer id;
	private String name;
	private TypeVendor typeVendor;
	
	public Vendor(Integer id, String name, TypeVendor typeVendor) {
		super();
		this.id = id;
		this.name = name;
		this.typeVendor = typeVendor;
	}
	
	public Vendor() {
		// TODO Auto-generated constructor stub
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public TypeVendor getTypeVendor() {
		return typeVendor;
	}

	public void setTypeVendor(TypeVendor typeVendor) {
		this.typeVendor = typeVendor;
	}
	
	
}
