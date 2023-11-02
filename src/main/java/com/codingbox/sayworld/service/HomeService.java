//package com.codingbox.sayworld.service;
//
//
//
//import java.util.List;
//import java.util.stream.Collectors;
//
//
//import org.springframework.stereotype.Service;
//
//import com.codingbox.sayworld.dto.HomeDTO;
//
//import com.codingbox.sayworld.entity.QCustomer;
//import com.codingbox.sayworld.entity.QHome;
//import com.codingbox.sayworld.entity.QMyItem;
//
//import com.querydsl.jpa.impl.JPAQueryFactory;
//
//import jakarta.persistence.EntityManager;
//import jakarta.persistence.PersistenceContext;
//
//@Service
//public class HomeService {
//
//    @PersistenceContext
//    private EntityManager entityManager;
//
//    public List<HomeDTO> getJoinedHomeData() {
//        JPAQueryFactory queryFactory = new JPAQueryFactory(entityManager);
//
//        List<HomeDTO> homeDTOList = queryFactory
//            .select(
//                QHome.home.today,
//                QHome.home.total,
//                QHome.home.img,
//                QHome.home.content,
//                QHome.home.introduce,
//                QHome.home.friend,
//                QCustomer.customer.name,
//                QMyItem.myItem.My_Bg,
//                QMyItem.myItem.My_Img
//            )
//            .from(QHome.home)
//            .join(QCustomer.customer)
//            .join(QMyItem.myItem)
//            .fetch()
//            .stream()
//            .map(tuple -> new HomeDTO(
//                tuple.get(QHome.home.today),
//                tuple.get(QHome.home.total),
//                tuple.get(QHome.home.img),
//                tuple.get(QHome.home.content),
//                tuple.get(QHome.home.introduce),
//                tuple.get(QHome.home.friend),
//                tuple.get(QCustomer.customer.name),
//                tuple.get(QMyItem.myItem.My_Bg),
//                tuple.get(QMyItem.myItem.My_Img)
//            ))
//            .collect(Collectors.toList());
//
//        return homeDTOList;
//    }
//
//}


