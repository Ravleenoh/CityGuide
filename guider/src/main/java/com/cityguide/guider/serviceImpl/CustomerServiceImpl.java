package com.cityguide.guider.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cityguide.guider.entity.Customer;
import com.cityguide.guider.repository.CustomerRepository;


@Service
public class CustomerServiceImpl{

	@Autowired(required = true)
	private CustomerRepository customerRepository;

	public Customer signinCustomer(Customer customer) {
		return customerRepository.save(customer);
	}

	public List<Customer> fetchCustomerList() {
		return (List<Customer>) customerRepository.findAll();
	}

	public String login(String userName, String password) {
		String result = null;
		List<Customer> customers = (List<Customer>) customerRepository.findAll();
		for (int i = 0; i < customers.size(); i++) {
			if (userName.equals(customers.get(i).getUserName())) {
				if (password.equals(customers.get(i).getPassword())) {
					result = "logged in successfully";
				} else {
					result = "wrong password";
				}
			} else {
				result = "no such username found";
			}
		}
		return result;
	}

	public void removeCustomer(String userName) {
		Customer removeCustomer = new Customer();
		List<Customer> customers = (List<Customer>) customerRepository.findAll();
		for (int i = 0; i < customers.size(); i++) {
			if (userName.equals(customers.get(i).getUserName())) {
				removeCustomer = customers.get(i);
			}
		}
		customerRepository.delete(removeCustomer);
	}
}

