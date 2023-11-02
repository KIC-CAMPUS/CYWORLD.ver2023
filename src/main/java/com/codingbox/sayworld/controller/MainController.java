package com.codingbox.sayworld.controller;


import java.io.IOException;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.codingbox.sayworld.entity.Customer;

import com.codingbox.sayworld.entity.Home;
import com.codingbox.sayworld.entity.MyItem;

import com.codingbox.sayworld.service.MainService;

import lombok.RequiredArgsConstructor;

@Controller
@RequestMapping("/myhome")
@RequiredArgsConstructor
public class MainController {

    private final MainService mainService;

    @GetMapping("/myhome/{user_id}")
    public String userProfile(@PathVariable("user_id") Long userId, Model model) {
    	 Customer customer = mainService.getCustomerById(userId);
    	  model.addAttribute("customer", customer);

        // Home 정보를 가져와 모델에 추가
        Home home = mainService.getHomeInfoByCustomerId(customer.getId());
        model.addAttribute("home", home);
        
        // MyItem 정보를 가져와 모델에 추가
        MyItem myItem = mainService.getMyItemInfoByCustomerId(customer.getId());
        model.addAttribute("myItem", myItem);
        
        // GuestBook 정보를 가져와 모델에 추가
//        GuestBook guestBooks = mainService.getGuestBooksByHomeId(home.getId());
//        model.addAttribute("guestBooks", guestBooks);
        
        return "myhome/myhome";
    }
  
}
