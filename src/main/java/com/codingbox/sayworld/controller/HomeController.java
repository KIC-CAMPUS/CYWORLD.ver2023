package com.codingbox.sayworld.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.codingbox.sayworld.domain.LoginForm;



@Controller
public class HomeController {
    @GetMapping
    public String home(@ModelAttribute LoginForm loginForm) {
        return "members/login";
    }
}
	 
