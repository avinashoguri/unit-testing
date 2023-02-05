package com.vip.unittesting.unittesting.business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.vip.unittesting.unittesting.data.ItemRepository;
import com.vip.unittesting.unittesting.model.Item;

@Component
public class ItemBusinessService {
	
	@Autowired
	private ItemRepository repo;

	public Item retriveHardCodedItem() {
		return new Item(1,"Ball",10,100);
	}

	public List<Item> retriveAllItems(){
		List<Item> items=repo.findAll();
		
		for(Item item:items) {
			item.setValue(item.getPrice()*item.getQty());
		}
		return items;
		
	}
}
