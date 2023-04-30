package com.example.Knapsack;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
	
		String path = "C:/campspring/Knapsack/src/main/java/com/example/Knapsack/ks_19_0";
		
		ReadFromFile readFromFile = new ReadFromFile();
		
		ArrayList<Integer> values = readFromFile.getValues(path);
		ArrayList<Integer> weights = readFromFile.getWeights(path);


		
		SolveKnapsack solveKnapsack = new SolveKnapsack(values,weights);
		int[] usedItems = solveKnapsack.solveKnapsack();
		for (int i = 0; i < usedItems.length; i++) {
			System.out.println(usedItems[i]);
		}
		
		
//		System.out.println(solveKnapsack.optimalValue);
//		optimal value değerini ekrana bas sonra foreaach ile return edilen diziyi gez
		
	}
}