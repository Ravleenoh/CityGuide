package com.cityguide.guider.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cityguide.guider.entity.Business;
import com.cityguide.guider.entity.Customer;
import com.cityguide.guider.serviceImpl.BusinessServiceImpl;
import com.cityguide.guider.serviceImpl.CustomerServiceImpl;

@RestController
@RequestMapping("/api")
public class Controller {

	@Autowired(required = true)
	private CustomerServiceImpl customerService;


	@Autowired(required = true)
	private BusinessServiceImpl businessServiceImpl;

	@PostMapping("/signinCutomer")
	public Customer signinCustomer(@RequestBody Customer customer) {
		return customerService.signinCustomer(customer);

	}

	@PostMapping("/login/{userName}/{password}")
	public String loginCustomer(@PathVariable String userName, String password) {
		return customerService.login(userName, password);

	}

	@DeleteMapping("/delete/{userName}")
	public void removeCustomer(@PathVariable String userName) {
		customerService.removeCustomer(userName);
	}

	@GetMapping("/getAllCustomers")
	public List<Customer> getAllCustomers() {
		return customerService.fetchCustomerList();

	}

	@GetMapping("/hello")
	public String hello() {
		return "thankgod";

	}

	@GetMapping("/hotels")
	public List<String> getHotels() {

		return businessServiceImpl.getHotels();

	}
}
