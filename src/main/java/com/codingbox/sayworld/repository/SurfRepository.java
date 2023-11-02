package com.codingbox.sayworld.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import com.codingbox.sayworld.entity.Customer;
import com.codingbox.sayworld.entity.GuestBook;
import com.codingbox.sayworld.entity.Home;
import com.codingbox.sayworld.entity.MyItem;

public interface SurfRepository extends JpaRepository<Customer, Long> {

	// 모든 고객 정보 가져오기
    @Query("SELECT c FROM Customer c")
    List<Customer> findAllCustomers();

    // Customer ID를 이용하여 Home 정보 가져오기
    @Query("SELECT h FROM Home h WHERE h.customer.id = :customerId")
    Home findHomeByCustomerId(@Param("customerId") Long customerId);

    // Customer ID를 이용하여 MyItem 정보 가져오기
    @Query("SELECT m FROM MyItem m WHERE m.customer.id = :customerId")
    MyItem findMyItemByCustomerId(@Param("customerId") Long customerId);
}
