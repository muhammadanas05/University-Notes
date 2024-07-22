// Java program to add 1 to a linked list
class GfG {

	/* Linked list node */
	static class Node {
		int data;
		Node next;
	}

	/* Function to create a new node with given data */
	static Node newNode(int data)
	{
		Node new_node = new Node();
		new_node.data = data;
		new_node.next = null;
		return new_node;
	}

	/* Function to reverse the linked list */
	static Node reverse(Node head)
	{
		Node prev = null;
		Node current = head;
		Node next = null;
		while (current != null) {
			next = current.next;
			current.next = prev;
			prev = current;
			current = next;
		}
		return prev;
	}

	/* Adds one to a linked lists and return the head
	node of resultant list */
	static Node addOneUtil(Node head)
	{
		// res is head node of the resultant list
		Node res = head;
		Node temp = null, prev = null;

		int carry = 1, sum;

		while (head != null) // while both lists exist
		{
			// Calculate value of next digit in resultant
			// list. The next digit is sum of following
			// things (i) Carry (ii) Next digit of head list
			// (if there is a next digit)
			sum = carry + head.data;

			// update carry for next calculation
			carry = (sum >= 10) ? 1 : 0;

			// update sum if it is greater than 10
			sum = sum % 10;

			// Create a new node with sum as data
			head.data = sum;

			// Move head and second pointers to next nodes
			temp = head;
			head = head.next;
		}

		// if some carry is still there, add a new node to
		// result list.
		if (carry > 0)
			temp.next = newNode(carry);

		// return head of the resultant list
		return res;
	}

	// This function mainly uses addOneUtil().
	static Node addOne(Node head)
	{
		// Reverse linked list
		head = reverse(head);

		// Add one from left to right of reversed
		// list
		head = addOneUtil(head);

		// Reverse the modified list
		return reverse(head);
	}

	// A utility function to print a linked list
	static void printList(Node node)
	{
		while (node != null) {
			System.out.print(node.data);
			node = node.next;
		}
		System.out.println();
	}

	/* Driver code */
	public static void main(String[] args)
	{
		Node head = newNode(1);
		head.next = newNode(9);
		head.next.next = newNode(9);
		head.next.next.next = newNode(9);

		System.out.print("List is ");
		printList(head);

		head = addOne(head);
		System.out.println();
		System.out.print("Resultant list is ");
		printList(head);
	}
}

// This code is contributed by prerna saini
