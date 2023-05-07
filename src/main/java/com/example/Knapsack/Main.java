package com.example.Knapsack;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {

		String path = "ks_4_0";

		ReadFromFile readFromFile = new ReadFromFile();

		ArrayList<Integer> values = readFromFile.getValues(path);
		ArrayList<Integer> weights = readFromFile.getWeights(path);

		SolveKnapsack solveKnapsack = new SolveKnapsack(values, weights);
		int[] usedItems = solveKnapsack.solveKnapsack();
		
		System.out.println(solveKnapsack.optimalValue);
		
		for (int i = 0; i < usedItems.length; i++) {
			System.out.print(usedItems[i] + " ");
		}	
	}
}