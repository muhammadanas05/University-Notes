class Task_2 {
	public static void main(String[] args) {
        
        LinkedList2 linkedList = new LinkedList2();
        linkedList.insert(14);
        linkedList.insert(123);
        linkedList.insert(242);
        linkedList.insert(311);
        linkedList.insert(553);
        linkedList.insert(598);
		
		linkedList.printMiddle();
}


class LinkedList2 {

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

public void printMiddle() {
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        System.out.println("Middle Node: " + slow.data);
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