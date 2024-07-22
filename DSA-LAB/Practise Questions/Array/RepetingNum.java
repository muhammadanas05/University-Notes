// Java code for the approach

import java.util.*;

public class GFG {
	// Function to find the index of first repeating element in an array
	public static int firstRepeatingElement(int[] arr, int n) {
		// Nested loop to check for repeating elements
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				// If a repeating element is found, return its index
				if (arr[i] == arr[j]) {
					return i;
				}
			}
		}
		// If no repeating element is found, return -1
		return -1;
	}

	// Driver code
	public static void main(String[] args) {
		// Initializing an array and its size
		int[] arr = { 10, 5, 3, 4, 3, 5, 6 };
		int n = arr.length;
		// Finding the index of first repeating element
		int index = firstRepeatingElement(arr, n);

		// Checking if any repeating element is found or not
		if (index == -1) {
			System.out.println("No repeating element found!");
		}
		else {
			// Printing the first repeating element and its index
			System.out.println("First repeating element is " + arr[index]);
		}
	}
}
