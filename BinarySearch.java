package com.example.demo;

public class BinarySearch {

	
	public static int search(int[] arr,int tar)
	{
		int left=0;
		int right=arr.length-1;
		int mid=arr.length/2;
		
		if(arr[mid]==tar)
		{
			return mid;
			
		}
		if(arr[mid]<tar)
		
		{
			left=mid+1;
			
		}
		else
		{
			right=mid-1;
			
		}
		
		return 0;
		
	}
}
