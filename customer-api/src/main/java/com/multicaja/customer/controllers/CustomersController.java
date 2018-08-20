package com.multicaja.customer.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.multicaja.customer.models.Customer;

@RestController
@RequestMapping("/api/v1/customers")
public class CustomersController {
	
	@GetMapping
	public List<Customer> list() {
		List<Customer> customers = new ArrayList<>();

//		customers.add(new Customer(){
//			{
//				setNombre_completo("Alberto Miranda"); 
//				setRut("2-10");
//			}; 
//		});
//		
//		customers.add(new Customer(){
//			{
//				setNombre_completo("Fernando Lopez"); 
//				setRut("1-9");
//			}; 
//		});
		
		return customers;
	}
	
	@PostMapping
	@ResponseStatus(HttpStatus.OK)
	public void create(@RequestBody Customer customer) {
		
	}
	
	@GetMapping("/{id}")
	public Customer get(@PathVariable("id") long id) {
		return new Customer();
	}
}
