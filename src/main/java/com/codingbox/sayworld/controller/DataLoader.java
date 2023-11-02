//package com.codingbox.sayworld.controller;
//
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.stereotype.Component;
//
//import com.codingbox.sayworld.entity.Item;
//import com.codingbox.sayworld.service.ItemService;
//
//import jakarta.transaction.Transactional;
//
//@Component
//public class DataLoader implements CommandLineRunner {
//
//	private final ItemService itemService;
//	
//	public DataLoader(ItemService itemService) {
//		this.itemService = itemService;
//	}
//	
//	// 실행 시 아이템 정보 DB에 추가
//	@Override
//	@Transactional
//	public void run(String... args) {
//		//미니미
//		itemService.saveItem("미니미", "커피프린스 미니미", 10, "/util/minimi/test1.gif", "/util/minimi/test1.gif");
//		itemService.saveItem("미니미", "붉은악마 미니미", 10, "/util/minimi/test2.gif", "/util/minimi/test2.gif");
//		itemService.saveItem("미니미", "열공하는 미니미", 10, "/util/minimi/test3.gif", "/util/minimi/test3.gif");
//		itemService.saveItem("미니미", "북치는 미니미", 10, "/util/minimi/test4.gif", "/util/minimi/test4.gif");
//		itemService.saveItem("미니미", "원더걸스 미니미", 10, "/util/minimi/test5.gif", "/util/minimi/test5.gif");
//		itemService.saveItem("미니미", "비보이 미니미", 10, "/util/minimi/test6.gif", "/util/minimi/test6.gif");
//		itemService.saveItem("미니미", "노래부르는 미니미", 10, "/util/minimi/test7.gif", "/util/minimi/test7.gif");
//		itemService.saveItem("미니미", "쨈민이 미니미", 10, "/util/minimi/test19.gif", "/util/minimi/test19.gif");
//		itemService.saveItem("미니미", "김사부 미니미", 10, "/util/minimi/test9.gif", "/util/minimi/test9.gif");
//		
//		//음악
//		itemService.saveItem("음악", "테이 - 사랑은 향기를 남기고", 10, "/util/music/Tei-사랑은 향기를 남기고.jpg", "/util/music/Tei-사랑은 향기를 남기고.mp3");  
//		itemService.saveItem("음악", "더 넛츠 - 사랑의 바보", 10, "/util/music/The Nuts (더 넛츠) - 사랑의 바보.jpg", "/util/music/The Nuts (더 넛츠) - 사랑의 바보.mp3");  
//		itemService.saveItem("음악", "백지영 - 사랑안해", 10, "/util/music/백지영-사랑안해.jpg", "/util/music/백지영-사랑안해.mp3");  
//		itemService.saveItem("음악", "박효신 - 추억은 사랑을 닮아", 10, "/util/music/박효신 - 추억은 사랑을 닮아.jpg", "/util/music/박효신 - 추억은 사랑을 닮아.mp3");  
//		itemService.saveItem("음악", "버즈 - 가시", 70, "/util/music/버즈-가시.jpg", "/util/music/버즈-가시.mp3");  
//		itemService.saveItem("음악", "루그 - 죄", 50, "/util/music/루그-죄.jpg", "/util/music/루그-죄.mp3");  
//		itemService.saveItem("음악", "이지 - 응급실", 10, "/util/music/이지 - 응급실.jpg", "/util/music/이지 - 응급실.mp3");  
//		itemService.saveItem("음악", "쿨 - 아로하", 30, "/util/music/쿨 - 아로하.jpg", "/util/music/쿨 - 아로하.mp3");  
//		itemService.saveItem("음악", "전람회 - 취중진담", 20, "/util/music/전람회 - 취중진담.jpg", "/util/music/전람회 - 취중진담.mp3");  
//       
//        //배경
//		itemService.saveItem("배경", "비 오는 숲 어딘가", 10, "/util/bg/bg3.jpg", "/util/bg/bg3.css");
//		itemService.saveItem("배경", "그 시절 우리의 배경화면", 10, "/util/bg/bg4.png", "/util/bg/bg4.css");
//		itemService.saveItem("배경", "새해가 떠오른다", 10, "/util/bg/bg5.jpg", "/util/bg/bg5.cssg");
//		itemService.saveItem("배경", "뉴욕", 10, "/util/bg/bg6.jpg", "/util/bg/bg6.cssg");
//		itemService.saveItem("배경", "무한한 공간 저 너머로", 10, "/util/bg/bg7.png", "/util/bg/bg7.css");
//		itemService.saveItem("배경", "아이 러브 유 파리", 10, "/util/bg/bg8.jpg", "/util/bg/bg8.css");
//		itemService.saveItem("배경", "동화 속 성", 10, "/util/bg/bg9.png", "/util/bg/bg9.css");
//		itemService.saveItem("배경", "미드나잇 문", 10, "/util/bg/bg10.jpg", "/util/bg/bg10.css");
//       
//        //폰트
//		itemService.saveItem("폰트", "좋은모닝커피", 10, "/util/font/coffee1.gif", "/util/font/coffee1.css");
//		itemService.saveItem("폰트", "훈정글북", 10, "/util/font/hoonjunglebook.gif", "/util/font/hoonjunglebook.css");
//		itemService.saveItem("폰트", "타이포크레용", 10, "/util/font/typocrayon.gif", "/util/font/typocrayon.css");
//		itemService.saveItem("폰트", "둘기마요체", 10, "/util/font/dovemayo.gif", "/util/font/dovemayo.css");
//		itemService.saveItem("폰트", "메이플스토리", 10, "/util/font/maplestory.gif", "/util/font/maplestory.css");
//		itemService.saveItem("폰트", "DX유니고딕", 10, "/util/font/unigothic.gif", "/util/font/unigothic.css");
//		itemService.saveItem("폰트", "맑은고딕", 10, "/util/font/malgungothic.gif", "/util/font/malgungothic.css");
//        
//        //미니룸	
//		itemService.saveItem("미니룸", "숲 속의 방", 10, "/util/room/forest_room.gif", "/util/room/forest_room.gif");
//		itemService.saveItem("미니룸", "나만의 박물관", 10, "/util/room/musium_room.gif", "/util/room/musium_room.gif");
//		itemService.saveItem("미니룸", "창밖에는 눈이 오네요 ", 10, "/util/room/my_room.gif", "/util/room/my_room.gif");
//		itemService.saveItem("미니룸", "따스한 봄날", 10, "/util/room/con_room.gif", "/util/room/con_room.gif");
//		itemService.saveItem("미니룸", "큐티큐티 룸", 10, "/util/room/park_room.jpg", "/util/room/park_room.jpg");
//		itemService.saveItem("미니룸", "센 강의 거리", 10, "/util/room/road_room.jpg", "/util/room/road_room.jpg");
//		itemService.saveItem("미니룸", "꽃 가게를 열었어요", 10, "/util/room/store_room.gif", "/util/room/store_room.gif");
//		itemService.saveItem("미니룸", "내 마음 속 Winter Wonderland", 10, "/util/room/winter_room.png", "/util/room/winter_room.png");
//		itemService.saveItem("미니룸", "포차거리에서", 10, "/util/room/pocha_room.gif", "/util/room/pocha_room.gif");
//		
//	}
//}
