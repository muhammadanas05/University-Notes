// Java program to remove all occurrences of 
// duplicates from a sorted linked list 

// class to create Linked lIst 
class LinkedList{ 
	
// head of linked list 
Node head = null; 
class Node 
{ 
	
	// value in the node 
	int val; 
	Node next; 
	Node(int v) 
	{ 
		
		// default value of the next 
		// pointer field 
		val = v; 
		next = null; 
	} 
} 

// Function to insert data nodes into 
// the Linked List at the front 
public void insert(int data) 
{ 
	Node new_node = new Node(data); 
	new_node.next = head; 
	head = new_node; 
} 

// Function to remove all occurrences 
// of duplicate elements 
public void removeAllDuplicates() 
{ 
	
	// Create a dummy node that acts like a fake 
	// head of list pointing to the original head 
	Node dummy = new Node(0); 

	// Dummy node points to the original head 
	dummy.next = head; 
	Node prev = dummy; 
	Node current = head; 

	while (current != null) 
	{ 
		// Until the current and previous values 
		// are same, keep updating current 
		while (current.next != null && 
			prev.next.val == current.next.val) 
			current = current.next; 

		// If current has unique value i.e current 
		// is not updated, Move the prev pointer 
		// to next node 
		if (prev.next == current) 
			prev = prev.next; 

		// When current is updated to the last 
		// duplicate value of that segment, make 
		// prev the next of current*/ 
		else
			prev.next = current.next; 

		current = current.next; 
	} 

	// Update original head to the next of dummy 
	// node 
	head = dummy.next; 
} 

// Function to print the list elements 
public void printList() 
{ 
	Node trav = head; 
	if (head == null) 
		System.out.print(" List is empty" ); 
		
	while (trav != null) 
	{ 
		System.out.print(trav.val + " "); 
		trav = trav.next; 
	} 
} 

// Driver code 
public static void main(String[] args) 
{ 
	LinkedList ll = new LinkedList(); 
	ll.insert(53); 
	ll.insert(53); 
	ll.insert(49); 
	ll.insert(49); 
	ll.insert(35); 
	ll.insert(28); 
	ll.insert(28); 
	ll.insert(23); 
	
	System.out.println("Before removal of duplicates"); 
	ll.printList(); 

	ll.removeAllDuplicates(); 

	System.out.println("\nAfter removal of duplicates"); 
	ll.printList(); 
} 
} 
