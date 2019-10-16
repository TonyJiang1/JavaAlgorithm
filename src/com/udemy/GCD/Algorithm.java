package com.udemy.GCD;

public class Algorithm {
	
	public int gcdIterative(int i, int j) {
			
		while(j != 0) {
			int temp = j;
			j = i % j;
			i = temp;
		}
		
		return i;
		
	}
	
	public int gcdRecursive(int i, int j) {
		
		if (j == 0)
			return i;
		return gcdRecursive(j, i % j);
		
	}
}
