package com.codingbox.sayworld.repository;

import java.util.ArrayList;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.codingbox.sayworld.entity.Customer;

import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import jakarta.servlet.http.HttpSession;
import lombok.RequiredArgsConstructor;



@Repository
@RequiredArgsConstructor
public class MemberRepository {
	
	private static Map<Long, Customer> store = new HashMap<>();
    @Autowired
    private final EntityManager em;

    public void save(Customer customer) {
        em.persist(customer);
    }

    public Customer findMemberByUserId(String memberId) {
        TypedQuery<Customer> query = em.createQuery("select c from Customer c where c.memberId = :memberId", Customer.class);
        query.setParameter("memberId", memberId);
        List<Customer> resultList = query.getResultList();
        return resultList.isEmpty() ? null : resultList.get(0);
    }

    public String findMemberIdByDetails(String name, String phone, String year, String month, String day) {
        TypedQuery<String> query = em.createQuery(
            "SELECT c.memberId FROM Customer c WHERE c.name = :name AND c.phone = :phone AND c.year = :year AND c.month = :month AND c.day = :day",
            String.class
        );
        query.setParameter("name", name);
        query.setParameter("phone", phone);
        query.setParameter("year", year);
        query.setParameter("month", month);
        query.setParameter("day", day);
        List<String> resultList = query.getResultList();
        return resultList.isEmpty() ? null : resultList.get(0);
    }
    
    public String findMemberPwByDetails(String memberId, String name, String phone, String year, String month, String day) {
        TypedQuery<String> query = em.createQuery(
            "SELECT c.password FROM Customer c WHERE c.memberId = :memberId AND c.name = :name AND c.phone = :phone AND c.year = :year AND c.month = :month AND c.day = :day",
            String.class
        );
        query.setParameter("memberId", memberId);
        query.setParameter("name", name);
        query.setParameter("phone", phone);
        query.setParameter("year", year);
        query.setParameter("month", month);
        query.setParameter("day", day);
        List<String> resultList = query.getResultList();
        return resultList.isEmpty() ? null : resultList.get(0);
    }
    
    public Customer findByLoginId(String memberId, HttpSession session) {
	    TypedQuery<Customer> query =
	        em.createQuery("SELECT c FROM Customer c WHERE c.memberId = :memberId", Customer.class);
	    query.setParameter("memberId", memberId);
	    Customer results = query.getSingleResult();

	    if (results != null) {
	    	Customer loginMember = results; // 첫 번째 결과 사용
	      session.setAttribute("loginMember", loginMember);
	      return loginMember;
	    } else {
	      return null;
	    }
}
    
}





