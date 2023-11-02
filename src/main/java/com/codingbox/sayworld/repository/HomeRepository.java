//package com.codingbox.sayworld.repository;
//
//import java.util.List;
//
//import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.stereotype.Repository;
//import com.codingbox.sayworld.entity.Home;
//
//@Repository
//public interface HomeRepository extends JpaRepository<Home, Long> {
//
////    @Query("SELECT h FROM Home h JOIN FETCH h.customer c JOIN FETCH h.myItem m")
////    List<Home> findJoinedDataWithQueryDSL(); // 메서드 이름 수정
//}