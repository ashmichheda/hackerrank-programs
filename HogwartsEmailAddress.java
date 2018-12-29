package com.prog.HackerRankPrograms;

import java.util.Scanner;

public class HogwartsEmailAddress {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		
		String split_first = input.substring(0,input.indexOf("@"));
		String split_second = input.substring(input.indexOf("@")+1,input.length());
		/*System.out.println("first "+split_first);
		System.out.println("second "+split_second);*/
		
		if(input.length() >=1 && input.length()<=100)
		{
			if(split_first.length() != 5)
			{
				System.out.println("No");
				System.exit(0);
			}
			
			
			else
			{
				boolean match = false;
				
				if(split_second.matches("hogwarts.com") && split_first.equals(split_first.toLowerCase()) && split_first.matches("[a-z]"))
						match = true;
						
				if(match)
					System.out.println("Yes");
				else
					System.out.println("No");
	
			}
			sc.close();	
		}
	}

}
