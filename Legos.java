package com.prog.HackerRankPrograms;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Legos {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t;
		String input[];
		int totalValueGiven, totalValueLeft, totalValue;
		t = Integer.parseInt(br.readLine());
		while(t-- > 0)
		{
			input = br.readLine().split(" ");
			int uniquePieces[] = new int[input.length];
			uniquePieces[0] = Integer.parseInt(input[0]);
			uniquePieces[1] = Integer.parseInt(input[1]);
			uniquePieces[2] = Integer.parseInt(input[2]);
			uniquePieces[3] = Integer.parseInt(input[3]);
			totalValue = uniquePieces[0]*uniquePieces[1]*uniquePieces[2]*uniquePieces[3]; 
			
			input = br.readLine().split(" ");
			int valueOfPiecesGiven[] = new int[input.length];
			valueOfPiecesGiven[0] = Integer.parseInt(input[0]);
			valueOfPiecesGiven[1] = Integer.parseInt(input[1]);
			
			totalValueGiven = valueOfPiecesGiven[0]*valueOfPiecesGiven[1];
			totalValueLeft = totalValue/totalValueGiven;
			System.out.println(totalValueLeft);
		}

	}

}
