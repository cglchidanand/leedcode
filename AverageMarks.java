package com.example.demo;

import java.util.HashMap;
import java.util.Map;

public class AverageMarks {
	
	public static int  bestAverageCalculator(String[][] scores) {

 	    Map<String,int[]> scoreMap = new HashMap<String,int[]>();
	    for(String[] score:scores) {
	        String name = score[0];
 	        int currentScore =Integer.parseInt(score[1]);
 
	        if(scoreMap.containsKey(name)) {
	            int[] scoreCount = scoreMap.get(name);
	            scoreCount[0] += currentScore;
	            scoreCount[1] ++;
	            scoreMap.put(name, scoreCount);
	        }
	        else {
	            int[] scoreCount = new int[]{currentScore, 1};
	            scoreMap.put(name, scoreCount);
	        }
	    }

	    int bestAverage = 0;
	    for(int[] value:scoreMap.values()) {
	        int average = (int)Math.floor(value[0]/value[1]);
	        if(average>bestAverage)
	            bestAverage = average;
	    }

	    return bestAverage;

	}
	
	public static void main(String[] args) {
		
		 String[][] st = {{"Charles", "84"},
                 {"John", "100"},
                 {"john", "37"},
                 {"John", "23"},
                 {"Charles", "2"}};
		
		int n=bestAverageCalculator(st);
System.out.println("averaage=="+n);
	}
}
