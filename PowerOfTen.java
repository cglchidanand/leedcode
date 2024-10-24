package com.example.demo;

public class PowerOfTen {
	
	static boolean power(int n)
	{
		
		int pow=1;
		while(pow<n)
		{
			pow=pow*10;
			
		}
		
		if(pow==n)
		{
			return true;
		}
		
		return false;
		
	}
	
	public static void main(String[] args) {
		System.out.println(power(10));
	}
}
