//package com.codingbox.sayworld5;
//
//import com.codingbox.sayworld5.dto.User;
//
//import jakarta.persistence.EntityManager;
//import jakarta.persistence.EntityManagerFactory;
//import jakarta.persistence.EntityTransaction;
//import jakarta.persistence.Persistence;
//
//public class JpaMain {
//
//	public static void main(String[] args) {
//		EntityManagerFactory emf = Persistence.createEntityManagerFactory("hello");
//		EntityManager em = emf.createEntityManager();
//		EntityTransaction tx = em.getTransaction();
//
//	     tx.begin();
//
//	        try {
//	            // 엔티티를 생성하고 데이터베이스에 저장
//	            User user = new User();
//	            user.setId("john_doe");
//	            user.setPassword("secret");
//	            user.setName("John Doe");
//
//	            // 엔티티를 영속성 컨텍스트에 저장
//	            em.persist(user);
//
//	            // 트랜잭션 커밋
//	            tx.commit();
//	        } catch (Exception e) {
//	            // 예외 발생 시 롤백
//	            tx.rollback();
//	        } finally {
//		
//		
//		
//		emf.close();
//	}
//}
