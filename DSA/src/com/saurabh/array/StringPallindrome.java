package com.saurabh.array;

public class StringPallindrome {
	public static void main(String[] args) {
		String s = "ZEPPEZ";
		char arr[] = s.toCharArray();
		int start = 0;
		int end = arr.length - 1;
		boolean flag = false;
		while (start < end) {
			if (arr[start] == arr[end]) {
				flag = true;
				start++;
				end--;
			} else {
				flag = false;
				start++;
				end--;
			}

		}
		if(flag==true)
			System.out.println("String is pallindrome");
		else
			System.out.println("String is not pallindrome");

	}

}
