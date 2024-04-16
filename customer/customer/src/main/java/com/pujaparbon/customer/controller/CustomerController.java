package com.pujaparbon.customer.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.pujaparbon.customer.beans.Customer;
import com.pujaparbon.customer.service.CustomerService;

@RestController
@RequestMapping("/pujaparbon")
public class CustomerController {
	
	@Autowired
	private CustomerService customerService;
	
	@PostMapping("/createCustomer")
	public ResponseEntity<Customer> RegisterCustomer(@RequestBody Customer request )throws Exception
	{ 
	Customer createdCustomer=	this.customerService.createCustomer(request);
		return new ResponseEntity<>(createdCustomer, HttpStatus.CREATED);
		
	}
	
	@GetMapping("/getAllCustomers")
	public ResponseEntity<List<Customer>> getCustomer()throws Exception
	{ 
		List<Customer> getCustomer=customerService.getAllCustomers();
	//Customer createdCustomer=	this.customerService.createCustomer(request);
		return new ResponseEntity<>(getCustomer, HttpStatus.OK);
		
	}
	
	@GetMapping("/updateCustomers")
	public ResponseEntity<Customer> updateCustomer(@RequestParam int userId,@RequestBody Customer request)throws Exception
	{ 
		Customer updatedCustomer=customerService.updateCustomer(request, userId);
		return new ResponseEntity<>(updatedCustomer, HttpStatus.OK);
		
	}

}
