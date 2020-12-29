package com.vinay.plasmit.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vinay.plasmit.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer,Integer>{	
	

}
