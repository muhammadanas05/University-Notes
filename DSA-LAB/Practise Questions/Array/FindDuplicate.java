// Java Code for above approach
import java.util.*;

public class Solution {
static ArrayList<Integer> duplicates(int arr[], int n)
{

	// Increment array elements by 1
	for (int i = 0; i < n; i++) {
	arr[i] += 1;
	}

	// result list
	ArrayList<Integer> res = new ArrayList<>();

	// count variable for count of
	// largest element
	int count = 0;

	for (int i = 0; i < n; i++) {

	// Calculate index value
	int index = Math.abs(arr[i]) > n
		? Math.abs(arr[i]) / (n + 1)
		: Math.abs(arr[i]);

	// Check if index equals largest element value
	if (index == n) {
		count++;
		continue;
	}

	// Get element value at index
	int val = arr[index];

	// Check if element value is negative, positive
	// or greater than n
	if (val < 0) {
		res.add(index - 1);
		arr[index] = Math.abs(arr[index]) * (n + 1);
	}
	else if (val > n)
		continue;
	else
		arr[index] = -arr[index];
	}

	// If largest element occurs more than once
	if (count > 1)
	res.add(n - 1);

	if (res.size() == 0)
	res.add(-1);
	else
	Collections.sort(res);

	return res;
}

// Driver Code
public static void main(String[] args)
{
	int numRay[] = { 0, 4, 3, 2, 7, 8, 2, 3, 1 };
	int n = numRay.length;
	ArrayList<Integer> ans = duplicates(numRay, n);
	for (Integer i : ans) {
	System.out.println(i);
	}
}
}
// This code is contributed by karandeep1234
