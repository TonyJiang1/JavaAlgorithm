package com.udemy.GCD;

public class App {
	
	public static void main(String[] args) {
		Algorithm algorithm = new Algorithm();
		
//		System.out.println(algorithm.gcdIterative(7, 63));
		long startTime = System.nanoTime();
		System.out.println(algorithm.gcdRecursive(48124142, 613032492));
		long endTime = System.nanoTime();
		System.out.println("Time spent: " + (endTime - startTime)/1000 + " ms");
		
	}
}
