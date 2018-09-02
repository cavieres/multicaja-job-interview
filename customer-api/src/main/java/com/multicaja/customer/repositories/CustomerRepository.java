package com.multicaja.customer.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.multicaja.customer.models.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long> {

}
