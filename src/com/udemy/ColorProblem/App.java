package com.udemy.ColorProblem;

public class App {

	
		public static void main(String[] args) {
			
			int[][] graphMatrix = new int[][] {
				{0,1,0,1,0},
				{1,0,1,1,0},
				{0,1,0,1,0},
				{1,1,1,0,1},
				{0,0,0,1,0}
			};
			
			int numOfColors = 3;
			Algorithm algorithm = new Algorithm(graphMatrix, numOfColors);
			
			algorithm.solve();
		}
}
