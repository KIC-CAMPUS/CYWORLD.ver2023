package com.codingbox.sayworld;

import java.time.LocalDate;
import java.util.List;


import com.codingbox.sayworld.entity.Customer;
import com.codingbox.sayworld.entity.GuestBook;
import com.codingbox.sayworld.entity.Home;
import com.codingbox.sayworld.entity.Item;
import com.codingbox.sayworld.entity.MyItem;


import com.codingbox.sayworld.entity.QCustomer;
import com.codingbox.sayworld.entity.QGuestBook;
import com.codingbox.sayworld.entity.QItem;
import com.codingbox.sayworld.entity.QMyItem;

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
        	 	Customer customerA = new Customer("y4k1345","ong11234", "ong11234", "송화준", "남자" , 2000 ,  05 , 04 , "01043763874", 10, "T");
        	    Customer customerB = new Customer("y4k1346","ong11234", "ong11234", "김영환", "남자" , 2000 ,  05 , 04 , "01043763874", 10, "T");
        	    Customer customerC = new Customer("y4k1347","ong11234", "ong11234", "이동현", "남자" , 2000 ,  05 , 04 , "01043763874", 10, "T");
        	    Customer customerD = new Customer("y4k1348","ong11234", "ong11234", "김아람", "여자" , 2000 ,  05 , 04 , "01043763874", 10, "T");
        	    Customer customerE = new Customer("y4k1349","ong11234", "ong11234", "김수빈", "남자" , 2000 ,  05 , 04 , "01043763874", 10, "T");
        	    Customer customerF = new Customer("y4k1350","ong11234", "ong11234", "하승우", "남자" , 2000 ,  05 , 04 , "01043763874", 10, "T");
        	    
        	    em.persist(customerA);
        	    em.persist(customerB);
        	    em.persist(customerC);
        	    em.persist(customerD);
        	    em.persist(customerE);
        	    em.persist(customerF);
        	    
        	    MyItem myItem = new MyItem(customerA, null, "/util/bg/bg2.css", "/util/bg/bg2.png", "/util/room/musium_room.gif", "/util/music/박효신 - 추억은 사랑을 닮아.jpg", "박효신 - 추억은 사랑을 닮아", "/util/font/dovemayo.gif", "독도남", "/util/music/박효신 - 추억은 사랑을 닮아.mp3", "/util/font/dovemayo.css", "/util/minimi/test18.gif");
        	    MyItem myItem1 = new MyItem(customerB, null, "/util/bg/bg5.css", "/util/bg/bg4.png", "/util/room/park_room.jpg", "/util/music/Tei-사랑은 향기를 남기고.jpg", "Tei-사랑은 향기를 남기고", "/util/font/dovemayo.gif", "독도남", "/util/music/Tei-사랑은 향기를 남기고.mp3", "/util/font/dovemayo.css", "/util/minimi/test11.gif");
        	    MyItem myItem2 = new MyItem(customerC, null, "/util/bg/bg4.css", "/util/bg/bg4.png", "/util/room/park2_room.gif", "/util/music/Tei-사랑은 향기를 남기고.jpg", "Tei-사랑은 향기를 남기고", "/util/font/dovemayo.gif", "독도남", "/util/music/Tei-사랑은 향기를 남기고.mp3", "/util/font/dovemayo.css", "/util/minimi/test7.gif");
        	    MyItem myItem3 = new MyItem(customerD, null, "/util/bg/bg6.css", "/util/bg/bg4.png", "/util/room/road_room.jpg", "/util/music/Tei-사랑은 향기를 남기고.jpg", "나얼 - 귀로", "/util/font/dovemayo.gif", "독도남", "/util/music/나얼 - 귀로.mp3", "/util/font/dovemayo.css", "/util/minimi/test16.gif");
        	    MyItem myItem4 = new MyItem(customerE, null, "/util/bg/bg7.css", "/util/bg/bg4.png", "/util/room/store_room.gif", "/util/music/Tei-사랑은 향기를 남기고.jpg", "M TO M - 세 글자", "/util/font/dovemayo.gif", "독도남", "/util/music/M TO M - 세 글자.mp3", "/util/font/dovemayo.css", "/util/minimi/test1.gif");
        	    MyItem myItem5 = new MyItem(customerF, null, "/util/bg/bg8.css", "/util/bg/bg4.png", "/util/room/winter_room.png", "/util/music/Tei-사랑은 향기를 남기고.jpg", "버즈 - 가시", "/util/font/dovemayo.gif", "독도남", "/util/music/버즈-가시.mp3", "/util/font/dovemayo.css", "/util/minimi/test3.gif");
        	    em.persist(myItem);
        	    em.persist(myItem1);
        	    em.persist(myItem2);
        	    em.persist(myItem3);
        	    em.persist(myItem4);
        	    em.persist(myItem5);

        	    Home userA1 = new Home(1, 12, "/util/pic/3.png", "빨리 프로젝트가 끝났으면 좋겠다~", "얼른 취업하고 싶은데", "이동현", "김수빈", "김아람", "http://localhost:9091/myhome/myhome/3", "http://localhost:9091/myhome/myhome/5", "http://localhost:9091/myhome/myhome/4", "http://localhost:9091/myhome/myhome/1", customerA);
        	    Home userB1 = new Home(1, 12, "/util/pic/2.png", "ㅋㅋㅋㅋㅋ", "얼른 개발자가 되었으면 좋겠습니다", "이동현", "김수빈", "김아람", "http://localhost:9091/myhome/myhome/3", "http://localhost:9091/myhome/myhome/5", "http://localhost:9091/myhome/myhome/4", "http://localhost:9091/myhome/myhome/1", customerB);
        	    Home userC1 = new Home(1, 52, "/util/pic/5.jpg", "할 말 없음", "아 할 말 없다.", "하승우", "김수빈", "김영환", "http://localhost:9091/myhome/myhome/6", "http://localhost:9091/myhome/myhome/5", "http://localhost:9091/myhome/myhome/2", "http://localhost:9091/myhome/myhome/1", customerC);
        	    Home userD1 = new Home(6, 132, "/util/pic/4.jpg", "에구구구", "그저 하루가 빨리 지나갔으면", "하승우", "김수빈", "김영환", "http://localhost:9091/myhome/myhome/6", "http://localhost:9091/myhome/myhome/5", "http://localhost:9091/myhome/myhome/2", "http://localhost:9091/myhome/myhome/1", customerD);
        	    Home userE1 = new Home(7, 172, "/util/pic/7.png", "몸이 좀 안 좋네요", "강사님 코딩 너무 어려워요", "하승우", "김수빈", "김영환", "http://localhost:9091/myhome/myhome/6", "http://localhost:9091/myhome/myhome/5", "http://localhost:9091/myhome/myhome/2", "http://localhost:9091/myhome/myhome/1", customerE);
        	    Home userF1 = new Home(8, 112, "/util/pic/8.png", "ㅋㅋㅋㅋㅋ", "뭐라고 적어야 할지 몰라서.. 미안해", "이동현", "김수빈", "김아람", "http://localhost:9091/myhome/myhome/3", "http://localhost:9091/myhome/myhome/5", "http://localhost:9091/myhome/myhome/4", "http://localhost:9091/myhome/myhome/1", customerF);
        	    
        	    em.persist(userA1);
        	    em.persist(userB1);
        	    em.persist(userC1);
        	    em.persist(userD1);
        	    em.persist(userE1);
        	    em.persist(userF1);
        	    
        	    GuestBook userC = new GuestBook(LocalDate.now(), "밥은 먹고 다니냐?", userA1);
        	    GuestBook userD = new GuestBook(LocalDate.now(), "점심밥은 먹고 다니냐?", userB1);
        	    em.persist(userC);
        	    em.persist(userD);
        	

        	    //미니미
                Item mi1 = new Item("미니미", "커피프린스 미니미", 10, "/util/minimi/test1.gif", "/util/minimi/test1.gif");
                Item mi2 = new Item("미니미", "붉은악마 미니미", 10, "/util/minimi/test2.gif", "/util/minimi/test2.gif");
                Item mi3 = new Item("미니미", "열공하는 미니미", 10, "/util/minimi/test3.gif", "/util/minimi/test3.gif");
                Item mi4 = new Item("미니미", "북치는 미니미", 10, "/util/minimi/test4.gif", "/util/minimi/test4.gif");
                Item mi5 = new Item("미니미", "원더걸스 미니미", 10, "/util/minimi/test5.gif", "/util/minimi/test5.gif");
                Item mi6 = new Item("미니미", "비보이 미니미", 10, "/util/minimi/test6.gif", "/util/minimi/test6.gif");
                Item mi7 = new Item("미니미", "노래부르는 미니미", 10, "/util/minimi/test7.gif", "/util/minimi/test7.gif");
                Item mi8 = new Item("미니미", "쨈민이 미니미", 10, "/util/minimi/test19.gif", "/util/minimi/test19.gif");
                Item mi9 = new Item("미니미", "김사부 미니미", 10, "/util/minimi/test9.gif", "/util/minimi/test9.gif");
          
                //음악
                Item mu1 = new Item("음악", "테이 - 사랑은 향기를 남기고", 10, "/util/music/Tei-사랑은 향기를 남기고.jpg", "/util/music/Tei-사랑은 향기를 남기고.mp3");  
                Item mu2 = new Item("음악", "더 넛츠 - 사랑의 바보", 10, "/util/music/The Nuts (더 넛츠) - 사랑의 바보.jpg", "/util/music/The Nuts (더 넛츠) - 사랑의 바보.mp3");  
                Item mu3 = new Item("음악", "백지영 - 사랑안해", 10, "/util/music/백지영-사랑안해.jpg", "/util/music/백지영-사랑안해.mp3");  
                Item mu4 = new Item("음악", "박효신 - 추억은 사랑을 닮아", 10, "/util/music/박효신 - 추억은 사랑을 닮아.jpg", "/util/music/박효신 - 추억은 사랑을 닮아.mp3");  
                Item mu5 = new Item("음악", "버즈 - 가시", 70, "/util/music/버즈-가시.jpg", "/util/music/버즈-가시.mp3");  
                Item mu6 = new Item("음악", "루그 - 죄", 50, "/util/music/루그-죄.jpg", "/util/music/루그-죄.mp3");  
                Item mu7 = new Item("음악", "이지 - 응급실", 10, "/util/music/이지 - 응급실.jpg", "/util/music/이지 - 응급실.mp3");  
                Item mu8 = new Item("음악", "쿨 - 아로하", 30, "/util/music/쿨 - 아로하.jpg", "/util/music/쿨 - 아로하.mp3");  
                Item mu9 = new Item("음악", "전람회 - 취중진담", 20, "/util/music/전람회 - 취중진담.jpg", "/util/music/전람회 - 취중진담.mp3");  
               
                //배경
                Item bg1 = new Item("배경", "비 오는 숲 어딘가", 10, "/util/bg/bg3.jpg", "/util/bg/bg3.css");
                Item bg2 = new Item("배경", "그 시절 우리의 배경화면", 10, "/util/bg/bg4.png", "/util/bg/bg4.css");
                Item bg3 = new Item("배경", "새해가 떠오른다", 10, "/util/bg/bg5.jpg", "/util/bg/bg5.cssg");
                Item bg4 = new Item("배경", "뉴욕", 10, "/util/bg/bg6.jpg", "/util/bg/bg6.cssg");
                Item bg5 = new Item("배경", "무한한 공간 저 너머로", 10, "/util/bg/bg7.png", "/util/bg/bg7.css");
                Item bg6 = new Item("배경", "아이 러브 유 파리", 10, "/util/bg/bg8.jpg", "/util/bg/bg8.css");
                Item bg7 = new Item("배경", "동화 속 성", 10, "/util/bg/bg9.png", "/util/bg/bg9.css");
                Item bg8 = new Item("배경", "미드나잇 문", 10, "/util/bg/bg10.jpg", "/util/bg/bg10.css");
               
                //폰트
                Item ft1 = new Item("폰트", "좋은모닝커피", 10, "/util/font/coffee1.gif", "/util/font/coffee1.css");
                Item ft2 = new Item("폰트", "훈정글북", 10, "/util/font/hoonjunglebook.gif", "/util/font/hoonjunglebook.css");
                Item ft3 = new Item("폰트", "타이포크레용", 10, "/util/font/typocrayon.gif", "/util/font/typocrayon.css");
                Item ft4 = new Item("폰트", "둘기마요체", 10, "/util/font/dovemayo.gif", "/util/font/dovemayo.css");
                Item ft5 = new Item("폰트", "메이플스토리", 10, "/util/font/maplestory.gif", "/util/font/maplestory.css");
                Item ft6 = new Item("폰트", "DX유니고딕", 10, "/util/font/unigothic.gif", "/util/font/unigothic.css");
                Item ft7 = new Item("폰트", "맑은고딕", 10, "/util/font/malgungothic.gif", "/util/font/malgungothic.css");
                
                //미니룸	
                Item mr1 = new Item("미니룸", "숲 속의 방", 10, "/util/room/forest_room.gif", "/util/room/forest_room.gif");
                Item mr2 = new Item("미니룸", "나만의 박물관", 10, "/util/room/musium_room.gif", "/util/room/musium_room.gif");
                Item mr3 = new Item("미니룸", "창밖에는 눈이 오네요 ", 10, "/util/room/my_room.gif", "/util/room/my_room.gif");
                Item mr4 = new Item("미니룸", "따스한 봄날", 10, "/util/room/con_room.gif", "/util/room/con_room.gif");
                Item mr5 = new Item("미니룸", "큐티큐티 룸", 10, "/util/room/park_room.jpg", "/util/room/park_room.jpg");
                Item mr6 = new Item("미니룸", "센 강의 거리", 10, "/util/room/road_room.jpg", "/util/room/road_room.jpg");
                Item mr7 = new Item("미니룸", "꽃 가게를 열었어요", 10, "/util/room/store_room.gif", "/util/room/store_room.gif");
                Item mr8 = new Item("미니룸", "내 마음 속 Winter Wonderland", 10, "/util/room/winter_room.png", "/util/room/winter_room.png");
                Item mr9 = new Item("미니룸", "포차거리에서", 10, "/util/room/pocha_room.gif", "/util/room/pocha_room.gif");
               
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

                //폰트
                em.persist(ft1);
                em.persist(ft2);
                em.persist(ft3);
                em.persist(ft4);
                em.persist(ft5);
                em.persist(ft6);
                em.persist(ft7);
                
                //미니룸
                em.persist(mr1);
                em.persist(mr2);
                em.persist(mr3);
                em.persist(mr4);
                em.persist(mr5);
                em.persist(mr6);
                em.persist(mr7);
                em.persist(mr8);
                em.persist(mr9);


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
            	for (MyItem mi : myItems) {
            	System.out.println("MyItem: " + mi1.getId());
                System.out.println("MyItem: " + mu1.getId());
                System.out.println("MyItem: " + bg1.getId());
            }


            List<Item> items = queryFactory
                    .selectFrom(QItem.item)
                    .fetch();
            for (Item i : items) {
                System.out.println("Item: " + i.getName());
            }

            
            List<GuestBook> guestBooks = queryFactory
                    .selectFrom(QGuestBook.guestBook)
                    .fetch();

            for (GuestBook guestBook : guestBooks) {
                System.out.println("GuestBook = " + guestBook);
                System.out.println("-> guestBook.home = " + guestBook.getHome());
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
