// Java implementation to find the sum of
// last 'n' nodes of the Linked List
import java.util.*;

class GFG
{
	
/* A Linked list node */
static class Node
{
	int data;
	Node next;
};
static Node head; 
static int n, sum;

// function to insert a node at the
// beginning of the linked list
static void push(Node head_ref, int new_data)
{
	/* allocate node */
	Node new_node = new Node();
	
	/* put in the data */
	new_node.data = new_data;
	
	/* link the old list to the new node */
	new_node.next = head_ref;
	
	/* move the head to point to the new node */
	head_ref = new_node;
	head = head_ref;
}

// function to recursively find the sum of last
// 'n' nodes of the given linked list
static void sumOfLastN_Nodes(Node head)
{
	// if head = NULL
	if (head == null)
		return;

	// recursively traverse the remaining nodes
	sumOfLastN_Nodes(head.next);

	// if node count 'n' is greater than 0
	if (n > 0) 
	{

		// accumulate sum
		sum = sum + head.data;

		// reduce node count 'n' by 1
		--n;
	}
}

// utility function to find the sum of last 'n' nodes
static int sumOfLastN_NodesUtil(Node head, int n)
{
	// if n == 0
	if (n <= 0)
		return 0;

	sum = 0;

	// find the sum of last 'n' nodes
	sumOfLastN_Nodes(head);

	// required sum
	return sum;
}

// Driver Code
public static void main(String[] args) 
{
	head = null;

	// create linked list 10.6.8.4.12
	push(head, 12);
	push(head, 4);
	push(head, 8);
	push(head, 6);
	push(head, 10);

	n = 2;
	System.out.print("Sum of last " + n + 
					" nodes = " + 
					sumOfLastN_NodesUtil(head, n));
}
}

// This code is contributed by 29AjayKumar
