public class QueueTest {
    public static void main(String[] args) {
        Queue queue = new Queue(5);
        queue.enque(5);
        queue.enque(30);
        queue.enque(55);
        queue.dequeu();
        System.out.println("queue front: "+queue.peek());
    }
}
