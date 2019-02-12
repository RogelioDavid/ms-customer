package com.gcp.app.domain.sales;

import java.io.Serializable;
import java.util.Date;

public class Sale implements Serializable {

	private Integer idSale;
	private Date appyDate;
	public Sale(Integer idSale, Date appyDate) {
		super();
		this.idSale = idSale;
		this.appyDate = appyDate;
	}
	
	public Sale() {
		// TODO Auto-generated constructor stub
	}

	public Integer getIdSale() {
		return idSale;
	}

	public void setIdSale(Integer idSale) {
		this.idSale = idSale;
	}

	public Date getAppyDate() {
		return appyDate;
	}

	public void setAppyDate(Date appyDate) {
		this.appyDate = appyDate;
	}
	
	
}
