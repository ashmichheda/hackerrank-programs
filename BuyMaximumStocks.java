package com.prog.HackerRankPrograms;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BuyMaximumStocks {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int stockPrices[] = new int[n];
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		// taking inputs of stock prices
		for(int i = 0; i<n; i++)
			stockPrices[i] = Integer.parseInt(st.nextToken());
		
		long k = Long.parseLong(br.readLine());
		
		// logic for buying maximum stocks
		long noOfStocks = 0, temp = 0;
		for(int i = 0; i<n; i++)
		{
			temp = i+1;
			while(temp > 0)
			{
				if(stockPrices[i] < k)
				{
					noOfStocks++;
					k = k - stockPrices[i];
				}
				else
					break;
				temp--;
			}
		}
		System.out.println(/*"max no of stocks: "+*/noOfStocks);
	}

}
