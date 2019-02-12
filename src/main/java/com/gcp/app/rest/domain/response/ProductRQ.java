package com.gcp.app.rest.domain.response;

import java.io.Serializable;

public class ProductRQ implements Serializable {

	private String  description;
	private int stock;
	private boolean paidForView;
	
	
	public ProductRQ(String description, int stock, boolean paidForView) {
		super();
		this.description = description;
		this.stock = stock;
		this.paidForView = paidForView;
	}
	
	public ProductRQ() {
		// TODO Auto-generated constructor stub
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public boolean isPaidForView() {
		return paidForView;
	}

	public void setPaidForView(boolean paidForView) {
		this.paidForView = paidForView;
	}
	
	
}
