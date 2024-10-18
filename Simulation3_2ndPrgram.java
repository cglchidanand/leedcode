package com.example.demo;

import java.util.HashMap;

public class Simulation3_2ndPrgram {
	public static boolean stringCharactersComparison(String input,String input1){
        int a= input.length();
        int b=input1.length();
        if(a!=b){
            return false;
        }
        HashMap<Character, Integer> hashMap = new HashMap<>();
        for (char c : input.toCharArray()) {
            hashMap.put(c, hashMap.getOrDefault(c, 0) + 1);
        }

        for (char c : input1.toCharArray()) {
            if (!hashMap.containsKey(c) || hashMap.get(c) == 0){
                return false;
            }
            hashMap.put(c, hashMap.get(c) - 1);
        }
        for (int num : hashMap.values()) {
            if (num != 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        String word1="abc";
        String word2="bca";
        String word3="a";
        String word4="aaa";
        String word5="avda";
        String word6="rwhf";
        System.out.println(stringCharactersComparison(word1,word2));
        System.out.println(stringCharactersComparison(word3,word4));
        System.out.println(stringCharactersComparison(word5,word6));
    }
}
