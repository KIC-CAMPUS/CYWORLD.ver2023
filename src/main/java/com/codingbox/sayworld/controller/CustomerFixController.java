package com.codingbox.sayworld.controller;

import org.springframework.stereotype.Controller;


import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.codingbox.sayworld.dto.CustomerDTO;
import com.codingbox.sayworld.entity.Customer;
import com.codingbox.sayworld.service.CustomerService;

import lombok.RequiredArgsConstructor;

@Controller
@RequestMapping("/customer")
@RequiredArgsConstructor
public class CustomerFixController {
    
	private final CustomerService customerService;   
    
	@GetMapping("/Privacy")
    public String userProfile(Model model) {
        Customer customer = customerService.getCustomerById(1L); 
        model.addAttribute("customer", customer);
        return "customer/Privacy"; 
    }

    @PostMapping("/Privacy") 
    public String updateUserProfile(@ModelAttribute CustomerDTO customerDTO) {
        CustomerDTO customer = customerService.convertEntityToDTO(customerDTO);

        customerService.updateCustomer(customer);

        return "redirect:/customer/Privacy"; 
    }
} 
