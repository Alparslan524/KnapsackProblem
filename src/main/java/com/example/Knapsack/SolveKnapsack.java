package com.example.Knapsack;

import java.util.ArrayList;

public class SolveKnapsack {

	ArrayList<Integer> values;
	ArrayList<Integer> weights;
	
	public SolveKnapsack(ArrayList<Integer> values, ArrayList<Integer> weights) {
		this.values = values;
		this.weights = weights;
	}
	
	int[] usedItems;
	int optimalValue=0;
	
	int maxWeight;
	int totalWeight=0;
	
	
	
	public int[] solveKnapsack() {
		maxWeight = weights.get(0); 

		
		createUsedItems();
		
		int largestItem = largestItem();//values.get(largestItem) Value/weight değeri en büyük item
		
		// bir döngü veya fonksiyon içinde largest item aklenmeli =>add(largestItem);
		// daha sonra values den o değer silinmeli veya sıfıra vs işitlenmeli
		//sonra en büyük item tekrar belirlenmeli ve bu fonksiyon tekrar çağrılmalı
		//bu fonksiyonun özelliği ise totalWeight<maxWeight olasıya kadar çalışmalı. 
		//son aşamada totalWeight < max weight olursa o largest item de kaldırılmalı
		//veya totalweight < weight[i] ile total weighti en az olanlara bakılmalı
		add(largestItem);
		
		
		
		return usedItems;
	}
	
	
	
	
	
	
	
	
	public void add(int a) {
		usedItems[a-1] = 1;
	}
	
	
	public void createUsedItems() {
		usedItems = new int[values.get(0)];
		for (int i = 0; i < values.get(0); i++) {
			usedItems[i]=0;
		}
	}
	
	
	public int largestItem() {// Value/weight değeri en büyük itemi buluyor
		double maxRatio = 0.0;
		int maxIndex = -1;
		
		for (int i = 1; i <= values.get(0); i++) {
			double ratio = (double) values.get(i) / weights.get(i);
			if (ratio > maxRatio) {
				maxRatio = ratio;
				maxIndex = i;
			} 
		}
		return maxIndex;	
	}
}