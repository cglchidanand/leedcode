package com.example.demo;

import java.io.*;
	import java.util.*;

class PascalTraingle {

	public static void printrow(int row) {
		int result = 1;
		System.out.print(result + " ");

		for (int i = 1; i < row; i++) {
			result = result * (row - i);
			result = result / i;
			System.out.print(result + " ");
		}
	}

	static int printelement(int rowno, int colno) {
		int result = 1;
		int r = rowno - 1;
		int c = colno - 1;
		for (int i = 0; i < c; i++) {
			result = result * (r - i);
			result = result / (i + 1);

		}

		return result;
	}

	public static void printpascaltraingle(int n) {
		for (int i = 1; i <= n; i++) {
			printrow(i);
			System.out.println();
		}

	}

	public static void main(String[] args) {
//printrow(6);
		printpascaltraingle(6);
		int n = printelement(6, 4);
		System.out.println(n);

	}

}
