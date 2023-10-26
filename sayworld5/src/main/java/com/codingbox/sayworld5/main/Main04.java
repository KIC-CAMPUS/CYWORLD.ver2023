package com.codingbox.sayworld5.main;

import java.time.LocalDate;
import java.util.List;

import com.codingbox.sayworld5.dto.Board;
import com.codingbox.sayworld5.dto.Customer;
import com.codingbox.sayworld5.dto.GuestBook;
import com.codingbox.sayworld5.dto.Home;
import com.querydsl.jpa.impl.JPAQueryFactory;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class Main04 {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("hello");
        EntityManager em = emf.createEntityManager();
        JPAQueryFactory queryFactory = new JPAQueryFactory(em);
        EntityTransaction tx = em.getTransaction();
        tx.begin();

        try {
        	Customer userA = new Customer("y4k1","1234", "송화준", "남자" , LocalDate.now() , "01043763874", 10, "avatar1.png");
			Customer userB = new Customer("y4k2", "1234", "김영환", "남자" , LocalDate.now() , "01023213214", 50, "avatar2.png");
            em.persist(userA);
            em.persist(userB);
       	 
            Home userA1 = new Home(1, 12, "asd", "asdas", "이순신", "원균", userA);
            Home userB1 = new Home(2, 22, "agsd", "asadas", "동동이", "송송이", userB);
            em.persist(userA1);
            em.persist(userB1);
        	
        	
        	// Create and persist Home and Board objects here
            GuestBook userC = new GuestBook(LocalDate.now(), "안녕하십니까?", userA1 );
            GuestBook userD = new GuestBook(LocalDate.now(), "안녕 바보야", userB1 );
            em.persist(userC);
            em.persist(userD);


            // Flush and clear
            em.flush();
            em.clear();

            // Confirm
            List<GuestBook> guestBooks = em.createQuery("select g from GuestBook g", GuestBook.class)
                    .getResultList();

            for (GuestBook guestBook : guestBooks) {
                System.out.println("GuestBook = " + guestBook);
                System.out.println("-> guestBook.home = " + guestBook.getHome());
            }

            tx.commit();
        } catch (Exception e) {
            tx.rollback();
            e.printStackTrace();
        } finally {
            em.close();
            emf.close();
        }
}}