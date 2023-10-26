package com.codingbox.sayworld5.main;


import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


import com.codingbox.sayworld5.dto.Home;
import com.codingbox.sayworld5.dto.Board;
import com.codingbox.sayworld5.dto.Customer;
import com.querydsl.core.Tuple;
import com.querydsl.jpa.impl.JPAQueryFactory;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class Main01 {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("hello");
		EntityManager em = emf.createEntityManager();
		JPAQueryFactory queryFactory = new JPAQueryFactory(em);
		EntityTransaction tx = em.getTransaction();
		tx.begin();

		try {
			
//			List<Customer> customers = new ArrayList<>();
//
//			customers.add(new Customer("y4k1","1234", "송화준", "남자" , LocalDate.now() , "01043763874", 10, "avatar1.png"));
//			customers.add(new Customer("y4k2", "1234", "김영환", "남자" , LocalDate.now() , "01023213214", 50, "avatar2.png"));
//			customers.add(new Customer("y4k3", "1234", "이동현", "남자" , LocalDate.now() , "01011113243", 150, "avatar3.png"));
//			customers.add(new Customer("y4k4", "1234", "김아람", "여자" , LocalDate.now() , "01065432342", 100, "avatar4.png"));
//			customers.add(new Customer("y4k5", "1234", "김수빈", "남자" , LocalDate.now() , "01075434324", 50, "avatar5.png"));
//			customers.add(new Customer("y4k6", "1234", "하승우", "남자" , LocalDate.now() , "01054323211", 30, "avatar6.png"));
			Customer userA = new Customer("y4k1","1234", "송화준", "남자" , LocalDate.now() , "01043763874", 10, "avatar1.png");
			Customer userB = new Customer("y4k2", "1234", "김영환", "남자" , LocalDate.now() , "01023213214", 50, "avatar2.png");
			Customer userC = new Customer("y4k3", "1234", "이동현", "남자" , LocalDate.now() , "01011113243", 150, "avatar3.png");
			Customer userD = new Customer("y4k4", "1234", "김아람", "여자" , LocalDate.now() , "01065432342", 100, "avatar4.png");
			Customer userE = new Customer("y4k5", "1234", "김수빈", "남자" , LocalDate.now() , "01075434324", 50, "avatar5.png");
			Customer userF = new Customer("y4k6", "1234", "하승우", "남자" , LocalDate.now() , "01054323211", 30, "avatar6.png");
			em.persist(userA);
			em.persist(userB);
			em.persist(userC);
			em.persist(userD);
			em.persist(userE);
			em.persist(userF);
			
			Home user1 = new Home(1, 12, "사진1.png", "asdas", "안녕", "이순신", userA);
			Home user2 = new Home(2, 22, "사진2.png", "asadas", "안녕하세요", "이황", userB);
			Home user3 = new Home(4, 56, "사진3.png", "asdas", "안녕하쇼", "장보고", userC);
			Home user4 = new Home(10, 42, "사진4.png", "asdas", "안뇽", "세종대왕", userD);
			Home user5 = new Home(3, 25, "사진5.png", "asdas", "하이", "장영실", userE);
			Home user6 = new Home(11, 89, "사진6.png", "asdas", "렐로우", "광개토대왕", userF);
			
			em.persist(user1);
			em.persist(user2);
			em.persist(user3);
			em.persist(user4);
			em.persist(user5);
			em.persist(user6);
			
		
			
			//초기화
			em.flush();
			em.clear();
			
			//확인
			List<Home> homes = em.createQuery("select h from Home h",Home.class)
					.getResultList();
			
			
			
			for(Home home : homes) {
				System.out.println("home = " + home);
				System.out.println("-> home.customer = " + home.getCustomer());
			}
			
		
	
			tx.commit();	
		}catch(Exception e) {
			tx.rollback();
			e.printStackTrace();
		}finally {
			em.close();
			emf.close();
		}
		
		}	
	}


