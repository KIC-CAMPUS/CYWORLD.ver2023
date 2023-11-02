package com.codingbox.sayworld;

import java.time.LocalDate;
import java.util.List;

import com.codingbox.sayworld.entity.Customer;
import com.codingbox.sayworld.entity.GuestBook;
import com.codingbox.sayworld.entity.Home;
import com.codingbox.sayworld.entity.QGuestBook;
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
            // Create and persist Customer objects
        	Customer userA = new Customer("y4k1", "1234", "1234", "송화준", "남자", 1985, 12, 13, "01043763874", 10 ,"T");
           
            em.persist(userA);
           

            // Create and persist Home objects
            Home userA1 = new Home(1, 12, "사진1.png", "asdas", "안녕", "이순신", "장보고", "강감찬", "4", "2", "1", "1", userA);
            
            em.persist(userA1);
            

            // Create and persist GuestBook objects
            GuestBook userC = new GuestBook(LocalDate.now(), "안녕하십니까?", userA1);
            
            em.persist(userC);
            

            // Flush and clear
            em.flush();
            em.clear();

            // Query using QueryDSL
            List<GuestBook> guestBooks = queryFactory
                    .selectFrom(QGuestBook.guestBook)
                    .fetch();

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
    }
}