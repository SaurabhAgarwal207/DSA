package com.saurabh.array;

public class MoveZeroToEnd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 5, 0, 6, 0, 7, 8, 0 };
		int j = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != 0 && arr[j] == 0) {
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
			if (arr[j] != 0) {
				j++;
			}
		}

		for (int i = 0; i < arr.length; i++)
			System.out.print(arr[i] + " ");

	}

}
