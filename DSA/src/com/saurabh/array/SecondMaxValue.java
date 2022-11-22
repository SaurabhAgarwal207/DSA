package com.saurabh.array;

public class SecondMaxValue {
	public static void main(String[] args) {
		int arr[] = { 65, 34, 2, 34, 33, 1 };
		int max = Integer.MIN_VALUE;
		int smax = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				smax = max;
				max = arr[i];
			} else if (arr[i] > smax && arr[i] != max) {
				smax = arr[i];
			}
		}
		System.out.println("Second MAX is :" + smax);
	}

}
