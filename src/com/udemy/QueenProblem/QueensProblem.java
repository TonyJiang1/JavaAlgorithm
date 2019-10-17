package com.udemy.QueenProblem;

public class QueensProblem {
	
	private int[][] chessTable;
	private int numOfQueens;
	
	public QueensProblem(int numOfQueens) {
		this.chessTable = new int[numOfQueens][numOfQueens];
		this.numOfQueens = numOfQueens;
	}
	
	public void solve() {
		if (setQueens(0)) {
			printQueens();
		} else {
			System.out.println("There is no feasible solution...");
		}
	}

	private void printQueens() {
		// print out where is the Queen
		for(int i = 0; i < chessTable.length; i++) {
			for(int j = 0; j < chessTable.length; j++) {
				if(chessTable[i][j] == 1) {
					System.out.print(" * ");
				} else {
					System.out.print(" - ");
				}
			}
			System.out.println();
		}
		
	}

	private boolean setQueens(int colNumber) {
		
		if (colNumber == numOfQueens)
			return true;
		for(int rowNumber = 0; rowNumber < numOfQueens; rowNumber++) {
			
			if(isPlaceValid(rowNumber, colNumber)) {
				chessTable[rowNumber][colNumber] = 1;
				
				if(setQueens(colNumber + 1)) {
					return true;
				}
			}
			
			
			chessTable[rowNumber][colNumber] = 0;
		}
		return false;
	}

	private boolean isPlaceValid(int rowNumber, int colNumber) {

		for(int i = 0; i < colNumber; i++) {
			if(chessTable[rowNumber][i] == 1)
				return false;
		}
		for(int i = rowNumber, j = colNumber; i >= 0 && j >= 0; i--, j--) {
			if(chessTable[i][j] == 1)
				return false;
		}
		for(int i=rowNumber, j = colNumber; i< chessTable.length && j >= 0; i++, j--) {
			if(chessTable[i][j] == 1)
				return false;			
		}
		return true;
	}
}
