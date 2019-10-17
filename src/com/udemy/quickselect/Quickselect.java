package com.udemy.quickselect;

import java.util.Random;

public class Quickselect {

	private int[] nums;
	
	public Quickselect(int[] nums) {
		this.nums = nums;
	}
	
	
	private void swap(int i, int j) {
		int temp = nums[i];
		nums[i] = nums[j];
		nums[j] = temp;
	}
	public int select(int k) {
		return select(0, nums.length - 1, k - 1);
	}

	private int select(int startIndex, int endIndex, int k) {
		int pivot = partition(startIndex, endIndex, k);
		
		if (pivot > k){
			return select(startIndex, pivot - 1, k);
		} else if (pivot < k){
			return select(pivot + 1, endIndex, k);
		}
		return nums[k];
	}
	
	private int partition(int startIndex, int endIndex, int k) {
		
		int pivot = new Random().nextInt(endIndex - startIndex + 1) + startIndex;
		
		swap(pivot, endIndex);
		for (int i = startIndex; i < endIndex; i++) {
			if(nums[i] > nums[endIndex]) {
				swap(startIndex, i);
				startIndex++;
			}
		}
		swap(startIndex, endIndex);
		
		return startIndex;
	}
}
