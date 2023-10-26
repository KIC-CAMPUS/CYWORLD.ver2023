package com.codingbox.sayworld5.main;

import java.time.LocalDate;
import java.util.List;

import com.codingbox.sayworld5.dto.Customer;
import com.codingbox.sayworld5.dto.Home;
import com.codingbox.sayworld5.dto.MyItem;
import com.codingbox.sayworld5.dto.Orders;
import com.codingbox.sayworld5.dto.QCart;
import com.codingbox.sayworld5.dto.QCustomer;
import com.codingbox.sayworld5.dto.QItem;
import com.codingbox.sayworld5.dto.QMyItem;
import com.codingbox.sayworld5.dto.QOrders;
import com.codingbox.sayworld5.dto.Item;
import com.codingbox.sayworld5.dto.Cart;

import com.querydsl.jpa.impl.JPAQueryFactory;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class Main07 {

    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("hello");
        EntityManager em = emf.createEntityManager();
        JPAQueryFactory queryFactory = new JPAQueryFactory(em);

        EntityTransaction tx = em.getTransaction();
        tx.begin();

        try {
            // 데이터 추가
        	Customer customer = new Customer("y4k1","1234", "송화준", "남자" , LocalDate.now() , "01043763874", 10, "avatar1.png");
            em.persist(customer);

            MyItem myItem = new MyItem(customer, null);
            em.persist(myItem);

            Orders orders = new Orders(customer, null);
            orders.setMyItems(List.of(myItem));
            em.persist(orders);

            Item mi1 = new Item("미니미", "안경잡이 신사", 10, "/item/avatar/avatar.png", "/item/avatar/avatar.png");
            Item mi2 = new Item("미니미", "노랑머리 소녀", 10, "/item/avatar/avatar2.png", "/item/avatar/avatar2.png");
            Item mi3 = new Item("미니미", "좀도둑", 10, "/item/avatar/avatar3.png", "/item/avatar/avatar3.png");
            Item mi4 = new Item("미니미", "퍼플레인 가이", 10, "/item/avatar/avatar4.png", "/item/avatar/avatar4.png");
            Item mi5 = new Item("미니미", "레드베리 소녀", 10, "/item/avatar/avatar5.png", "/item/avatar/avatar5.png");
            Item mi6 = new Item("미니미", "블루블링 소녀", 10, "/item/avatar/avatar6.png", "/item/avatar/avatar6.png");
            Item mi7 = new Item("미니미", "소년만화 주인공", 10, "/item/avatar/avatar7.png", "/item/avatar/avatar7.png");
            Item mi8 = new Item("미니미", "괴도 키드", 10, "/item/avatar/avatar8.png", "/item/avatar/avatar8.png");
            Item mi9 = new Item("미니미", "발랄한 소녀", 10, "/item/avatar/avatar9.png", "/item/avatar/avatar9.png");
            
            Item mu1 = new Item("음악", "테이 - 사랑은 향기를 남기고", 10, "/item/music/Tei.jpg", "/item/music/Tei.mp3");  
            Item mu2 = new Item("음악", "더 넛츠 - 사랑의 바보", 10, "/item/music/The Nuts.jpg", "/item/music/The Nuts.mp3");  
            Item mu3 = new Item("음악", "백지영 - 사랑안해", 10, "/item/music/No Love.jpg", "/item/music/No Love.mp3");  
            Item mu4 = new Item("음악", "박효신 - 추억은 사랑을 닮아", 10, "/item/music/Memoryresemble.jpg", "/item/music/Memoryresemble.mp3");  
            Item mu5 = new Item("음악", "버즈 - 가시", 10, "/item/music/thorn.jpg", "/item/music/thorn.mp3");  
            Item mu6 = new Item("음악", "루그 - 죄", 10, "/item/music/sin.jpg", "/item/music/sin.mp3");  
            Item mu7 = new Item("음악", "이지 - 응급실", 10, "/item/music/Emergency room.jpg", "/item/music/Emergency room.mp3");  
            Item mu8 = new Item("음악", "쿨 - 아로하", 10, "/item/music/Aroha.jpg", "/item/music/Aroha.mp3");  
            Item mu9 = new Item("음악", "전람회 - 취중진담", 10, "/item/music/Drunkenjoke.jpg", "/item/music/Drunkenjoke.mp3");  
           
            
            
            
            
            Item bg1 = new Item("배경", "그 시절 우리의 배경화면", 10, "/item/background/background1.png", "/item/background/background1.png");
            Item bg2 = new Item("배경", "뉴욕 뉴욕", 10, "/item/background/background2.jpg", "/item/background/background2.jpg");
            Item bg3 = new Item("배경", "비오는 숲 어딘가", 10, "/item/background/background3.jpg", "/item/background/background3.jpg");
            Item bg4 = new Item("배경", "무한한 공간 저 너머로", 10, "/item/background/background4.png", "/item/background/background4.png");
            Item bg5 = new Item("배경", "아이 러브 유 파리", 10, "/item/background/background5.jpg", "/item/background/background5.jpg");
            Item bg6 = new Item("배경", "동화 속 성", 10, "/item/background/background6.png", "/item/background/background6.png");
            Item bg7 = new Item("배경", "새해가 떠오른다", 10, "/item/background/background7.jpg", "/item/background/background7.jpg");
            Item bg8 = new Item("배경", "미드나잇 문", 10, "/item/background/background8.jpg", "/item/background/background8.jpg");
           
            //미니미
            em.persist(mi1);
            em.persist(mi2);
            em.persist(mi3);
            em.persist(mi4);
            em.persist(mi5);
            em.persist(mi6);
            em.persist(mi7);
            em.persist(mi8);
            em.persist(mi9);
            
            
            //음악
            em.persist(mu1);
            em.persist(mu2);
            em.persist(mu3);
            em.persist(mu4);
            em.persist(mu5);
            em.persist(mu6);
            em.persist(mu7);
            em.persist(mu8);
            em.persist(mu9);

            //배경
            em.persist(bg1);
            em.persist(bg2);
            em.persist(bg3);
            em.persist(bg4);
            em.persist(bg5);
            em.persist(bg6);
            em.persist(bg7);
            em.persist(bg8);

            
            
            
            
            Cart cart = new Cart(customer,null);
            cart.setCustomer(customer);
            cart.setItem(mi1);
            em.persist(mi8);
            em.persist(cart);

            // 트랜잭션 커밋
            tx.commit();

            // 데이터 조회
            List<Customer> customers = queryFactory
                    .selectFrom(QCustomer.customer)
                    .fetch();
            for (Customer c : customers) {
                System.out.println("Customer: " + c.getName());
            }

            List<MyItem> myItems = queryFactory
                    .selectFrom(QMyItem.myItem)
                    .fetch();
            for (MyItem m : myItems) {
                System.out.println("MyItem: " + mi1.getId());
                System.out.println("MyItem: " + mu1.getId());
                System.out.println("MyItem: " + bg1.getId());
            }

            List<Orders> ordersList = queryFactory
                    .selectFrom(QOrders.orders)
                    .fetch();
            for (Orders o : ordersList) {
                System.out.println("Order: " + o.getOrderid());
            }

            List<Item> items = queryFactory
                    .selectFrom(QItem.item)
                    .fetch();
            for (Item i : items) {
                System.out.println("Item: " + i.getName());
            }

            List<Cart> carts = queryFactory
                    .selectFrom(QCart.cart)
                    .fetch();
            for (Cart c : carts) {
                System.out.println("Cart ID: " + c.getId());
                System.out.println("Customer: " + c.getCustomer().getName());
                System.out.println("Item: " + c.getItem().getName());
            }
        } catch (Exception e) {
            tx.rollback();
            e.printStackTrace();
        } finally {
            em.close();
            emf.close();
        }
    }
}
