package com.udemy.search;

public class App {
	
	public static void main(String[] args) {
		int[] array = {1, 3, 5, 6, 7, 88};
		
		int item = 6;
		
		Algorithm algorithm = new Algorithm(array);
		System.out.println(algorithm.binarySearch(0, array.length - 1, item));
	}
}
