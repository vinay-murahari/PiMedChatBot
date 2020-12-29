package com.vinay.plasmit.Controller;

import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vinay.plasmit.entity.Customer;
import com.vinay.plasmit.repository.CustomerRepository;

@RestController
@RequestMapping("/v1")
public class CustomerController {
	private static final Logger logger = LoggerFactory.getLogger(CustomerController.class);
	@Autowired
	private CustomerRepository customerRepository;
	
	@GetMapping("/customer/{customerId}")
	public Customer findCustomer(@PathVariable int customerId){
		logger.info("Finding Customer Phone Number in the database");
		Optional<Customer> customer = customerRepository.findById(customerId);
		if(customer.isPresent()) {
			return customer.get();
		}
		else {
			logger.error("There is no record for the given CustomerId: " +customerId);
			throw new RuntimeException("customer not found for the given Id " + customerId);
		}
	}
	@GetMapping("/phone/{customerPhoneNumber}")
	public Customer findCustomerPhoneNumber(@PathVariable int customerPhoneNumber){
		logger.info("Finding Customer Phone Number in the database");
		Optional<Customer> customer = customerRepository.findById(customerPhoneNumber);
		if(customer.isPresent()) {
			return customer.get();
		}
		else {
			logger.error("There is no record for the given CustomerPhoneNumber: " +customerPhoneNumber);
			throw new RuntimeException("customer phone number not found for the phone number " + customerPhoneNumber);
		}
	}

}
