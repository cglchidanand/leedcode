package com.example.demo;

import java.util.HashSet;

public class LoopInArray {
    public static void main(String[] args) {
        int[] arr = {2, -1, 1, 2, 2};
        int loopLength = findLoopLength(arr);
        System.out.println("Length of the loop: " + loopLength);
    }

    public static int findLoopLength(int[] arr) {
        int n = arr.length;
        HashSet<Integer> visited = new HashSet<>();
        int currentIndex = 0;

        while (true) {
            if (visited.contains(currentIndex)) {
                 int loopStartIndex = currentIndex;
                int loopCount = 0;

                 do {
                    loopCount++;
                    currentIndex = (loopStartIndex + arr[loopStartIndex]) % n;
                    if (currentIndex < 0) {
                        currentIndex += n; 
                    }
                    loopStartIndex = currentIndex;
                } while (loopStartIndex != currentIndex);
                
                return loopCount;
            }

             visited.add(currentIndex);
            currentIndex = (currentIndex + arr[currentIndex]) % n;

            if (currentIndex < 0) {
                currentIndex += n; 
            }

             if (currentIndex < 0 || currentIndex >= n) {
                return -1;
            }
        }
    }
}
