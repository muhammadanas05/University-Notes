// Java implementation to count subarrays with
// equal number of 1's and 0's
import java.util.*;

class GFG {

	// function to count subarrays with
	// equal number of 1's and 0's
	static int countSubarrWithEqualZeroAndOne(int arr[],
											int n)
	{
		// 'um' implemented as hash table to store
		// frequency of values obtained through
		// cumulative sum
		Map<Integer, Integer> um = new HashMap<>();
		int curr_sum = 0;

		// Traverse original array and compute cumulative
		// sum and increase count by 1 for this sum
		// in 'um'. Adds '-1' when arr[i] == 0
		for (int i = 0; i < n; i++) {
			curr_sum += (arr[i] == 0) ? -1 : arr[i];
			um.put(curr_sum, um.get(curr_sum) == null
								? 1
								: um.get(curr_sum) + 1);
		}

		int count = 0;

		// traverse the hash table 'um'
		for (Map.Entry<Integer, Integer> itr :
			um.entrySet()) {

			// If there are more than one prefix subarrays
			// with a particular sum
			if (itr.getValue() > 1)
				count += ((itr.getValue()
						* (itr.getValue() - 1))
						/ 2);
		}

		// add the subarrays starting from 1st element and
		// have equal number of 1's and 0's
		if (um.containsKey(0))
			count += um.get(0);

		// required count of subarrays
		return count;
	}

	// Driver program to test above
	public static void main(String[] args)
	{
		int arr[] = { 1, 0, 0, 1, 0, 1, 1 };
		int n = arr.length;
		System.out.println(
			"Count = "
			+ countSubarrWithEqualZeroAndOne(arr, n));
	}
}

// This code is contributed by Rajput-Ji
