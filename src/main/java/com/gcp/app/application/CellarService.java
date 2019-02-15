package com.gcp.app.application;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Service;

import com.gcp.app.rest.domain.request.CustomerRQ;
import com.gcp.app.rest.domain.response.CustomerRS;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


@Service
public class CellarService {

	private List<CustomerRS> customertList;
	private static final Logger logger = LoggerFactory.getLogger(CellarService.class);
	
	@PostConstruct
	private void loadProducts() {

		customertList = new ArrayList<>();
		customertList.add(new CustomerRS(1, "Andrew Farrell", 19, false));
		customertList.add(new CustomerRS(2, "Peter Wallace", 200, true));
	}

	public List<CustomerRS> getAllProducts() {
		 logger.info(".:: Totals of Customer is:"+ customertList.size());
		return customertList;
	}

	public Boolean addProduct(CustomerRQ product) {
		
		 logger.info(".:: Apply Addgin new Customer : {}", product);
		 
		customertList.add(new CustomerRS(customertList.size() + 1, product.getFullName(), product.getAge(),
				product.isFrequent()));
		return true;
	}

	public Boolean discard(Integer idprd) {

		 logger.info(".:: Apply discard Customer with id: "+idprd);
		Optional<CustomerRS> rs = customertList.stream().filter(product -> product.getIdCustomer() == idprd).findFirst();
		return customertList.remove(rs.get());
	}
}
