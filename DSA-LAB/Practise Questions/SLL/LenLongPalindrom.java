// Java program to find longest palindrome 
// sublist in a list in O(1) time. 
class GfG 
{ 

//structure of the linked list 
static class Node 
{ 
	int data; 
	Node next; 
}

// function for counting the common elements 
static int countCommon(Node a, Node b) 
{ 
	int count = 0; 

	// loop to count common in the list starting 
	// from node a and b 
	for (; a != null && b != null;
			a = a.next, b = b.next) 

		// increment the count for same values 
		if (a.data == b.data) 
			++count; 
		else
			break; 

	return count; 
} 

// Returns length of the longest palindrome 
// sublist in given list 
static int maxPalindrome(Node head) 
{ 
	int result = 0; 
	Node prev = null, curr = head; 

	// loop till the end of the linked list 
	while (curr != null) 
	{ 
		// The sublist from head to current 
		// reversed. 
		Node next = curr.next; 
		curr.next = prev; 

		// check for odd length 
		// palindrome by finding 
		// longest common list elements 
		// beginning from prev and 
		// from next (We exclude curr) 
		result = Math.max(result, 
					2 * countCommon(prev, next)+1); 

		// check for even length palindrome 
		// by finding longest common list elements 
		// beginning from curr and from next 
		result = Math.max(result, 
					2*countCommon(curr, next)); 

		// update prev and curr for next iteration 
		prev = curr; 
		curr = next; 
	} 
	return result; 
} 

// Utility function to create a new list node 
static Node newNode(int key) 
{ 
	Node temp = new Node(); 
	temp.data = key; 
	temp.next = null; 
	return temp; 
} 

/* Driver code*/
public static void main(String[] args) 
{ 
	/* Let us create a linked lists to test 
	the functions 
	Created list is a: 2->4->3->4->2->15 */
	Node head = newNode(2); 
	head.next = newNode(4); 
	head.next.next = newNode(3); 
	head.next.next.next = newNode(4); 
	head.next.next.next.next = newNode(2); 
	head.next.next.next.next.next = newNode(15); 

	System.out.println(maxPalindrome(head)); 
} 
} 

// This code is contributed by 
// Prerna Saini.
