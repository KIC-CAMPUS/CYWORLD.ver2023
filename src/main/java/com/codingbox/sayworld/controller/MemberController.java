package com.codingbox.sayworld.controller;


import org.springframework.stereotype.Controller;


import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.codingbox.sayworld.domain.LoginForm;
import com.codingbox.sayworld.domain.MemberForm;
import com.codingbox.sayworld.entity.Customer;
import com.codingbox.sayworld.service.MemberService;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Controller
@RequestMapping("/members")
@RequiredArgsConstructor
@Slf4j
public class MemberController {
	
	private final MemberService memberService;
	
	
	 
	@GetMapping("/login")
	public String loginForm(@ModelAttribute("loginForm") LoginForm form){
		return "members/login";
	}
	
	@PostMapping("/login")
	public String login(@ModelAttribute LoginForm form, Model model, RedirectAttributes redirectAttrs, HttpServletRequest request) {
		HttpSession session = request.getSession();
		Customer loginMember = memberService.login(form.getMemberId(), form.getPassword(), session);
		System.out.println(loginMember);
		if( loginMember == null ) {
 			model.addAttribute("msg", "로그인 실패");
			return "members/login";
		} else {
			// 로그인 성공 시
			
			session.setAttribute(SessionConst.LOGIN_MEMBER, loginMember);

		    redirectAttrs.addFlashAttribute("msg", "로그인 성공");
		    return "redirect:/myhome/myhome/"+ loginMember.getId();
		}
	}
	

	

	@GetMapping("/add")
	public String addForm(Model model) {
		model.addAttribute("customer", new Customer());
		return "members/join";
	}
	
	
	@PostMapping("checkId")
	@ResponseBody
	public String checkId(@RequestParam String memberId) {
	    boolean isIdAvailable = isUserIdAvailable(memberId);
	    if (isIdAvailable) {
	      return "available";
	    } else {
	      return "exists";
	    }
	  }
	
	  private boolean isUserIdAvailable(String memberId) {
	    Customer existingMember = memberService.findMemberByUserId(memberId);
	    return existingMember == null;
	  }
	
	
	@PostMapping("/add")
	public String create(@Valid MemberForm form, BindingResult result) 
			throws IllegalAccessException {
		
		if( result.hasErrors() ) {
			return "members/join";
		}
		
		
		Customer customer = new Customer();
		customer.setMemberId(form.getMemberId());
		customer.setPassword(form.getPassword());
		customer.setPassword_re(form.getPassword_re());
		customer.setName(form.getName());
		customer.setGender(form.getGender());
		customer.setYear(form.getYear());
		customer.setMonth(form.getMonth());
		customer.setDay(form.getDay());
		customer.setPhone(form.getPhone());
		
		memberService.join(customer);
		
		return "redirect:/";
	}
	
	
	@GetMapping("findid")
	public String findId(Model model) {
		model.addAttribute("customer", new Customer());
		return "members/findId";
	}
	
	@PostMapping("/findId")
    @ResponseBody
    public String findId(
        @RequestParam String name,
        @RequestParam String phone,
        @RequestParam String year,
        @RequestParam String month,
        @RequestParam String day
    ) {
        return memberService.findMemberId(name, phone, year, month, day);
    }

	@PostMapping("/findPw")
    @ResponseBody
    public String findPw(
        @RequestParam String memberId,
        @RequestParam String name,
        @RequestParam String phone,
        @RequestParam String year,
        @RequestParam String month,
        @RequestParam String day
    ) {
        return memberService.findMemberPw(memberId, name, phone, year, month, day);
    }



	@GetMapping("findpw")
	public String findPw(Model model) {
		model.addAttribute("customer", new Customer());
		return "members/findpw";
	}
	
	@GetMapping("list")
	public String list (Model model) {
		return"board/BoardList";
}
}