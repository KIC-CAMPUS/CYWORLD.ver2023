package com.codingbox.sayworld.service;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.codingbox.sayworld.dto.CustomerDTO;
import com.codingbox.sayworld.entity.Customer;
import com.codingbox.sayworld.repository.CustomerFixRepository;

@Service
public class CustomerService {

	private final CustomerFixRepository customerFixRepository;

    @Autowired
    public CustomerService(CustomerFixRepository customerFixRepository) {
        this.customerFixRepository = customerFixRepository;
    }

    public Customer getCustomerById(Long id) {
        return customerFixRepository.findById(id).orElse(null);
    }

    public void updateCustomer(CustomerDTO customer) {
        customerFixRepository.save(customer);
    }
    
    public CustomerDTO convertEntityToDTO(CustomerDTO customerDTO2) {
        CustomerDTO customerDTO = new CustomerDTO();
        customerDTO.setMemberId(customerDTO2.getMemberId());
        customerDTO.setPassword(customerDTO2.getPassword());
        customerDTO.setName(customerDTO2.getName());
        customerDTO.setGender(customerDTO2.getGender());
        customerDTO.setYear(customerDTO2.getYear());
        customerDTO.setMonth(customerDTO2.getMonth());
        customerDTO.setDay(customerDTO2.getDay());
        customerDTO.setPhone(customerDTO2.getPhone());
        customerDTO.setDotory(customerDTO2.getDotory());
        customerDTO.setMinimi(customerDTO2.getMinimi());
        return customerDTO;
    }

}
