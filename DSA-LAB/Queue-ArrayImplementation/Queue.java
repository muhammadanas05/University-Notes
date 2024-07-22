class Queue{
    private int arr[]; 
    private int size;
    private int front; //points to the front index
    private int rear; //points to the rear index
    
    public Queue(int size){
        this.arr = new int[size];
        front = -1;
        rear = -1;
        this.size = size;
    }
    public boolean isEmpty(){
        return front==-1;
    }
    public boolean isFull(){
        return rear==size-1;
    }
    public void enque(int x){
        if(isFull()){
            System.out.println("Queue is full");
        }
        else if(isEmpty()){
            front = 0;
            rear = 0;
        }
        else{
            rear = rear+1;
        }
        arr[rear] = x;
    }
    public int peek(){
        return arr[front];
    }
    public void dequeu(){
        if(isEmpty()){
            System.out.println("Queue is empty");
        }
        else if(front==rear){
            front = -1;
            rear = -1;
        }
        else{
            for(int i=1;i<size;++i){
                arr[i-1] = arr[i];
            }
        }
    }

}