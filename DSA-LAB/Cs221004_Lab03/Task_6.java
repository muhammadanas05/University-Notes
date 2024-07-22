class Task_6 {
   public static void main(String[] args) {
        
        LinkedList6 linkedList = new LinkedList6();
        linkedList.insert(14);
        linkedList.insert(123);
        linkedList.insert(242);
        linkedList.insert(311);
        linkedList.insert(553);
        linkedList.insert(598);

        linkedList.deleteList6();
        System.out.println("After Deletion:");
        linkedList.printList(); 
    }

}

class LinkedList6 {
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
	
	public void deleteList6() {
        head = null;
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
