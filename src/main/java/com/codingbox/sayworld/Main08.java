//package com.codingbox.sayworld;
//
//
//import com.codingbox.sayworld.entity.Boardfriend;
//import com.codingbox.sayworld.entity.Customer;
//import com.codingbox.sayworld.entity.Home;
//import com.codingbox.sayworld.entity.QBoardfriend;
//import com.codingbox.sayworld.entity.QHome;
//import com.querydsl.jpa.impl.JPAQueryFactory;
//
//import jakarta.persistence.EntityManager;
//import jakarta.persistence.EntityManagerFactory;
//import jakarta.persistence.EntityTransaction;
//import jakarta.persistence.Persistence;
//
//import java.time.LocalDate;
//import java.util.List;
//
//public class Main08 {
//
//    public static void main(String[] args) {
//        EntityManagerFactory emf = Persistence.createEntityManagerFactory("hello");
//        EntityManager em = emf.createEntityManager();
//        JPAQueryFactory queryFactory = new JPAQueryFactory(em);
//
//        EntityTransaction tx = em.getTransaction();
//        tx.begin();
//
//        try {
//            // 데이터 추가
//        	Customer userA = new Customer("y4k1", "1234", "1234", "송화준", "남자", 1985, 12, 13, "01043763874", 10, "avatar1.png", "T");
//            em.persist(userA);
//
//            Home home = new Home(1, 12, "asd", "asdas", "이순신", "원균",  "223", userA);
//            em.persist(home);
//
//            Boardfriend boardfriend = new Boardfriend("John", "https://example.com/john", home);
//            em.persist(boardfriend);
//
//            // 트랜잭션 커밋
//            tx.commit();
//
//            // 데이터 조회
//           List<Home> homes = queryFactory
//                    .selectFrom(QHome.home)
//                    .fetch();
//            for (Home h : homes) {
//                System.out.println("Home ID: " + h.getId());
//                System.out.println("Customer Name: " + h.getCustomer().getName());
//                System.out.println("Friend: " + h.getFriend());
//            }
//
//            List<Boardfriend> boardfriends = queryFactory
//                    .selectFrom(QBoardfriend.boardfriend)
//                    .fetch();
//            for (Boardfriend bf : boardfriends) {
//                System.out.println("Friend: " + bf.getFriends());
//                System.out.println("Friend URL: " + bf.getFriendurl());
//                System.out.println("Related Home ID: " + bf.getHome().getId());
//            }
//        } catch (Exception e) {
//            tx.rollback();
//            e.printStackTrace();
//        } finally {
//            em.close();
//            emf.close();
//        }
//    }
//}
