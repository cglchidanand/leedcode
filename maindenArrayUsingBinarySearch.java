package com.example.demo;

public class maindenArrayUsingBinarySearch {

	
	 public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
         if (nums1.length > nums2.length) {
            int[] temp = nums1;
            nums1 = nums2;
            nums2 = temp;
        }

        int n = nums1.length;
        int m = nums2.length;
        int totalHalf = (n + m + 1) / 2;

        int left = 0, right = n;

        while (left <= right) {
            int partX = left + (right - left) / 2;  
            int partY = totalHalf - partX;  

             int maxX = (partX == 0) ? Integer.MIN_VALUE : nums1[partX - 1];
            int minX = (partX == n) ? Integer.MAX_VALUE : nums1[partX];
            int maxY = (partY == 0) ? Integer.MIN_VALUE : nums2[partY - 1];
            int minY = (partY == m) ? Integer.MAX_VALUE : nums2[partY];
            
            
        }
		return right;
	 }
	 
	 public static void main(String[] args) {
		
		 int[] arr1= {1,2,5,7,8,9,10};
		 int[] arr2= {4,7,8,9,11};
		double d= findMedianSortedArrays(arr1,arr2);
		System.out.println(d);
		 
	}
}
