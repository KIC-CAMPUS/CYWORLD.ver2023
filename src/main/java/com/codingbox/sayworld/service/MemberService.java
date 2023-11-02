package com.codingbox.sayworld.service;


import org.springframework.stereotype.Service;


import org.springframework.transaction.annotation.Transactional;

import com.codingbox.sayworld.entity.Customer;
import com.codingbox.sayworld.repository.MemberRepository;

import jakarta.servlet.http.HttpSession;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class MemberService {
	
	private final MemberRepository memberRepository;

	@Transactional
	public Long join(Customer customer) throws IllegalAccessException {
		memberRepository.save(customer);
		return customer.getId();
	}

	public Customer findMemberByUserId(String memberId) {
		return memberRepository.findMemberByUserId(memberId);
	}
	
	public boolean isUserIdAvailable(String memberId) {
	    Customer existingMember = memberRepository.findMemberByUserId(memberId);
	    return existingMember == null;
	  }
	public String findMemberId(String name, String phone, String year, String month, String day) {
	    String memberId = memberRepository.findMemberIdByDetails(name, phone, year, month, day);
	    if (memberId != null) {
	        return memberId;
	    } else {
	        return "가입된 아이디가 없습니다.";
	    }
	}
	
	public String findMemberPw(String memberId, String name, String phone, String year, String month, String day) {
	    String memberPw = memberRepository.findMemberPwByDetails(memberId, name, phone, year, month, day);
	    if (memberPw != null) {
	        return memberPw;
	    } else {
	        return "가입된 정보가 없습니다.";
	    }
	}

	public Customer login(String memberId, String password, HttpSession session) {
		Customer customer = memberRepository.findByLoginId(memberId,session);
		
		if( customer != null && customer.getPassword().equals(password) ) {
			return customer;
		} else {
			return null;
		}
	}

	
}

