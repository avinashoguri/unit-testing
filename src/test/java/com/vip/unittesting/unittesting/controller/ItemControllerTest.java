package com.vip.unittesting.unittesting.controller;


import static org.assertj.core.api.Assertions.contentOf;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import com.vip.unittesting.unittesting.business.ItemBusinessService;
import com.vip.unittesting.unittesting.model.Item;

import ch.qos.logback.core.status.Status;


@RunWith(SpringRunner.class)
@WebMvcTest(ItemController.class)
public class ItemControllerTest {
	
	@Autowired
	private MockMvc mockMvc;

	@MockBean
	private ItemBusinessService businessService;
	
	@Test
	public void dummyItem_basic() throws Exception {
		
		//Get "helloworld"
		RequestBuilder request=MockMvcRequestBuilders
				.get("/dummy-item")
				.accept(MediaType.APPLICATION_JSON);
		
		MvcResult result=mockMvc.perform(request)
				.andExpect(status().isOk())
				.andExpect(content().json("{\"id\":1,\"name\":\"Ball\",\"price\":10,\"qty\":100}"))
				.andReturn();
		
		//Verify 
		
		
		
	}

	@Test
	public void itemFromBusinessService_basic() throws Exception {
		
		when(businessService.retriveHardCodedItem()).thenReturn(new Item(2,"Bat",10,100));
		
		
		RequestBuilder request=MockMvcRequestBuilders
				.get("/item-from-business-service")
				.accept(MediaType.APPLICATION_JSON);
		
		MvcResult result=mockMvc.perform(request)
				.andExpect(status().isOk())
				.andExpect(content().json("{id:2,name:Bat,price:10}"))
				.andReturn();
		
		//Verify 
		
		
		
	}
	
	@Test
	public void retriveAllItems_basic() throws Exception {
		
		when(businessService.retriveAllItems()).thenReturn(Arrays.asList(new Item(2,"item2",10,10),new Item(3,"item3",20,15)));
		
		
		RequestBuilder request=MockMvcRequestBuilders
				.get("/all-items-from-database")
				.accept(MediaType.APPLICATION_JSON);
		
		MvcResult result=mockMvc.perform(request)
				.andExpect(status().isOk())
				.andExpect(content().json("[{id:2,name:item2,price:10},{id:3,name:item3,price:20}]"))
				.andReturn();
		
		
		
	}
}
