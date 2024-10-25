package com.example.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ClassPresidentElection {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of students ");
        int n = scanner.nextInt();
        System.out.print("Enter the length of the song  ");
        int k = scanner.nextInt();

         int lastStudent = findLastStudent(n, k);
        System.out.println("The last student remaining is: " + lastStudent);
        
        scanner.close();
    }

    public static int findLastStudent(int n, int k) {
         List<Integer> students = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            students.add(i);
        }

         int index = 0;

         while (students.size() > 1) {
             index = (index + k - 1) % students.size();
            System.out.println("Removing student: " + students.get(index));
             students.remove(index);
        }

         return students.get(0);
    }
}
