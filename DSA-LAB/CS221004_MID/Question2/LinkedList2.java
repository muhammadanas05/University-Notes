package Question2;

class LinkedList2 {
    Node head;

     public void createNewNode(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }

        Node last = head;
        while (last.next != null) {
            last = last.next;
        }

        last.next = newNode;
    }

    public void deleteLastOccurrence(int key) {
        Node temp = head;
        Node lastOccurrence = null;

        while (temp != null) {
            if (temp.data == key) {
                lastOccurrence = temp;
            }
            temp = temp.next;
        }

        if (lastOccurrence == null) {
            System.out.println("Key not fond .");
            return;
        }
        if (lastOccurrence == head) {
            head = head.next;
            return;
        }
        temp = head;
        while (temp.next != lastOccurrence) {
            temp = temp.next;
        }

        temp.next = lastOccurrence.next;
    }

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}