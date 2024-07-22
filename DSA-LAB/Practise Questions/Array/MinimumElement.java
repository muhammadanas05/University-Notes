/*package whatever //do not write package name here */
import java.io.*;

class GFG {

// Function to find the minimum value
static int findMin(int arr[], int n)
{
	int min_ele = arr[0];

	// Traversing over array to
	// find minimum element
	for (int i = 0; i < n; i++) {
	if (arr[i] < min_ele) {
		min_ele = arr[i];
	}
	}

	return min_ele;
}

public static void main (String[] args) {
	int arr[] = { 5, 6, 1, 2, 3, 4 };
	int N = arr.length;
	System.out.println(findMin(arr, N));
}
}

// This code is contributed by aadityaburujwale.
