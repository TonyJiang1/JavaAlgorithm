package com.udemy.HamiltonianCycle;

public class HamiltonianCycle {
	
	private int numOfVertexes;
	private int[] hamiltonianPath;
	private int[][] adjacencyMatrix;
	
	public HamiltonianCycle(int[][] adjacencyMatrix) {
		this.adjacencyMatrix = adjacencyMatrix;
		this.numOfVertexes = adjacencyMatrix.length;
		this.hamiltonianPath = new int[adjacencyMatrix.length];
		
		hamiltonianPath[0] = 0;
		
	}
	public void solve() {
		if( findFeasibleSolution(1)) {
			printCycle();
		} else {
			System.out.println("There is no feasible solution...");
		}
	}

	private void printCycle() {
		System.out.println("Hamiltonian Cycle:");
		for(int i = 0; i < hamiltonianPath.length; i++) {
			System.out.print(hamiltonianPath[i]+ " ");
		}
		System.out.println(hamiltonianPath[0]);
		
	}

	private boolean findFeasibleSolution(int position) {
		
		if(position == numOfVertexes) {
			// check if last item is connected to the first item in Hamiltonian Path
			if(adjacencyMatrix[hamiltonianPath[position - 1]][hamiltonianPath[0]] == 1)
				return true;
			else
				return false;
		}
		
		for(int vertexIndex = 1; vertexIndex < numOfVertexes; vertexIndex++) {
			
			if(isFeasible(vertexIndex, position)) {
				hamiltonianPath[position] = vertexIndex;
				
				if(findFeasibleSolution(position + 1))
					return true;
			}
			//Backtrack
		}
		
		return false;
	}

	private boolean isFeasible(int vertexIndex, int actualPosition) {
		
		// if two vertices connected
		if (adjacencyMatrix[hamiltonianPath[actualPosition - 1]][vertexIndex] == 0)
			return false;
		
		// if visited before
		for (int i = 0; i < actualPosition; i++) {
			if (hamiltonianPath[i] == vertexIndex)
				return false;
		}
		return true;
	}
}
