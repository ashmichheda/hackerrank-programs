package com.prog.HackerRankPrograms;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.util.Arrays;

public class MiniAndMaxSum {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input[] = br.readLine().split(" ");
		BigDecimal sumArray[] = new BigDecimal[5];
		sumArray[0] = (new BigDecimal(input[0]));
		sumArray[1] = (new BigDecimal(input[1]));
		sumArray[2] = (new BigDecimal(input[2]));
		sumArray[3] = (new BigDecimal(input[3]));
		sumArray[4] = (new BigDecimal(input[4]));
		Arrays.sort(sumArray);
		BigDecimal minSum = sumArray[0].add(sumArray[1]).add(sumArray[2]).add(sumArray[3]);
		BigDecimal maxSum = sumArray[1].add(sumArray[2]).add(sumArray[3]).add(sumArray[4]);
		System.out.println(minSum + " "+maxSum);

	}

}
