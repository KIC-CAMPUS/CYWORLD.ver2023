package com.codingbox.sayworld.service;

import org.springframework.stereotype.Service;

import com.codingbox.sayworld.dto.CustomerDTO;

import com.codingbox.sayworld.entity.Customer;

import com.codingbox.sayworld.entity.Home;
import com.codingbox.sayworld.entity.MyItem;
import com.codingbox.sayworld.repository.MainRepository;

@Service
public class MainService {

    private final MainRepository mainRepository;

    
    public MainService(MainRepository mainRepository) {
        this.mainRepository = mainRepository;
    }

    public Customer getCustomerById(Long id) {
        return mainRepository.findById(id).orElse(null);
    }

    // 새로운 메소드: CustomerDTO를 Customer 엔티티로 변환
    public Customer convertCustomerDtoToEntity(CustomerDTO customerDTO) {
        Customer customer = new Customer();
        customer.setMemberId(customerDTO.getMemberId());
        customer.setName(customerDTO.getName());
        customer.setGender(customerDTO.getGender());
        customer.setYear(customerDTO.getYear());
        customer.setMonth(customerDTO.getMonth());
        customer.setDay(customerDTO.getDay());
        return customer;
    }

    // 새로운 메소드: Home 정보 가져오기
    public Home getHomeInfoByCustomerId(Long customerId) {
        return mainRepository.findHomeByCustomerId(customerId);
    }

    // 새로운 메소드: MyItem 정보 가져오기
    public MyItem getMyItemInfoByCustomerId(Long customerId) {
        return mainRepository.findMyItemByCustomerId(customerId);
    }

	
    
//    public GuestBook getGuestBooksByHomeId(Long homeId) {
//        return mainRepository.findGuestBooksByHomeId(homeId);
//    }
//    
}