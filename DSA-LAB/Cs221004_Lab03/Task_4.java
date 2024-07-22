class Task_4 {
	public static void main(String[] args) {
	
	LinkedList4 linkedList = new LinkedList4();
        linkedList.insert(14);
        linkedList.insert(123);
        linkedList.insert(242);
        linkedList.insert(311);
        linkedList.insert(553);
        linkedList.insert(598);
		
		linkedList.removeDuplicates();
        System.out.println("Removing Duplicates:");
        linkedList.printList();
}


class LinkedList4 {
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
	
	public void removeDuplicates() {
        Node current = head;
        while (current != null && current.next != null) {
            if (current.data == current.next.data) {
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }
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
