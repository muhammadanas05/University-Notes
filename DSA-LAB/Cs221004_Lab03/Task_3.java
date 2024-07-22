class Task_3 {
	public static void main(String[] args) {
        
        LinkedList3 linkedList = new LinkedList3();
        linkedList.insert(14);
        linkedList.insert(123);
        linkedList.insert(242);
        linkedList.insert(311);
        linkedList.insert(553);
        linkedList.insert(598);
		
		LinkedList3 reversedList = linkedList.reverseList();
        System.out.println("Reversed:");
        reversedList.printList();
	
}


class LinkedList3 {
    private Node head;

    public void insert(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }
	
	public LinkedList3 reverseList() {
        LinkedList3 reversedList = new LinkedList3();
        Node current = head;
        while (current != null) {
            Node newNode = new Node(current.data);
            newNode.next = reversedList.head;
            reversedList.head = newNode;
            current = current.next;
        }
        return reversedList;
    }
	 public void printList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}
