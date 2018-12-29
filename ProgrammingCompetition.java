package com.prog.HackerRankPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class ProgrammingCompetition {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Map<String, Integer> values = new LinkedHashMap<String, Integer>();
		List<String> names = new ArrayList<String>();
		List<Integer> questionsDec = new ArrayList<Integer>();
		List<Integer> questionsJan = new ArrayList<Integer>();
		Integer questionsSolved[] = new Integer[n];
		// taking input
		for(int i = 0; i<n; i++)
		{
			names.add(sc.next());
			questionsDec.add(sc.nextInt());
			questionsJan.add(sc.nextInt());
		}

		for(int i = 0; i<n; i++)
		{
			values.put(names.get(i), Math.abs(questionsDec.get(i)-questionsJan.get(i)));
			questionsSolved[i] = (Math.abs(questionsDec.get(i)-questionsJan.get(i)));
		}
		
		Arrays.sort(questionsSolved, Collections.reverseOrder());
		int maxNo = questionsSolved[0];
		
		for(Map.Entry<String, Integer> e1 : values.entrySet())
		{
			if(maxNo == e1.getValue())
			{
				System.out.println(e1.getKey()+" "+e1.getValue());
				break;
			}
		}
	sc.close();	
	}	
}
