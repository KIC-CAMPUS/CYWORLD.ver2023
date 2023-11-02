package com.codingbox.sayworld.service;

import java.util.List;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.codingbox.sayworld.dto.ItemDTO;
import com.codingbox.sayworld.entity.Item;
import com.codingbox.sayworld.entity.QItem;
import com.codingbox.sayworld.repository.ItemRepository;
import com.querydsl.jpa.impl.JPAQueryFactory;
import jakarta.persistence.EntityManager;

@Service
public class ItemService {

	 @Autowired
	    private ItemRepository itemRepository;
	    private final JPAQueryFactory queryFactory;

	    public ItemService(EntityManager em) {
	        this.queryFactory = new JPAQueryFactory(em);
	    }

	    public List<ItemDTO> getAllItems() {
	        List<Item> items = queryFactory.selectFrom(QItem.item)
	                                      .fetch();
	        return items.stream()
	                    .map(this::convertToDTO)
	                    .collect(Collectors.toList());
	    }

	    private ItemDTO convertToDTO(Item item) {
	        ItemDTO itemDTO = new ItemDTO();
	        itemDTO.setCategory(item.getCategory());
	        itemDTO.setName(item.getName());
	        itemDTO.setPrice(item.getPrice());
	        itemDTO.setI_img(item.getI_img());
	        itemDTO.setI_file1(item.getI_file1());
	        return itemDTO;
	    }
	    
	    
//	    @Transactional
//		public void saveItem(String category, String name, int price, String i_img, String i_file1) {
//			Item items= new Item(category, name, price, i_img, i_file1);
//			itemRepository.save(items);
//		}
//	    
//	    public List<Item> getAllItemsFromRepository() {
//	        return itemRepository.findAll();
//	    }

	}