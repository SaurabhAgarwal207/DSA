package com.saurabh.array;

public class RemoveEvenIntegerFromArray {
	public static void main(String[] args) {
		//array input
		int arr[] = { 5, 8, 4, 3, 9, 2 };
		int count = 0;
		//For loop to get odd count
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 != 0) {
				count++;
			}
		}
		int oddarr[] = new int[count];
		int res = 0;
		// For loop to check odd elements and add to odd array
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 != 0) {
				oddarr[res] = arr[i];
				res++;
			}
		}

		System.out.println("odd array is  :");
		for (int i = 0; i < oddarr.length; i++)
			System.out.println(oddarr[i]);
	}

}
