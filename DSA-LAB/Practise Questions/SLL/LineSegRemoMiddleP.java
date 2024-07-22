// Java program to remove middle points in a linked list of
// line segments,
class LinkedList
{
	Node head; // head of list

	/* Linked list Node*/
	class Node
	{
		int x,y;
		Node next;
		Node(int x, int y)
		{
			this.x = x;
			this.y = y;
			next = null;
		}
	}

	// This function deletes middle nodes in a sequence of
	// horizontal and vertical line segments represented
	// by linked list.
	Node deleteMiddle()
	{
		// If only one node or no node...Return back
		if (head == null || head.next == null ||
			head.next.next == null)
			return head;

		Node Next = head.next;
		Node NextNext = Next.next;

		// check if this is vertical or horizontal line
		if (head.x == Next.x)
		{
			// Find middle nodes with same value as x and
			// delete them.
			while (NextNext != null && Next.x == NextNext.x)
			{
				head.next = Next.next;
				Next.next = null;

				// Update NextNext for the next iteration
				Next = NextNext;
				NextNext = NextNext.next;
			}
		}

		// if horizontal
		else if (head.y == Next.y)
		{
			// find middle nodes with same value as y and
			// delete them
			while (NextNext != null && Next.y == NextNext.y)
			{
				head.next = Next.next;
				Next.next = null;

				// Update NextNext for the next iteration
				Next = NextNext;
				NextNext = NextNext.next;
			}
		}

		// Adjacent points should have same x or same y
		else
		{
			System.out.println("Given list is not valid");
			return null;
		}

		// recur for other segment

		// temporarily store the head and move head forward.
		Node temp = head;
		head = head.next;

		// call deleteMiddle() for next segment
		this.deleteMiddle();

		// restore head
		head = temp;

		// return the head
		return head;
	}

	/* Given a reference (pointer to pointer) to the head
		of a list and an int, push a new node on the front
		of the list. */
	void push(int x, int y)
	{
		/* 1 & 2: Allocate the Node &
				Put in the data*/
		Node new_node = new Node(x,y);

		/* 3. Make next of new Node as head */
		new_node.next = head;

		/* 4. Move the head to point to new Node */
		head = new_node;
	}


	void printList()
	{
		Node temp = head;
		while (temp != null)
		{
			System.out.print("("+temp.x+","+temp.y+")->");
			temp = temp.next;
		}
		System.out.println();
	}


	/* Driver program to test above functions */
	public static void main(String args[])
	{
		LinkedList llist = new LinkedList();

		llist.push(40,5);
		llist.push(20,5);
		llist.push(10,5);
		llist.push(10,8);
		llist.push(10,10);
		llist.push(3,10);
		llist.push(1,10);
		llist.push(0,10);

		System.out.println("Given list");
		llist.printList();

		if (llist.deleteMiddle() != null)
		{
			System.out.println("Modified Linked List is");
			llist.printList();
		}
	}
} /* This code is contributed by Rajat Mishra */
