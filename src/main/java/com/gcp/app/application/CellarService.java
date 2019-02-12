package com.gcp.app.application;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Service;

import com.gcp.app.rest.domain.response.ProductRQ;
import com.gcp.app.rest.domain.response.ProductRS;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


@Service
public class CellarService {

	private List<ProductRS> productList;
	private static final Logger logger = LoggerFactory.getLogger(CellarService.class);
	
	@PostConstruct
	private void loadProducts() {

		productList = new ArrayList<>();
		productList.add(new ProductRS(1, "Primer Libro", 100, false));
		productList.add(new ProductRS(2, "Libro Para Estudio", 200, true));
	}

	public List<ProductRS> getAllProducts() {
		 logger.info(".:: Totals of Products is:"+ productList.size());
		return productList;
	}

	public Boolean addProduct(ProductRQ product) {
		
		 logger.info(".:: Apply Addgin new Product : {}", product);
		 
		productList.add(new ProductRS(productList.size() + 1, product.getDescription(), product.getStock(),
				product.isPaidForView()));
		return true;
	}

	public Boolean discard(Integer idprd) {

		 logger.info(".:: Apply discard Product with id: "+idprd);
		Optional<ProductRS> rs = productList.stream().filter(product -> product.getIdProduct() == idprd).findFirst();
		return productList.remove(rs.get());
	}
}
