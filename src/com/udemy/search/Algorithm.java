package com.udemy.search;

public class Algorithm {

	
	private int[] array;
	
	public Algorithm(int[] array) {
		this.array = array;
	}
	
	public int linearSearch(int item) {
		for(int i = 0; i < array.length; ++i) {
			if (array[i] == item)
				return i;
		}
		return -1;
	}
	
	public int binarySearch(int startIndex, int endIndex, int item) {
		if (endIndex < startIndex) {
			System.out.println("Sorry, the item is not in the array...");
			return -1;
		}
		
		int middleIndex = (startIndex+endIndex)/2;
		if(item == middleIndex) {
			System.out.println("We have found the item!");
			return middleIndex;
		} else if (middleIndex > item) {
			return binarySearch(startIndex, middleIndex - 1, item);
		} else {
			return binarySearch(middleIndex + 1, endIndex, item);
		}
			
		
	}
}
