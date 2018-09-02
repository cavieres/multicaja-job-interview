package com.multicaja.customer.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.multicaja.customer.models.Customer;
import com.multicaja.customer.repositories.CustomerRepository;

@RestController
@RequestMapping("/api/v1/customers")
public class CustomersController {
	
	@Autowired
	private CustomerRepository customerRepository;
	
	
	@GetMapping
	public List<Customer> list() {
		return customerRepository.findAll();
	}
	
	@PostMapping
	@ResponseStatus(HttpStatus.OK)
	public void create(@RequestBody Customer customer) {
		customerRepository.save(customer);
	}
	
	@GetMapping("/{id}")
	public Customer get(@PathVariable("id") long id) {
		return customerRepository.getOne(id);
	}
}
