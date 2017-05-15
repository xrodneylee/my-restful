package org.guanpu.service;

import java.util.List;

import org.guanpu.dao.CustomerRepository;
import org.guanpu.entity.Customer;
import org.springframework.beans.factory.annotation.Autowired;

public class SomeClient {

	@Autowired
	private CustomerRepository customerRepository;

	public void doSomething() {
		List<Customer> customer = customerRepository.findByLastName("guanpu");
	}
}
