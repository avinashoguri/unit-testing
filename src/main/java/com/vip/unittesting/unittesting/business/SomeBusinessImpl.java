package com.vip.unittesting.unittesting.business;

import java.util.Arrays;

import com.vip.unittesting.unittesting.data.SomeDataService;

public class SomeBusinessImpl {


	private SomeDataService someDataService;


	public void setSomeDataService(SomeDataService someDataService) {
		this.someDataService = someDataService;
	}
	
	public int caluculateSum(int[] data) {
		return Arrays.stream(data).reduce(Integer::sum).orElse(0);

		/*
		 * int sum=0; for(int value:data) { sum += value; } return sum;
		 */
	}

	public int caluculateSumUsingdataService() {

		
		  //int [] someData = someDataService.retrieveAllData();
		  return Arrays.stream(someDataService.retrieveAllData()).reduce(Integer::sum).orElse(0);
		 
			/*
			 * int sum=0; int [] someData = someDataService.retrieveAllData(); for(int s :
			 * someData) {
			 * 
			 * sum+= s; } return sum;
			 */

	}


	
}
