package com.saurabh.array;

import java.util.Scanner;

public class MinimumArrayElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Array size");
		int size = scan.nextInt();
		int arr[]=getArray(size);
		int min =findMinimum(arr);
		System.out.println("Minimum is : "+min);
	}

	public static int[] getArray(int length) {
		System.out.println("Please enter array elements");
		Scanner scan = new Scanner(System.in);
		int[] arr = new int[length];
		for (int i = 0; i < length; i++)
			arr[i] = scan.nextInt();
		return arr;
	}
	public static int findMinimum(int[] arr) {
		int min=Integer.MAX_VALUE;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<min)
				min=arr[i];
		}
		return min;
	}
	

}
