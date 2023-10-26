//package com.codingbox.sayworld5.service;
//
//import java.util.List;
//
//import org.springframework.stereotype.Service;
//
//import com.codingbox.sayworld5.dto.User;
//import com.codingbox.sayworld5.repository.SayRepository;
//
//import jakarta.transaction.Transactional;
//import lombok.RequiredArgsConstructor;
//
//@Service
//@RequiredArgsConstructor
//public class SayService {
//
//		private final SayRepository sayrepository;
//		
//		@Transactional
//		public Long join(User user) {
//			sayrepository.save(user);
//			return user.getUser_id();
//		}
//		
//		@Transactional
//		public List<user> findMembers() {
//			return sayrepository.findAll();
//		}
//	
//}
