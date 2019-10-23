package com.udemy.MazeSolver;

public class App {
	public static void main(String[] args) {
		int mazeTable[][] = { 
				{1,1,1,1,1},
				{1,0,0,1,0},
				{0,0,0,1,0},
				{1,1,1,1,1},
				{1,1,1,0,1},
				
		};
		Algorithm algorithm = new Algorithm(mazeTable);
		algorithm.solve();
	}
}
