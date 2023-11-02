package com.codingbox.sayworld;

import com.codingbox.sayworld.entity.Customer;
import com.codingbox.sayworld.entity.Home;
import com.codingbox.sayworld.entity.QCustomer;
import com.codingbox.sayworld.entity.QHome;
import com.querydsl.core.Tuple;
import com.querydsl.jpa.impl.JPAQueryFactory;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;
import java.util.List;

public class Main01 {

    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("hello");
        EntityManager em = emf.createEntityManager();
        JPAQueryFactory queryFactory = new JPAQueryFactory(em);
        EntityTransaction tx = em.getTransaction();
        tx.begin();

        try {
            Customer userA = new Customer("y4k1", "1234", "1234", "송화준", "남자", 1985, 12, 13, "01043763874", 10, "T");
            
            em.persist(userA);
            

            Home user1 = new Home(1, 12, "사진1.png", "asdas", "안녕", "이순신", "장보고", "강감찬", "4", "2", "1", "1", userA);
            

            em.persist(user1);
            

            // 초기화
            em.flush();
            em.clear();

            // 확인
            List<Tuple> homes = queryFactory.select(QHome.home, QCustomer.customer)
                    .from(QHome.home)
                    .join(QHome.home.customer, QCustomer.customer)
                    .fetch();

            for (Tuple tuple : homes) {
                Home home = tuple.get(QHome.home);
                Customer customer = tuple.get(QCustomer.customer);

                System.out.println("home = " + home);
                System.out.println("customer = " + customer);
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