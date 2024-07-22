// Java program to reverse a linked 
// list using two pointers. 
import java.util.*; 

class Main { 

	// Link list node 
	static class Node { 
		int data; 
		Node next; 
	}; 

	static Node head_ref = null; 

	// Function to reverse the linked 
	// list using 2 pointers 
	static void reverse() 
	{ 
		Node prev = null; 
		Node current = head_ref; 

		// At last prev points to new head 
		while (current != null) { 

			// This expression evaluates from left to right 
			// current.next = prev, changes the link from 
			// next to prev node 
			// prev = current, moves prev to current node 
			// for next reversal of node This example of 
			// list will clear it more 1.2.3.4 initially 
			// prev = 1, current = 2 Final expression will 
			// be current = 1^2^3^2^1, as we know that 
			// bitwise XOR of two same numbers will always 
			// be 0 i.e; 1^1 = 2^2 = 0 After the evaluation 
			// of expression current = 3 that means it has 
			// been moved by one node from its previous 
			// position 
			Node next = current.next; 
			current.next = prev; 
			prev = current; 
			current = next; 
		} 
		head_ref = prev; 
	} 

	// Function to push a node 
	static void push(int new_data) 
	{ 

		// Allocate node 
		Node new_node = new Node(); 

		// Put in the data 
		new_node.data = new_data; 

		// Link the old list of the new node 
		new_node.next = (head_ref); 

		// Move the head to point to the new node 
		(head_ref) = new_node; 
	} 

	// Function to print linked list 
	static void printList() 
	{ 
		Node temp = head_ref; 
		while (temp != null) { 
			System.out.print(temp.data + " "); 
			temp = temp.next; 
		} 
	} 

	// Driver code 
	public static void main(String[] args) 
	{ 
		push(20); 
		push(4); 
		push(15); 
		push(85); 

		System.out.print("Given linked list\n"); 
		printList(); 
		reverse(); 
		System.out.print("\nReversed Linked list \n"); 
		printList(); 
	} 
} 

// This code is contributed by rutvik_56
