package com.vip.unittesting.data;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.vip.unittesting.unittesting.data.ItemRepository;
import com.vip.unittesting.unittesting.model.Item;

@RunWith(SpringRunner.class)
@DataJpaTest
public class ItemRepositoryTest {
	
	@Autowired
	private ItemRepository repo;
	
	@Test
	public void testFindAll() {
		List<Item> items=repo.findAll();
		
		assertEquals(4, items.size());
	}

}
