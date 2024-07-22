// Java code to implement the approach

import java.io.*;
import java.util.*;

class GFG {

	// Function to return the union of two arrays
	public static ArrayList<Integer>
	Unionarray(int arr1[], int arr2[], 
			int n, int m)
	{
		TreeSet<Integer> set = new TreeSet<>();
		
		// Remove the duplicates from arr1[]
		for (int i : arr1)
			set.add(i);
	
		// Remove duplicates from arr2[]
		for (int i : arr2)
			set.add(i);
	
		// Loading set to array list
		ArrayList<Integer> list 
			= new ArrayList<>();
		for (int i : set)
			list.add(i);

		return list;
	}

	// Driver code
	public static void main(String[] args)
	{
		int arr1[] = { 1, 2, 2, 2, 3 };
		int arr2[] = { 2, 3, 3, 4, 5, 5 };
		int n = arr1.length;
		int m = arr2.length;
	
		// Function call
		ArrayList<Integer> uni
			= Unionarray(arr1, arr2, n, m);
		for (int i : uni) {
			System.out.print(i + " ");
		}
	}
}

// Contributed by ARAVA SAI TEJA
