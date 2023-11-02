package com.codingbox.sayworld.repository;

import org.springframework.data.jpa.repository.JpaRepository;


import com.codingbox.sayworld.dto.CustomerDTO;
import com.codingbox.sayworld.entity.Customer;


public interface CustomerFixRepository extends JpaRepository<Customer, Long> {

	void save(CustomerDTO customer);
	
}


