package com.example.demo;

import java.util.ArrayList;
class StringPrefixSearch{
    
  	static String isPrefixOfWord(String sentence, 
	                             String Word) 
	{ 
	    String a[] = sentence.split(" ");
	   
 	    ArrayList<String> v = new ArrayList<>();
	     
 	    for(String e : a)
	        v.add(e);
	     
 	    for(int i = 0; i < v.size(); i++)
	    { 
	         
 	        for(int j = 0; j < v.get(i).length(); j++)
	        { 
	             
 	            if (v.get(i).charAt(j) != Word.charAt(j)) 
	                break; 
	                 
 	            else if (j == Word.length() - 1) 
	             
 	                return v.get(i); 
	        } 
	    } 
	     
 	    return "-1"; 
	} 
	 
 	public static void main(final String[] args) 
	{
	    String s = "Welcome to Geeksforgeeks"; 
	    String word = "Gee"; 
	   
	    System.out.println(isPrefixOfWord(s, word));
	}
	}
	 