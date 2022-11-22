package com.saurabh.array;

public class ArrayReverse {
	public static void main(String[] args) {
		int[] arr= {4,5,2,3,8,7,6,9};
		
		System.out.println("Direct Reverse of array is :");
		for(int i=arr.length-1;i>=0;i--) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		System.out.println("After Two pointer Reverse");
		int start=0,end=arr.length-1;
		while(start<end) {
			int temp=arr[start];
			arr[start]=arr[end];
			arr[end]=temp;
			start++;
			end--;
		}
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]+" ");
		
	}

}
