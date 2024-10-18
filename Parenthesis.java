package com.example.demo;

import java.util.Stack;

public class Parenthesis {


    public static boolean valid(String s)
    {
        Stack<Character> c=new Stack<>();

        for (int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='(' || s.charAt(i)=='{' || s.charAt(i)=='[')
            {
            	c.push(s.charAt(i));
            	
            }
            else
            {
            	if(!c.empty() && (
            			(c.peek()=='(' && s.charAt(i)==')') ||
            			(c.peek()=='{' && s.charAt(i)=='}') ||
            			(c.peek()=='[' && s.charAt(i)==']'))
            			)
            	{
            		c.pop();
            	}
            
            	else
            	{
            		return false;
            		
            	}
            	
            	
            }
        }
		return c.empty();


    }
    
    public static void main(String[] args) {
    	 String s = "{()}[]";
         if (valid(s))
             System.out.println("true");
         else
             System.out.println("false");
	}
}

