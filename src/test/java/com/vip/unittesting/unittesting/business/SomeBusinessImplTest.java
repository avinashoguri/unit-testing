package com.vip.unittesting.unittesting.business;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class SomeBusinessImplTest {
	
	SomeBusinessImpl business=new SomeBusinessImpl();
	
	@Test
	public void sumCal() {
		int act=business.caluculateSum(new int[] {1,2,3});
		int exp=6;
		assertEquals(act, exp);
		
	}
	
	@Test
	public void sumCalEmpty() {
		int act=business.caluculateSum(new int[] {});
		int exp=0;
		assertEquals(act, exp);
		
	}
	
	@Test
	public void sumCal1() {
		int act=business.caluculateSum(new int[] {5});
		int exp=5;
		assertEquals(act, exp);
		
	}

}
