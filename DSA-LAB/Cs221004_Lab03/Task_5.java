class Task_5{
	
	public static void main(String[] args) {
        
        LinkedList5 linkedList = new LinkedList5();
        linkedList.insert(14);
        linkedList.insert(123);
        linkedList.insert(242);
        linkedList.insert(311);
        linkedList.insert(553);
        linkedList.insert(598);
	
	LinkedList5 list1 = new LinkedList5();
        list1.insert(1);
        list1.insert(3);
        list1.insert(5);

        LinkedList5 list2 = new LinkedList5();
        list2.insert(2);
        list2.insert(4);
        list2.insert(6);

        LinkedList5 mergedList = LinkedList5.mergeSortedLists(list1, list2);
        System.out.println("Merged:");
        mergedList.printList();
}

class LinkedList5 {
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
	
	public static LinkedList5 mergeSortedLists(LinkedList5 list1, LinkedList5 list2) {
        LinkedList5 mergedList = new LinkedList5();
        Node current1 = list1.head;
        Node current2 = list2.head;

        while (current1 != null && current2 != null) {
            if (current1.data < current2.data) {
                mergedList.insert(current1.data);
                current1 = current1.next;
            } else {
                mergedList.insert(current2.data);
                current2 = current2.next;
            }
        }

        while (current1 != null) {
            mergedList.insert(current1.data);
            current1 = current1.next;
        }

        while (current2 != null) {
            mergedList.insert(current2.data);
            current2 = current2.next;
        }

        return mergedList;
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
