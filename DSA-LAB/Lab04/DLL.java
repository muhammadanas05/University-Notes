class DLL {
    Node head, tail, current;

    public void insert(char data) {
        Node newNode = new Node(data);

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
                current = newNode; // Update the current position to the newly inserted node
            } else {
                if (current != null) {
                    current.next = newNode;
                    newNode.prev = current;
                } else {
                    tail.next = newNode;
                    newNode.prev = tail;
                }
                tail = newNode; // Update the tail to the newly inserted node
                current = newNode; // Update the current position to the newly inserted node
            }
        }
    }

    public void delete() {
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

    public void modify(char newData) {
        if (current != null) {
            current.data = newData;
        }
    }

    public String getText() {
        StringBuilder sb = new StringBuilder();
        Node temp = head;

        while (temp != null) {
            sb.append(temp.data);
            temp = temp.next;
        }

        return sb.toString();
    }
}