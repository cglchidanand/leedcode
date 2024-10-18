package com.example.demo;

public class MedianOfTwoSortedArrays {

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
            int partitionX = left + (right - left) / 2;  
            int partitionY = totalHalf - partitionX;  

             int maxX = (partitionX == 0) ? Integer.MIN_VALUE : nums1[partitionX - 1];
            int minX = (partitionX == n) ? Integer.MAX_VALUE : nums1[partitionX];
            int maxY = (partitionY == 0) ? Integer.MIN_VALUE : nums2[partitionY - 1];
            int minY = (partitionY == m) ? Integer.MAX_VALUE : nums2[partitionY];

             if (maxX <= minY && maxY <= minX) {
                 if ((n + m) % 2 == 0) {
                    return (Math.max(maxX, maxY) + Math.min(minX, minY)) / 2.0;
                } else {
                    return Math.max(maxX, maxY);
                }
            } else if (maxX > minY) {
                 right = partitionX - 1;
            } else {
                 left = partitionX + 1;
            }
        }

         throw new IllegalArgumentException("Input arrays are not sorted.");
    }

    public static void main(String[] args) {
     
        int[] nums3 = {1, 2,4,6,9,11,13,17};
        int[] nums4 = {7,9,13,17,18,21,22};

        double   median = findMedianSortedArrays(nums3, nums4);
        System.out.println("Median: " + median); 
    }
    
  
}

