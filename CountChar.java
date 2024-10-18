package com.example.demo;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
public class CountChar {

	
	public static void main(String[] args) {
 

		        String word1 = "cabbba";

		        String word2 = "abbccc";


		        boolean a = swap(word1,word2);
		        System.out.println(a);
		    }

		    static boolean swap(String word1,String word2){

		        boolean non = false;
		        char ch[] = word1.toCharArray();

		        char ch1[] = word2.toCharArray();
		        if(word1.length()!=word2.length()){

		            return false;
		        }


		       int end = ch.length-1;

		        for(int i =0;i<ch.length;i++){


		            if(ch[i]==ch1[i]){

		                ch1[i] = ch1[ch1.length-1];

		                ch1[ch1.length-1] = ch1[i];


		            }

		        }


		        String  word11 = String.valueOf(ch);

		        String word22 = String.valueOf(ch1);

		        for(int k = 0;k<word11.length();k++){


		            if(word1.charAt(k)!=word22.charAt(k)){

		                non = true;

		            }else {

		                non = false;
		            }
		        }


		        return non;
		    }
		}
