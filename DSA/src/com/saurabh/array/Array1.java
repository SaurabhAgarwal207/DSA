package com.saurabh.array;

import java.util.Scanner;

public class Array1 {
	public static void main(String[] args) {
		
		int arr[]=getArray(5);
		printArray(arr);

	}
	static void printArray(int[] arr) {
		System.out.println("Array elements are :");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	static int[] getArray(int size) {
		System.out.println("Please enter array elements");
		int arr[] = new int[size];
		Scanner scan = new Scanner(System.in);
		for(int i=0;i<size;i++)
			arr[i]=scan.nextInt();
		return arr;
	}
}
