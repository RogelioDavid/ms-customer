package com.gcp.app.rest.domain.response;

import java.io.Serializable;

public class ProductRS implements Serializable {

	private int idProduct;
	private String  description;
	private int stock;
	private boolean paidForView;
	
	
	public ProductRS(int idProduct, String description, int stock, boolean paidForView) {
		super();
		this.idProduct = idProduct;
		this.description = description;
		this.stock = stock;
		this.paidForView = paidForView;
	}
	
	public ProductRS() {
		// TODO Auto-generated constructor stub
	}

	public int getIdProduct() {
		return idProduct;
	}

	public void setIdProduct(int idProduct) {
		this.idProduct = idProduct;
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
