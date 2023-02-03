package com.vip.unittesting.unittesting.business;

import com.vip.unittesting.unittesting.data.SomeDataService;

public class SomeBusinessImpl implements SomeDataService{
	
	
	private SomeDataService someDataService;
	
	
	public int caluculateSum(int[] data) {
		int sum=0;
		for(int value:data) {
			sum += value;
		}
		return sum;
	}


	public SomeDataService getSomeDataService() {
		return someDataService;
	}


	public void setSomeDataService(SomeDataService someDataService) {
		this.someDataService = someDataService;
	}


	public int caluculateSumUsingdataService(SomeDataService m ) {
		int sum=0;
		int [] someData = m.retrieveAllData();
		for(int s : someData) {
			sum += s;
		}
		return sum;
	}


	@Override
	public int[] retrieveAllData(){
		return null;
		}

}
