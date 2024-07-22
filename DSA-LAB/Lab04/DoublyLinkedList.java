class DoublyLinkedList {
    DoublyLinkedListNode head, tail, current;

    public void insert(char data) {
        DoublyLinkedListNode newNode = new DoublyLinkedListNode(data);

        if (head == null) {
            head = newNode;
            tail = newNode;
            current = newNode;
        } else {
            if (current != null && current.next != null) {
                newNode.prev = current;
                newNode.next = current.next;
                current.next.prev = newNode;
                current.next = newNode;
                current = newNode;
            } else {
                tail.next = newNode;
                newNode.prev = tail;
                tail = newNode;
                current = newNode;
            }
        }
    }

    public void delete(int position) {
        if (current != null) {
            current = getNodeAtPosition(position);
            if (current.prev != null) {
                current.prev.next = current.next;
            } else {
                head = current.next;
            }

            if (current.next != null) {
                current.next.prev = current.prev;
            } else {
                tail = current.prev;
            }

            if (current.prev != null) {
                current = current.prev;
            } else if (current.next != null) {
                current = current.next;
            } else {
                current = null;
            }
        }
    }

    public void modify(char newData, int position) {
        if (current != null) {
            current = getNodeAtPosition(position);
            current.data = newData;
        }
    }

    public String getText() {
        StringBuilder sb = new StringBuilder();
        DoublyLinkedListNode temp = head;

        while (temp != null) {
            sb.append(temp.data);
            temp = temp.next;
        }

        return sb.toString();
    }

    private int length() {
        int count = 0;
        DoublyLinkedListNode temp = head;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }

    private DoublyLinkedListNode getNodeAtPosition(int position) {
        DoublyLinkedListNode temp = head;
        for (int i = 0; i < position; i++) {
            if (temp == null) {
                break;
            }
            temp = temp.next;
        }
        return temp;
    }

}
