package com.codingbox.sayworld;

import java.time.LocalDate;
import java.util.List;

import com.codingbox.sayworld.entity.Board;
import com.codingbox.sayworld.entity.Customer;
import com.codingbox.sayworld.entity.Home;
import com.codingbox.sayworld.entity.QBoard;
import com.querydsl.jpa.impl.JPAQueryFactory;
import com.querydsl.jpa.impl.JPAUpdateClause;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class Main02 {

    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("hello");
        EntityManager em = emf.createEntityManager();
        JPAQueryFactory queryFactory = new JPAQueryFactory(em);
        EntityTransaction tx = em.getTransaction();
        tx.begin();

        try {
          
        	Customer userA = new Customer("y4k12132", "ong11234","ong11234", "송화준", "남자", 1985, 12, 13, "01043763874", 10, "T");
           
            em.persist(userA);
           

           
            Home userA1 = new Home(1, 12, "사진1.png", "asdas", "안녕", "이순신", "장보고", "강감찬", "4", "2", "1", "1", userA);
          
            em.persist(userA1);
            

      
            Board user3 = new Board("foldername", "posttitle", "안녕하세요", LocalDate.now(), 12, userA1);
            
            em.persist(user3);
            

         
            em.flush();
            em.clear();

          
            List<Board> boards = queryFactory
                    .selectFrom(QBoard.board)
                    .fetch();

            for (Board board : boards) {
                System.out.println("Board = " + board);
                System.out.println("-> board.home = " + board.getHome());
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