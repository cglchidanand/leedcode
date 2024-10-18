package com.example.demo;

public class Simulation3 {

	static int sum(int[] arr,int k)
	{
		
		int sum=0;
		int j=1;
		int n=arr.length-1;
		for(int i=n;i>=0;i--)
		{
			
  			if(j<=k)
			{
				sum+=arr[i];
			}
			j++;
			
		}
		return sum;
		
		
	}
	public static void main(String[] args) {
		
		int[] arr= {2,2,3};
		int k=2;
		int sum=sum(arr,k);
		System.out.println(sum);
	}
}
