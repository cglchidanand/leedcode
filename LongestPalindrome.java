package com.example.demo;

import java.util.HashMap;
import java.util.Map;

public class LongestPalindrome {

        public static void main(String[] args) {

        }


        public static int longestPalindrom(String s) {
            Map<Character, Integer> map = new HashMap();
            for (int i = 0; i < s.length(); i++) {
                map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
            }
            boolean checkOdd = false;
            int solution = 0;
            for (Map.Entry<Character, Integer> m : map.entrySet()) {
                if (m.getValue() % 2 != 0) {
                    checkOdd = true;
                }
                if (m.getValue() / 2 > 0) {
                    solution += ((m.getValue() / 2) * 2);
                }
            }
            if (checkOdd) {
                solution += 1;
            }
            return solution;
        }

    }

