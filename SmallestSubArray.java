package com.example.demo;

import java.util.Iterator;

public class SmallestSubArray {
	
	static int smallest(int[] arr, int k) {
		
		int max=Integer.MAX_VALUE;

		for(int i=0;i<arr.length;i++)
		{
			int sum=0;

			for(int j=i;j<arr.length;j++)
			{
				sum+=arr[j];
				
				if(sum==k)
				{
					System.out.println("before=="+max);

					max=Math.min(max, (j-i+1));
					System.out.println("after=="+max);

 				}
				
			}
			
		}

		return max;
		
		
	}
public static void main(String[] args) {
	int[] arr = {2, 4, 6, 10, 2, 1};
	int k = 12 ;
	    System.out.println(smallest(arr,k));
	
}
}
