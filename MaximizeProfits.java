package com.prog.HackerRankPrograms;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class MaximizeProfits {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int bitcoins[], dollar[];
		StringTokenizer st, st1;
		String input[] = br.readLine().split(" ");
		int n = Integer.parseInt(input[0]);
		int m = Integer.parseInt(input[1]);
		int k = Integer.parseInt(input[2]);
		st = new StringTokenizer(br.readLine());
		st1 = new StringTokenizer(br.readLine());
		bitcoins = new int[n];
		dollar = new int[n];
		int maximumDollarVal = m*k;
		// input for m bit coins
		for(int i = 0; i<n; i++)
			bitcoins[i] = Integer.parseInt(st.nextToken());
		
		// input for m dollar coins
		for(int i = 0; i<n; i++)
			dollar[i] = Integer.parseInt(st1.nextToken());
		
		// logic for maximize profit
		for(int i = 0; i<n; i++)
		{
			if(m*bitcoins[i]*dollar[i] > maximumDollarVal)
				maximumDollarVal = bitcoins[i]*dollar[i]*m;
		}
		
		System.out.println(maximumDollarVal);
		

	}

}
