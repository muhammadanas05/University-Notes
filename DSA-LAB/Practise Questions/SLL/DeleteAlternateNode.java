// Java program to delete alternate nodes of a linked list 
class LinkedList { 
	Node head; // head of list 

	/* Linked list Node*/
	class Node { 
		int data; 
		Node next; 
		Node(int d) 
		{ 
			data = d; 
			next = null; 
		} 
	} 

	void deleteAlt() 
	{ 
		if (head == null) 
			return; 

		Node node = head; 

		while (node != null && node.next != null) { 
			/* Change next link of next node */
			node.next = node.next.next; 

			/*Update ref node to new alternate node */
			node = node.next; 
		} 
	} 

	/* Utility functions */

	/* Inserts a new Node at front of the list. */
	public void push(int new_data) 
	{ 
		/* 1 & 2: Allocate the Node & 
				Put in the data*/
		Node new_node = new Node(new_data); 

		/* 3. Make next of new Node as head */
		new_node.next = head; 

		/* 4. Move the head to point to new Node */
		head = new_node; 
	} 

	/* Function to print linked list */
	void printList() 
	{ 
		Node temp = head; 
		while (temp != null) { 
			System.out.print(temp.data + " "); 
			temp = temp.next; 
		} 
		System.out.println(); 
	} 

	/* Driver program to test above functions */
	public static void main(String args[]) 
	{ 
		LinkedList llist = new LinkedList(); 

		/* Constructed Linked List is 1->2->3->4->5->null */
		llist.push(5); 
		llist.push(4); 
		llist.push(3); 
		llist.push(2); 
		llist.push(1); 

		System.out.println( 
			"Linked List before calling deleteAlt() "); 
		llist.printList(); 

		llist.deleteAlt(); 

		System.out.println( 
			"Linked List after calling deleteAlt() "); 
		llist.printList(); 
	} 
} 
/* This code is contributed by Rajat Mishra */
