package com.udemy.quickselect;


public class App {
	public static void main(String[] args) {
		
		int[] nums= {8, 1, 3, 6, 5, 4};
		Quickselect quickselect = new Quickselect(nums);
		
		int k = 3;
		if (k > nums.length) {
			System.out.println("Wrong input of k"); 
		} else {
			System.out.println("The "+ k+ "th largest number is "+ quickselect.select(k));
		}
		
		
	}
}
