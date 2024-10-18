package com.example.demo;

public class MinArray {

	static int minimum(int[] arr)
	{
		
		int min=arr[0];
		
		for(int i=0;i<arr.length;i++)
		{
			
			

			if(arr[i]<min)
			{
				
				min=arr[i];
			
			}
		}
		
		
		return min;
		
		
		
	}
	public static void main(String[] args) {
		
		int[] arr= {10,4,3,5,3,4};
		System.out.println(minimum(arr));
	}
	
}
