package com.example.demo;

public class MinArrayBinarySearch {
	    public static int findPeak(int[] arr) {
	    	 int n = arr.length;
	    	 int left = 1; 
	         int right = n - 2; 
	         if (arr[0] > arr[1]) {
	             return 0; 
	         }
	         if (arr[n - 1] > arr[n - 2]) {
	             return n - 1; 
	         }

	         while (left <= right) {
	             int mid = left + (right - left) / 2;

	             if (arr[mid] > arr[mid - 1] && arr[mid] > arr[mid + 1]) {
	                 return mid; 
	             }

	             if (arr[mid] < arr[mid + 1]) {
	                 left = mid + 1; 
	             } else {
	                 right = mid - 1; 
	             }
	         }

	         return -1;
	    }

	    public static void main(String[] args) {
	        int[] arr = {1, 3, 7, 8, 5, 4};
	        int peakIndex = findPeak(arr);
	        System.out.println("Peak index: " + peakIndex);
	    }
	}


