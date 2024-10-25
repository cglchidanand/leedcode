package com.example.demo;

import java.util.Arrays;

public class WaveSort {
    public static void main(String[] args) {
        int[] arr = {10, 5, 6, 3, 2, 20, 100, 80};
        waveSort(arr);
        
         System.out.println("Wave sorted array: " + Arrays.toString(arr));
    }

    public static void waveSort(int[] arr) {
         Arrays.sort(arr);

         for (int i = 1; i < arr.length; i += 2) {
             if (i < arr.length) {
                swap(arr, i, i - 1);
            }
        }
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}

