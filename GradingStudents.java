package com.prog.HackerRankPrograms;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class GradingStudents {

	private static final Scanner scan = new Scanner(System.in);
	public static void main(String[] args) throws IOException {
		 BufferedWriter bw = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

	        int n = Integer.parseInt(scan.nextLine().trim());
	        int[] grades = new int[n];

	        for (int gradesItr = 0; gradesItr < n; gradesItr++) {
	            int gradesItem = Integer.parseInt(scan.nextLine().trim());
	            grades[gradesItr] = gradesItem;
	        }

	        int[] result = gradingStudents(grades);
	        for (int resultItr = 0; resultItr < result.length; resultItr++) {
	            bw.write(String.valueOf(result[resultItr]));

	            if (resultItr != result.length - 1) {
	                bw.write("\n");
	            }
	        }
	        bw.newLine();
	        bw.close();

	}
	  static int[] gradingStudents(int[] grades) {
	        int nextMultiple = 0;
	        int result[] = new int[grades.length];
	        for(int i = 0; i<grades.length; i++){
	            if(grades[i] < 38)
	                result[i] = grades[i];
	            else{
	                nextMultiple = grades[i] + (5 - (grades[i] % 5));
	                if(nextMultiple - grades[i] < 3)
	                    result[i] = nextMultiple;
	                else
	                    result[i] = grades[i];
	            }
	        }
	    return result;
	    }
}
