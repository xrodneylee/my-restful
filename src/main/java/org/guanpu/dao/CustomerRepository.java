package org.guanpu.dao;

import java.util.List;

import org.guanpu.entity.Customer;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface CustomerRepository extends PagingAndSortingRepository<Customer, Long> {

	List<Customer> findByLastName(String lastName);
}
