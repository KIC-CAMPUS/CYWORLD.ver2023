package com.codingbox.sayworld.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import com.codingbox.sayworld.entity.Customer;
import com.codingbox.sayworld.entity.Home;
import com.codingbox.sayworld.entity.MyItem;

public interface MainRepository extends JpaRepository<Customer, Long> {

	    // Home 정보 가져오기
	    @Query("SELECT h FROM Home h LEFT JOIN FETCH h.customer c WHERE c.id = :customerId")
	    Home findHomeByCustomerId(@Param("customerId") Long customerId);

	    // MyItem 정보 가져오기
	    @Query("SELECT m FROM MyItem m WHERE m.customer.id = :customerId")
	    MyItem findMyItemByCustomerId(@Param("customerId") Long customerId);

	
	    // GuestBook 정보 가져오기
//	    @Query("SELECT g FROM GuestBook g WHERE g.home.customer.id = :customerId")
//	    GuestBook findGuestBooksByHomeId(@Param("customerId") Long customerId);

}
