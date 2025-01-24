package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.ItemDao;
import com.example.entity.Items;

@Service
public class Itemservice {
	
	@Autowired
	ItemDao itemDao;
	
	public Items addItems(Items item) {
		return itemDao.save(item);
	}

	public void removeitems(long item_id) {
		itemDao.deleteById(1l);
		
	}

}
