/*
 * Write a method to replace all spaces in a string with '%20: You may assume 
 * that the string has sufficient space at the end to hold the additional 
 * characters, and that you are given the "true" length of the string. 
 * (Note: If implementing in Java, please use a character array so that you can 
 * perform this operation in place.)
 */

public class URLify {
	public static void main(String[] args) {
		String input;
		String output;
		input = "Mr John Smith    ";
		output = "Mr%20John%20Smith";
		System.out.println(input);
		System.out.println(toURL(input.toCharArray(), 13));
		System.out.println(output);
		System.out.println();
		input = "Mr John Smith       ";
		output = "Mr%20John%20Smith%20";
		System.out.println(input);
		System.out.println(toURL(input.toCharArray(), 14));
		System.out.println(output);
	}
	
	public static char[] toURL(char[] arr, int len) {
		// starts at end of string and builds to front
		// using a two pointer technique 
		int right = len - 1;
		int fill = arr.length - 1;
		while (right >= 0) {
			if (arr[right] == ' ') {
				arr[fill] = '0';
				fill--;
				arr[fill] = '2';
				fill--;
				arr[fill] = '%';
				fill--;
			} else {
				arr[fill] = arr[right];
				fill--;
			}
			right--;
		}
		return arr;
	}
}
