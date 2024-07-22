// Java program to make middle node 
// as head of Linked list
public class GFG 
{	 
	/* Link list node */
	static class Node {
		int data;
		Node next;
		Node(int data){
			this.data = data;
			next = null;
		}
	}
	
	static Node head;
	
	/* Function to get the middle and 
	set at beginning of the linked list*/
	static void setMiddleHead()
	{
		if (head == null)
			return;
	
		// To traverse list nodes one 
		// by one
		Node one_node = head;
	
		// To traverse list nodes by 
		// skipping one.
		Node two_node = head;
	
		// To keep track of previous of middle
		Node prev = null;
		while (two_node != null && 
			two_node.next != null) {
	
			/* for previous node of middle node */
			prev = one_node;
	
			/* move one node each time*/
			two_node = two_node.next.next;
	
			/* move two node each time*/
			one_node = one_node.next;
		}
	
		/* set middle node at head */
		prev.next = prev.next.next;
		one_node.next = head;
		head = one_node;
	}
	
	// To insert a node at the beginning of
	// linked list.
	static void push(int new_data)
	{
		/* allocate node */
		Node new_node = new Node(new_data);
	
		/* link the old list of the new node */
		new_node.next = head;
	
		/* move the head to point to the new node */
		head = new_node;
	}
	
	// A function to print a given linked list
	static void printList(Node ptr)
	{
		while (ptr != null) {
			System.out.print(ptr.data+" ");
			ptr = ptr.next;
		}
		System.out.println();
	}
	
	/* Driver function*/
	public static void main(String args[])
	{
		// Create a list of 5 nodes
		head = null;
		int i;
		for (i = 5; i > 0; i--)
			push(i);
		
		System.out.print(" list before: ");
		printList(head);
	
		setMiddleHead();
	
		System.out.print(" list After: ");
		printList(head);
	
	}
}
// This code is contributed by Sumit Ghosh
