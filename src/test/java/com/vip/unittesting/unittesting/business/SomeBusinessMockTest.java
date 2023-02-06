package com.vip.unittesting.unittesting.business;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.mockito.junit.jupiter.MockitoExtension;

import com.vip.unittesting.unittesting.data.SomeDataService;

//@RunWith(MockitoJUnitRunner.class)
@ExtendWith(MockitoExtension.class)
public class SomeBusinessMockTest {
	
	@InjectMocks
	SomeBusinessImpl business=new SomeBusinessImpl();
	
	@Mock
	SomeDataService dataServiceMock= mock(SomeDataService.class);
	
	
	/*
	 * @BeforeEach public void beforeTest() {
	 * business.setSomeDataService(dataServiceMock);
	 * 
	 * }
	 */
	
	@Test
	public void sumCalDataService() {
		
		when(dataServiceMock.retrieveAllData()).thenReturn(new int[] {1,2,3});		
		assertEquals(business.caluculateSumUsingdataService(), 6);
		
	}
	
	@Test
	public void sumCalEmpty() {
		when(dataServiceMock.retrieveAllData()).thenReturn(new int[] {});		
		assertEquals(business.caluculateSumUsingdataService(), 0);
		
	}
	
	@Test
	public void sumCal1() {
		when(dataServiceMock.retrieveAllData()).thenReturn(new int[] {5});		
		assertEquals(business.caluculateSumUsingdataService(), 5);
		
	}

}
