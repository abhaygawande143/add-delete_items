package com.example.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Items {
	
	@Id
	private long item_id;
	
	private String item_name;
	
	private Double item_price;

	public Items(long item_id, String item_name, Double item_price) {
		super();
		this.item_id = item_id;
		this.item_name = item_name;
		this.item_price = item_price;
	}

	public Items() {
		super();
		// TODO Auto-generated constructor stub
	}

	public long getItem_id() {
		return item_id;
	}

	public void setItem_id(long item_id) {
		this.item_id = item_id;
	}

	public String getItem_name() {
		return item_name;
	}

	public void setItem_name(String item_name) {
		this.item_name = item_name;
	}

	public Double getItem_price() {
		return item_price;
	}

	public void setItem_price(Double item_price) {
		this.item_price = item_price;
	}

	@Override
	public String toString() {
		return "Items [item_id=" + item_id + ", item_name=" + item_name + ", item_price=" + item_price + "]";
	}
	
	
	

}
