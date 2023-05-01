package com.example.Knapsack;

import java.util.ArrayList;

public class SolveKnapsack {

	ArrayList<Integer> values;
	ArrayList<Integer> weights;

	public SolveKnapsack(ArrayList<Integer> values, ArrayList<Integer> weights) {
		this.values = values;
		this.weights = weights;
		createUsedItems();
	}

	int[] usedItems;
	int optimalValue = 0;

	int maxWeight;
	int totalWeight = 0;

	public int[] solveKnapsack() {
		maxWeight = weights.get(0);
		algorithmKnapsack();
		return usedItems;
	}

	public void algorithmKnapsack() {

		while (values.size() > 1) {// Text dosyasındaki ilk değerler kalacak(Toplam ağırlık ve eşya sayısı)
			int largestItem = largestItem();// values.get(largestItem) Value/weight değeri en büyük item

			if (totalWeight < maxWeight && weights.get(largestItem) < maxWeight - totalWeight) {
				add(largestItem - 1);
				optimalValue = optimalValue + values.get(largestItem);
				totalWeight = totalWeight + weights.get(largestItem);
				values.remove(largestItem);
				weights.remove(largestItem);
			} else {
				values.remove(largestItem);
				weights.remove(largestItem);
			}

		}
	}

	public void add(int a) {// Alınan ürünleri 1 yaptığımız dizi
		usedItems[a] = 1;
	}

	public void createUsedItems() {// Diziyi oluşturup sıfır atıyor
		usedItems = new int[values.get(0)];
		for (int i = 0; i < values.get(0); i++) {
			usedItems[i] = 0;
		}
	}

	public int largestItem() {// Value/weight değeri en büyük itemi buluyor. Index numarasını dönüyor
		double maxRatio = 0.0;
		int maxIndex = -1;

		for (int i = 1; i <= values.size() - 1; i++) {
			double ratio = (double) values.get(i) / weights.get(i);
			if (ratio > maxRatio) {
				maxRatio = ratio;
				maxIndex = i;
			}
		}
		return maxIndex;
	}
}