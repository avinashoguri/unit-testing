package com.vip.unittesting.unittesting.business;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.atLeastOnce;
import static org.mockito.Mockito.atMost;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.provider.Arguments;
import org.mockito.ArgumentCaptor;

public class ListMockTest {
	
	List<String> mock=mock(List.class);
	
	
	@Test
	public void size_Basic() {
		when(mock.size()).thenReturn(5);
		assertEquals(5, mock.size());
		
	}
	
	@Test
	public void return_diffValues() {
		when(mock.size()).thenReturn(5).thenReturn(10);
		assertEquals(5, mock.size());
		assertEquals(10, mock.size());
		
	}
	
	@Test
	public void returnWithParameters() {
		when(mock.get(0)).thenReturn("Avinash");
		assertEquals("Avinash", mock.get(0));
		assertEquals(null, mock.get(1));
		
	}
	
	@Test
	public void returnWithGeniricParameters() {
		when(mock.get(anyInt())).thenReturn("Avinash86");
		assertEquals("Avinash86", mock.get(0));
		assertEquals("Avinash86", mock.get(1));
		
	}
	

	@Test
	public void verificationBasic() {
		
		String value1 = mock.get(0);
		String value2= mock.get(1);
		
		//verify
		verify(mock).get(0);
		//verify(mock).get(anyInt());
		verify(mock,times(2)).get(anyInt());
		verify(mock,atLeast(1)).get(anyInt());
		
		
	}
	
	
	
	@Test
	public void argumentsCapturing() {
		
		//SUT
		mock.add("SomeString");
		
		//verify 
		ArgumentCaptor<String> captor=ArgumentCaptor.forClass(String.class);
		verify(mock).add(captor.capture());
		
		assertEquals("SomeString", captor.getValue());
	}
	
	@Test
	public void multipleArgumentsCapturing() {
		
		//SUT
		mock.add("SomeString1");
		mock.add("SomeString2");
		
		//verify 
		ArgumentCaptor<String> captor=ArgumentCaptor.forClass(String.class);
		verify(mock, times(2)).add(captor.capture());
		
		List<String> allValues=captor.getAllValues();
		
		assertEquals("SomeString1", allValues.get(0));
		assertEquals("SomeString2", allValues.get(1));
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
