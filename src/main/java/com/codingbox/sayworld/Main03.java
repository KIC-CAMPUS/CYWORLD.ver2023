//package com.codingbox.sayworld;
//
//import java.time.LocalDate;
//import java.util.List;
//
//import com.codingbox.sayworld.entity.Customer;
//import com.codingbox.sayworld.entity.Home;
//import com.codingbox.sayworld.entity.Profiles;
//import com.codingbox.sayworld.entity.QProfiles;
//import com.querydsl.jpa.impl.JPAQuery;
//import com.querydsl.jpa.impl.JPAQueryFactory;
//import com.querydsl.jpa.impl.JPAUpdateClause;
//import com.querydsl.jpa.impl.JPADeleteClause;
//
//import jakarta.persistence.EntityManager;
//import jakarta.persistence.EntityManagerFactory;
//import jakarta.persistence.EntityTransaction;
//import jakarta.persistence.Persistence;
//
//public class Main03 {
//    public static void main(String[] args) {
//    
//        EntityManagerFactory emf = Persistence.createEntityManagerFactory("hello");
//        EntityManager em = emf.createEntityManager();
//        JPAQueryFactory queryFactory = new JPAQueryFactory(em);
//        EntityTransaction tx = em.getTransaction();
//        tx.begin();
//         
//         try {
//             
//        	 Customer userA = new Customer("y4k1", "1234", "1234", "송화준", "남자", 1985, 12, 13, "01043763874", 10, "avatar1.png", "T");
//            
//             em.persist(userA);
//             
//             
//             Home userA1 = new Home(1, 12, "asd", "asdas", "이순신", "원균", "32", userA);
//             
//             em.persist(userA1);
//             
//             
//             Profiles user3 = new Profiles("나의 프로필입니다",  userA1);
//             
//             em.persist(user3);
//             
//             
//             // Flush and clear
//             em.flush();
//             em.clear();
//          
//             // Querydsl 조회
//             List<Profiles> profiless = queryFactory.selectFrom(QProfiles.profiles)
//                 .fetch();
//     
//             for (Profiles profiles : profiless) {
//                 System.out.println("Profiles = " + profiles);
//                 System.out.println("-> profiles.home = " + profiles.getHome());
//             }
//             
//             tx.commit();  
//        } catch (Exception e) {
//            tx.rollback();
//            e.printStackTrace();
//        } finally {
//            em.close();
//            emf.close();
//        }
//    }
//}