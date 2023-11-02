package com.codingbox.sayworld.service;

import java.util.List;


import org.springframework.stereotype.Service;



import com.codingbox.sayworld.entity.Customer;

import com.codingbox.sayworld.entity.Home;
import com.codingbox.sayworld.entity.MyItem;

import com.codingbox.sayworld.repository.SurfRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class SurfService {

	private final SurfRepository surfRepository;

    // 모든 고객 정보 가져오기
    
	public List<Customer> getAllCustomers() {
        return surfRepository.findAllCustomers();
    }

    // Customer ID를 이용하여 Home 정보 가져오기
    public Home getHomeInfoByCustomerId(Long customerId) {
        return surfRepository.findHomeByCustomerId(customerId);
    }

    // Customer ID를 이용하여 MyItem 정보 가져오기
    public MyItem getMyItemInfoByCustomerId(Long customerId) {
        return surfRepository.findMyItemByCustomerId(customerId);
    }
}