// Simple Java program to find the pair 
// with sum closest to a given no. 
import java.util.*; 

class GFG { 

// Function to Prints the pair with sum closest to x 
public static void printClosest(int[] arr, int n, int x) 
{ 
	int res_l = 0, 
	res_r = 0; // To store indexes of result pair 

	// variable to store current minimum difference 
	int temp = Integer.MAX_VALUE; 

	// iterating over array 
	for (int i = 0; i < n - 1; i++) { 
	for (int j = i + 1; j < n; j++) { 
		// if found more closest pair 
		if (Math.abs(arr[i] + arr[j] - x) < temp) { 
		res_l = i; 
		res_r = j; 
		temp = Math.abs(arr[i] + arr[j] - x); 
		} 
	} 
	} 

	System.out.println("The closest pair is "
					+ arr[res_l] + " and "
					+ arr[res_r]); 
} 

// Driver program to test above functions 
public static void main(String[] args) 
{ 
	int[] arr = { 10, 22, 28, 29, 30, 40 }; 
	int x = 54; 
	int n = arr.length; 
	printClosest(arr, n, x); 
} 
} 

// This code is Contributed by Prasad Kandekar(prasad264)
