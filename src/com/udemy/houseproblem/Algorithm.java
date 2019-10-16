package com.udemy.houseproblem;

public class Algorithm {

	public int factorial(int n) {
		
		if(n == 1) return 1;
		return n * factorial(n - 1);
		
	}

}
