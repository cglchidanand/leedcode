package com.example.demo;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class MInSlidingWindow {
	public static List<Integer> minSlidingWindow(int[] input, int k) {
		List<Integer> result = new ArrayList<>();
		int n = input.length;
	        if (input == null || n == 0 || k <= 0) {
	            return result;
	        }
	        Deque<Integer> deque = new ArrayDeque<>();

	        for (int i = 0; i < n; i++) {
	            if (!deque.isEmpty() && deque.peekFirst() < i - k + 1) {
	                deque.pollFirst();
	            }

	            while (!deque.isEmpty() && input[deque.peekLast()] > input[i]) {
	                deque.pollLast();
	            }

	            deque.offerLast(i);

	            if (i >= k - 1) {
	            	result.add(input[deque.peekFirst()]);
	            }
	        }

	        return result;
	    }
	
	public static void main(String[] args) {	
		 int[] num = {9, 1, 3, -1, 5, 3, 6, 7};
	        int k = 3;
	        List<Integer> result = minSlidingWindow(num, k);	        
 	}

}
