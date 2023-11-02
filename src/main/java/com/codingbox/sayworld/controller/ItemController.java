package com.codingbox.sayworld.controller;

import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import com.codingbox.sayworld.dto.ItemDTO;
import com.codingbox.sayworld.service.ItemService;
import jakarta.servlet.http.HttpServletRequest;
import lombok.RequiredArgsConstructor;

@Controller
@RequestMapping("/items")
@RequiredArgsConstructor
public class ItemController {

    private final ItemService itemService; // 생성자 주입 사용

    
    @GetMapping({"minimi","music", "background", "font", "miniroom"})
    public String displayItemList(Model model, HttpServletRequest req) {
    	String path = req.getServletPath();		// 현재 경로 가져오기
    	List<ItemDTO> items = itemService.getAllItems();
    	model.addAttribute("items", items);
    	return path;		// 경로에 맞는 뷰 리턴하기
    }
    
    
}
