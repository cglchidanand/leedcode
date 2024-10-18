package com.example.demo;

import java.util.List;

public class LongestWordWithSubstring {

    public static int longestWordWithSubstring(List<String> dictionary, String substring) {
        int maxLength = 0;

        for (String word : dictionary) {
            if (word.contains(substring)) {
                maxLength = Math.max(maxLength, word.length());
            }
        }
        return maxLength;
    }
    
    
    public static int longest(List<String> sub,String st)
    {
    	int max=0;
    	for(String word: sub)
    	{
    		if(word.contains(st))
    		{
    			max=Math.max(max, word.length());
    			
    		}
    		
    	}
		return 0;
    	
    }

    public static void main(String[] args) {
        List<String> dictionary = List.of("apple", "banana", "apricot", "grape", "pineapple");
        String substring = "ap";
        int result = longestWordWithSubstring(dictionary, substring);
        System.out.println(result);  // Output: 9 (for "pineapple")
    }
}

