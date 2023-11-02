package com.codingbox.sayworld.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.codingbox.sayworld.entity.Customer;
import com.codingbox.sayworld.entity.Home;
import com.codingbox.sayworld.entity.MyItem;
import com.codingbox.sayworld.service.MainService;

import lombok.RequiredArgsConstructor;

@Controller
@RequestMapping("/surfing")
@RequiredArgsConstructor
public class SurfingController {

    private final MainService mainService;

    @GetMapping("/surfingboard")
    public String userProfile(Model model) {
        Customer customer = mainService.getCustomerById(1L);
        model.addAttribute("customer", customer);

        // Home 정보를 가져와 모델에 추가
        Home home = mainService.getHomeInfoByCustomerId(customer.getId());
        model.addAttribute("home", home);
        
        // MyItem 정보를 가져와 모델에 추가
        MyItem myItem = mainService.getMyItemInfoByCustomerId(customer.getId());
        model.addAttribute("myItem", myItem);
        
        return "surfing/surfingboard";
    }
    
}
