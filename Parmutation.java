package com.example.demo;

import org.hibernate.internal.build.AllowSysOut;

public class Parmutation {

	
	static boolean permuatation(String s1, String s2)
	{
		
		
		char[] ch1=s1.toCharArray();
		char[] ch2=s2.toCharArray();
		
		for(int i=0;i<ch1.length-1;i++)
		{
			
			for(int j=0;j<ch2.length-1;j++)
			{
				
				if(ch1[i]==ch2[j] && ch1[i+1]==ch2[j+1])
				{
					
					return true;
				}
				else
				{
					if(ch1[i]==ch2[j+1] && ch1[i+1]==ch2[j-1])
					{
						
						return true;
					}
					
				}
	
			}
			
			
		}
		
		return false;
		
		
	}
	
	public static void main(String[] args)
	{
		
		String s1="ba";
		String s2="ccabc";
		
		System.out.println(permuatation(s1,s2));
		
		
	}
	
}
