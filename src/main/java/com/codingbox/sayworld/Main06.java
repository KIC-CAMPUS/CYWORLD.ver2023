//package com.codingbox.sayworld;
//
//import java.util.List;
//
//import com.codingbox.sayworld.entity.Boardfriend;
//import com.codingbox.sayworld.entity.Customer;
//import com.codingbox.sayworld.entity.Home;
//import com.codingbox.sayworld.entity.QBoardfriend;
//import com.querydsl.jpa.impl.JPAQueryFactory;
//
//import jakarta.persistence.EntityManager;
//import jakarta.persistence.EntityManagerFactory;
//import jakarta.persistence.EntityTransaction;
//import jakarta.persistence.Persistence;
//
//public class Main06 {
//
//    public static void main(String[] args) {
//        EntityManagerFactory emf = Persistence.createEntityManagerFactory("hello");
//        EntityManager em = emf.createEntityManager();
//        JPAQueryFactory queryFactory = new JPAQueryFactory(em);
//        EntityTransaction tx = em.getTransaction();
//        tx.begin();
//
//        try {
//            
//        	Customer userA = new Customer("y4k1", "1234", "1234", "송화준", "남자", 1985, 12, 13, "01043763874", 10, "avatar1.png" ,"T");
//            
//            em.persist(userA);
//           
//
//            
//            Home userA1 = new Home(1, 12, "asd", "asdas", "이순신", "원균",  "12", userA);
//            
//            em.persist(userA1);
//            
//
//      
//            Boardfriend bfriends = new Boardfriend(null, null, userA1);
//            em.persist(bfriends);
//
//            
//            em.flush();
//            em.clear();
//
//            
//            List<Boardfriend> friends = queryFactory
//                    .selectFrom(QBoardfriend.boardfriend)
//                    .fetch();
//
//            for (Boardfriend friend : friends) {
//                System.out.println("friend = " + friend);
//                System.out.println("-> friend.home = " + friend.getHome());
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