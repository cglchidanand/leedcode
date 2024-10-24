package com.example.demo;

import java.util.Stack;

public class RemoveChar {
	
	public String clearstar(String s) {
        Stack<Character> st = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c != '*') {
            	st.push(c);
            } else if (!st.isEmpty()) {
            	st.pop();
            }
        }

        StringBuilder sb = new StringBuilder();
        while (!st.isEmpty()) {
            sb.append(st.pop());
        }
        return sb.reverse().toString();
    }

	public static void main(String[] args) {
		RemoveChar c=new RemoveChar();
		
		String s=c.clearstar("leet**cod*e");
		System.out.println(s);
	}
}
