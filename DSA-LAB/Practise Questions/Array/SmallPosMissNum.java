// Java Program to find the smallest positive missing number
import java.util.*;
public class GFG {

	static int solution(int[] A)
	{
		int n = A.length;
		// Let this 1e6 be the maximum element provided in
		// the array;
		int N = 1000010;

		// To mark the occurrence of elements
		boolean[] present = new boolean[N];

		int maxele = Integer.MIN_VALUE;

		// Mark the occurrences
		for (int i = 0; i < n; i++) {

			// Only mark the required elements
			// All non-positive elements and the elements
			// greater n + 1 will never be the answer
			// For example, the array will be {1, 2, 3} in
			// the worst case and the result will be 4 which
			// is n + 1
			if (A[i] > 0 && A[i] <= n)
				present[A[i]] = true;

			// find the maximum element so that if all the
			// elements are in order can directly return the
			// next number
			maxele = Math.max(maxele, A[i]);
		}

		// Find the first element which didn't
		// appear in the original array
		for (int i = 1; i < N; i++)
			if (!present[i])
				return i;

		// If the original array was of the
		// type {1, 2, 3} in its sorted form
		return maxele + 1;
	}

	// Driver Code
	public static void main(String[] args)
	{
		int arr[] = { 0, 10, 2, -10, -20 };
		System.out.println(solution(arr));
	}
}

// This code is contributed by Aditya Kumar (adityakumar129)
