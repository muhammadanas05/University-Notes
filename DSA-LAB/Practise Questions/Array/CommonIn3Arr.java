/*package whatever //do not write package name here */

import java.io.*;

public class GFG {

	// Function to find the intersection of two arrays
	static void findIntersection(int[] arr1, int[] arr2,
								int[] temp, int m, int n,
								int[] k)
	{
		int i = 0, j = 0;
		// Loop to find the intersection of arr1[] and
		// arr2[]
		while (i < m && j < n) {
			// ith element can't be a common element
			if (arr1[i] < arr2[j]) {
				i++;
			}
			// jth element can't be a common element
			else if (arr2[j] < arr1[i]) {
				j++;
			}
			// if arr1[i] == arr2[j]
			else {
				temp[k[0]] = arr1[i];
				i++;
				j++;
				k[0]++;
			}
		}
	}

	public static void main(String[] args)
	{

		int[] arr1 = { 1, 5, 10, 20, 40, 80 };
		int[] arr2 = { 6, 7, 20, 80, 100 };
		int[] arr3 = { 3, 4, 15, 20, 30, 70, 80, 120 };
		int n1 = arr1.length;
		int n2 = arr2.length;
		int n3 = arr3.length;

		// temp array to store the common elements of arr1
		// and arr2 arrays
		int[] temp = new int[200000];

		// ans array to store the common elements of temp
		// and arr3 arrays
		int[] ans = new int[200000];

		int[] k = {
			0
		}; // Mutable integer to simulate pass-by-reference

		// function call to find the temp array
		findIntersection(arr1, arr2, temp, n1, n2, k);
		int tempSize = k[0];
		k[0] = 0;

		// function call to find the ans array
		findIntersection(arr3, temp, ans, n3, tempSize, k);

		System.out.println(
			"Common elements present in arrays are :");

		// Printing the common elements
		for (int i = 0; i < k[0]; i++) {
			System.out.print(ans[i] + " ");
		}
		System.out.println();
	}
}
