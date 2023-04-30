package com.example.Knapsack;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class ReadFromFile {
	
	public ArrayList<Integer> getValues(String path) {

		ArrayList<Integer> values = new ArrayList<Integer>();
		try {
			BufferedReader br = new BufferedReader(new FileReader(path));
			String line;
			while ((line = br.readLine()) != null) {
				String[] value = line.split(" "); 
				int x = Integer.parseInt(value[0]);
				values.add(x);
			}
			br.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return values;
	}

	public ArrayList<Integer> getWeights (String path) {

		ArrayList<Integer> weights  = new ArrayList<Integer>();
		try {
			BufferedReader br = new BufferedReader(new FileReader(path));
			String line;
			while ((line = br.readLine()) != null) {
				String[] value = line.split(" "); 
				int x = Integer.parseInt(value[1]);
				weights.add(x);
			}
			br.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return weights;
	}
}