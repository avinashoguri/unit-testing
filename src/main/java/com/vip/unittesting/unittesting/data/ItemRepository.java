package com.vip.unittesting.unittesting.data;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vip.unittesting.unittesting.model.Item;

public interface ItemRepository extends JpaRepository<Item, Integer>{

}
