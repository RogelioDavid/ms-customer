package com.gcp.app.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.gcp.app.application.CellarService;
import com.gcp.app.infraestructure.exception.ServiceException;
import com.gcp.app.rest.domain.request.CustomerRQ;
import com.gcp.app.rest.domain.response.CustomerRS;

@RestController
@RequestMapping("/customer")
public class CustomerController {

	
	private final CellarService cellarService;
	
	@Autowired
	public CustomerController(CellarService cellarService) {
		this.cellarService = cellarService;
	}
	
	@RequestMapping(value = "/all", method = RequestMethod.GET)
	public ResponseEntity<List<CustomerRS>> getAllProducts(){
		
		List<CustomerRS> response= cellarService.getAllProducts();
		return (response != null) ? new ResponseEntity<List<CustomerRS>>(response, HttpStatus.OK)
				: new ResponseEntity<List<CustomerRS>>(HttpStatus.NOT_FOUND);
	}
	
	
	@RequestMapping(value = "/customer", method = RequestMethod.POST)
	@ResponseStatus(HttpStatus.OK)
	public ResponseEntity<Boolean> addProducto(@RequestBody final  CustomerRQ product){
		Boolean response = cellarService.addProduct(product);
		return (response != null) ? new ResponseEntity<Boolean>(response, HttpStatus.OK)
				: new ResponseEntity<Boolean>(HttpStatus.NOT_FOUND);
	}
	
	@RequestMapping(value = "/customer/{customer}", method = RequestMethod.DELETE)
	@ResponseStatus(HttpStatus.OK)
	public  ResponseEntity<Boolean> descartarProducto(@PathVariable("customer") Integer idprd) throws ServiceException{
		Boolean response = cellarService.discard(idprd);
		return (response != null) ? new ResponseEntity<Boolean>(response, HttpStatus.OK)
				: new ResponseEntity<Boolean>(HttpStatus.NOT_FOUND);		
	}
}
