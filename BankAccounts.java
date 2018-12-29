package com.prog.HackerRankPrograms;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BankAccounts {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t;
		t = Integer.parseInt(br.readLine());
		while(t-- > 0)
		{
			String input[] = br.readLine().split(" ");
			int n = Integer.parseInt(input[0]);
			int k = Integer.parseInt(input[1]);
			double x = Double.parseDouble(input[2])*0.01;
			double d = Double.parseDouble(input[3]);
			int amount[] = new int[n];
			
			// taking payments inputs
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int i = 0; i<n; i++)
				amount[i] =  Integer.parseInt(st.nextToken());
			
			// logic for 1st type of banking option
			double sum = 0, max;
			for(int i = 0; i<n; i++)
			{
				max = Math.max(k, x*amount[i]);
				sum = sum + max;
			}
			// logic for 1st type of banking option
			if(sum < d)
				System.out.println("fee");
			else if(sum > d)
				System.out.println("upfront");
			else
				System.out.println("fee");
		}

	}

}
