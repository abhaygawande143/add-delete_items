package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.Items;
import com.example.service.Itemservice;

@RestController
@RequestMapping("/item")
public class ItemController {
	
	@Autowired
	Itemservice itemservice;
	
	@PostMapping
	public Items addItems(@RequestBody Items item) {
		return itemservice.addItems(item); 
	}

	@DeleteMapping("/{item_id}")
	public void removeitems(@PathVariable long item_id) {
		itemservice.removeitems(item_id);
	}
}
