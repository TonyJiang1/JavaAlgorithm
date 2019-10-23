package com.udemy.FibbonacciDP;

import java.util.HashMap;
import java.util.Map;

public class Fibonacci {

	private Map<Integer,Integer> memoizeTable;
	
	public Fibonacci() {
		this.memoizeTable = new HashMap<Integer, Integer>();
		this.memoizeTable.put(0, 0);
		this.memoizeTable.put(1, 1);
	}
	
	public int fibonacciDP(int n) {
		//O(1)
		if(memoizeTable.containsKey(n)) return memoizeTable.get(n);
		
		memoizeTable.put(n-1, fibonacciDP(n-1));
		memoizeTable.put(n-2, fibonacciDP(n-2));
		
		int calculatedNumber = memoizeTable.get(n-1)+memoizeTable.get(n-2);
		
		memoizeTable.put(n, calculatedNumber);
		
		return calculatedNumber;
	}
}
