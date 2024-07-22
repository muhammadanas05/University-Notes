// Java Program to merge two sorted linked lists
// without using any extra space and without
// changing links of first list
class Node {
	int data;
	Node next;

	Node(int d)
	{
		data = d;
		next = null;
	}
}

class LinkedList {
	Node head;

	// Given a reference (pointer to pointer) to the head
	// of a list and an int, push a new node on the front
	// of the list.
	void push(int new_data)
	{
		/* allocate node */
		Node new_node = new Node(new_data);

		/* link the old list off the new node */
		new_node.next = head;

		/* move the head to point to the new node */
		head = new_node;
	}

	// Function to merge two sorted linked lists
	// LL1 and LL2 without using any extra space.
	void mergeLists(Node a, Node b)
	{
		// run till either one of a or b runs out
		while (a != null && b != null) {
			// for each element of LL1,
			// compare it with first element of LL2.
			if (a.data > b.data) {
				// swap the two elements involved
				// if LL1 has a greater element
				int temp = a.data;
				a.data = b.data;
				b.data = temp;

				Node temp2 = b;

				// To keep LL2 sorted, place first
				// element of LL2 at its correct place
				if (b.next != null
					&& b.data > b.next.data) {
					b = b.next;
					Node ptr = b;
					Node prev = null;

					// find mismatch by traversing the
					// second linked list once
					while (ptr != null
						&& ptr.data < temp2.data) {
						prev = ptr;
						ptr = ptr.next;
					}

					// correct the pointers
					prev.next = temp2;
					temp2.next = ptr;
				}
			}

			// move LL1 pointer to next element
			a = a.next;
		}
	}

	// Code to print the linked link
	void printList(Node head)
	{
		while (head != null) {
			System.out.print(head.data + "->");
			head = head.next;
		}
		System.out.println("NULL");
	}

	// Driver code
	public static void main(String args[])
	{
		LinkedList list1 = new LinkedList();
		list1.push(10);
		list1.push(8);
		list1.push(7);
		list1.push(4);
		list1.push(2);

		LinkedList list2 = new LinkedList();
		list2.push(12);
		list2.push(3);
		list2.push(1);

		list1.mergeLists(list1.head, list2.head);

		System.out.println("First List: ");
		list1.printList(list1.head);

		System.out.println("Second List: ");
		list2.printList(list2.head);
	}
}
