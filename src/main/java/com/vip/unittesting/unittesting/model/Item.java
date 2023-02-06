package com.vip.unittesting.unittesting.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Transient;

@Entity
public class Item {


	@Id
	private int id;
	private String name;
	private int price;
	private int qty;

	@Transient
	private int value;
	
	protected Item() {
		
	}

	public Item(int id, String name, int price, int qty) {
		// TODO Auto-generated constructor stub
		this.id=id;
		this.name=name;
		this.price=price;
		this.qty=qty;
	}

	public int getId() {
		return id;
	}


	public String getName() {
		return name;
	}

	public int getPrice() {
		return price;
	}

	public int getQty() {
		return qty;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public String toString() {
		return String.format("Item[%d,%s,%d,%d]", id,name,price,qty);

	}

	
}
