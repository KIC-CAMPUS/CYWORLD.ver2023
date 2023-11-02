//package com.codingbox.sayworld;
//
//import java.util.List;
//
//import com.codingbox.sayworld.entity.Customer;
//import com.codingbox.sayworld.entity.Home;
//import com.codingbox.sayworld.entity.QSurfing;
//import com.codingbox.sayworld.entity.Surfing;
//import com.querydsl.jpa.impl.JPAQueryFactory;
//
//import jakarta.persistence.EntityManager;
//import jakarta.persistence.EntityManagerFactory;
//import jakarta.persistence.EntityTransaction;
//import jakarta.persistence.Persistence;
//
//public class Main05 {
//
//    public static void main(String[] args) {
//        EntityManagerFactory emf = Persistence.createEntityManagerFactory("hello");
//        EntityManager em = emf.createEntityManager();
//        JPAQueryFactory queryFactory = new JPAQueryFactory(em);
//        EntityTransaction tx = em.getTransaction();
//        tx.begin();
//
//        try {
//            // Create and persist Customer objects
//        	Customer userA = new Customer("y4k1", "1234", "1234", "송화준", "남자", 1985, 12, 13, "01043763874", 10, "avatar1.png" ,"T");
//            
//            em.persist(userA);
//            
//
//            // Create and persist Home objects
//            Home userA1 = new Home(1, 12, "asd", "asdas", "이순신", "원균", "34", userA);
//            
//            em.persist(userA1);
//            
//
//            // Create and persist Surfing object
//            Surfing surf = new Surfing(null, null, null, userA1);
//            em.persist(surf);
//
//            // Flush and clear
//            em.flush();
//            em.clear();
//
//            // Query using QueryDSL
//            List<Surfing> surfList = queryFactory
//                    .selectFrom(QSurfing.surfing)
//                    .fetch();
//
//            for (Surfing surfing : surfList) {
//                System.out.println("surf = " + surfing);
//                System.out.println("-> surf.home = " + surfing.getHome());
//            }
//
//            tx.commit();
//        } catch (Exception e) {
//            tx.rollback();
//            e.printStackTrace();
//        } finally {
//            em.close();
//            emf.close();
//        }
//    }
//}