package com.udemy.ColorProblem;

public class Algorithm {
	
	private int numOfVertexes;
	private int numOfColors;
	private int[] colors;
	private int[][] adjacencyMatrix;
	
	public Algorithm(int[][] adjancencyMatrix, int numOfColors) {
		this.numOfColors = numOfColors;
		this.adjacencyMatrix = adjancencyMatrix;
		this.numOfVertexes = adjancencyMatrix.length;
		this.colors = new int[numOfVertexes];
	}
	
	public void solve() {
		
		if(solveProblem(0)) {
			showResults();
		} else {
			System.out.println("No solution...");
		}
	}

	private boolean solveProblem(int nodeIndex) {
		
		if(nodeIndex == numOfVertexes) {
			return true;
		}
		
		for(int colorIndex=1; colorIndex<=numOfColors; colorIndex++) {
			if( isColorVslid(nodeIndex, colorIndex)) {
				colors[nodeIndex] = colorIndex;
				
				if(solveProblem(nodeIndex + 1)) {
					return true;
				}
				
				//Backtrack
			}
		}
		
		
		return false;
	}

	private boolean isColorVslid(int nodeIndex, int colorIndex) {
		
		for(int i =0; i<numOfVertexes;i++) {
			if(adjacencyMatrix[nodeIndex][i] == 1 && colorIndex == colors[i])
				return false;
		}
		return true;
	}

	private void showResults() {
		for(int i =0; i<numOfVertexes;i++) {
			System.out.println("Node "+(i+1)+" has color index: "+colors[i]);
		}
		
	}
}
