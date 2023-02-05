package com.vip.unittesting.unittesting.business;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import com.vip.unittesting.unittesting.data.ItemRepository;
import com.vip.unittesting.unittesting.model.Item;

@RunWith(MockitoJUnitRunner.class)
public class ItemBusinessServiceTest {
	
	@InjectMocks
	private ItemBusinessService business=new ItemBusinessService();
	
	@Mock
	private ItemRepository repository= mock(ItemRepository.class);
	
	
	@Test
	public void caluculationOfDataService_basic() {
		System.out.println("Test started");
		
		when(repository.findAll()).thenReturn(Arrays.asList(new Item(2,"item2",10,10),
													  new Item(3,"item3",20,20)));
		
		for (Item its:repository.findAll()) {
			System.out.println(its);
		}
		
		List<Item>items=business.retriveAllItems();
		
		System.out.println(items.get(0).getValue()+"---value");
		
		
		assertEquals(100, items.get(0).getValue());
		assertEquals(400, items.get(1).getValue());
		
	}
	

}
