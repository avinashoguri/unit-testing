package com.vip.unittesting.unittesting.spike;

import org.junit.Test;
//import org.skyscreamer.jsonassert.JSONAssert;


public class JsonAssertTest {
	
	String act="{\"id\":1,\"name\":\"Ball\",\"price\":10,\"qty\":100}";
	
	
	@Test
	public void jsonAsseert() {
		String exp="{\"id\":1,\"name\":\"Ball\",\"price\":10,\"qty\":100}";
		//JSONAssert.assertEquals(exp, act, true);
	}

}
