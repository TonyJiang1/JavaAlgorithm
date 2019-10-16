package com.udemy.Hanoi;

public class Algorithm {
	
	public void solveHanoi (int n, char rodFrom, char rodMiddle, char rodTo) {

		//base case
		if (n == 1) {
			System.out.println("Plate 1 from " + rodFrom + " to "+ rodTo);
			return;
		}
		solveHanoi(n - 1, rodFrom, rodTo, rodMiddle);
		System.out.println("Plate "+n+" from " + rodFrom + " to "+ rodTo);
		solveHanoi(n - 1, rodMiddle, rodFrom, rodTo);
	}
}
