// Java program to rotate a linked list block wise 
import java.util.*;
class GFG
{

/* Link list node */
static class Node 
{ 
	int data; 
	Node next; 
}; 
static Node tail;

// Recursive function to rotate one block 
static Node rotateHelper(Node blockHead, 
						Node blockTail, 
						int d, 
						int k) 
{ 
	if (d == 0) 
		return blockHead; 

	// Rotate Clockwise 
	if (d > 0) 
	{ 
		Node temp = blockHead; 
		for (int i = 1; temp.next.next!=null && 
						i < k - 1; i++) 
			temp = temp.next; 
		blockTail.next = blockHead; 
		tail = temp; 
		return rotateHelper(blockTail, temp, 
							d - 1, k); 
	} 

	// Rotate anti-Clockwise 
	if (d < 0) 
	{ 
		blockTail.next = blockHead; 
		tail = blockHead; 
		return rotateHelper(blockHead.next, 
				blockHead, d + 1, k); 
	} 
	return blockHead;
} 

// Function to rotate the linked list block wise 
static Node rotateByBlocks(Node head, 
								int k, int d) 
{ 
	// If length is 0 or 1 return head 
	if (head == null || head.next == null) 
		return head; 

	// if degree of rotation is 0, return head 
	if (d == 0) 
		return head; 

	Node temp = head;
	tail = null; 

	// Traverse upto last element of this block 
	int i; 
	for (i = 1; temp.next != null && i < k; i++) 
		temp = temp.next; 

	// storing the first node of next block 
	Node nextBlock = temp.next; 

	// If nodes of this block are less than k. 
	// Rotate this block also 
	if (i < k) 
		head = rotateHelper(head, temp, d % k, 
								i); 
	else
		head = rotateHelper(head, temp, d % k, 
									k); 

	// Append the new head of next block to 
	// the tail of this block 
	tail.next = rotateByBlocks(nextBlock, k, 
									d % k); 

	// return head of updated Linked List 
	return head; 
} 

/* UTILITY FUNCTIONS */
/* Function to push a node */
static Node push(Node head_ref, int new_data) 
{ 
	Node new_node = new Node(); 
	new_node.data = new_data; 
	new_node.next = head_ref; 
	head_ref = new_node;
	return head_ref;
	
} 

/* Function to print linked list */
static void printList(Node node) 
{ 
	while (node != null) 
	{ 
		System.out.print(node.data + " "); 
		node = node.next; 
	} 
} 

/* Driver code*/
public static void main(String[] args) 
{ 

	/* Start with the empty list */
	Node head = null; 

	// create a list 1.2.3.4.5. 
	// 6.7.8.9.null 
	for (int i = 9; i > 0; i -= 1) 
		head = push(head, i); 
	System.out.print("Given linked list \n"); 
	printList(head); 

	// k is block size and d is number of 
	// rotations in every block. 
	int k = 3, d = 2; 
	head = rotateByBlocks(head, k, d); 
	System.out.print("\nRotated by blocks Linked list \n"); 
	printList(head); 
}
} 

// This code contributed by aashish1995
