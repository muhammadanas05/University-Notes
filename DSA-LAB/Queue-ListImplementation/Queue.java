class Queue{
    Node front;
    Node rear;

    private class Node
    {
        int data;
        Node next;
    }
    private Node createNewNode(int data){
        Node newnode = new Node();
        newnode.data = data;
        newnode.next = null;
        return newnode;
    }
    public boolean isEmpty(){
        return front == null;
    }
    public void enqueu(int data){
        Node newnode = createNewNode(data);
        if(isEmpty()){
            front = newnode;
            rear = newnode;
        }
        else{
            rear.next = newnode;
            rear = newnode;
        }
    }
    public int peek(){
        return front.data;
    }
    public void deque(){
        if(isEmpty())System.out.println("Queue is empty");
        else{
            front = front.next;
        }
    }
}