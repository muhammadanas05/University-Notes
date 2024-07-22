package Question2;
public class Main {
    public static void main(String[] args) {
        LinkedList2 linkedList = new LinkedList2();
        linkedList.createNewNode(1);
        linkedList.createNewNode(2);
        linkedList.createNewNode(3);
        linkedList.createNewNode(5);
        linkedList.createNewNode(2);
        linkedList.createNewNode(10);

        // System.out.println("Linked List:");
        // linkedList.printList();

        int keyToDelete = 2;
        linkedList.deleteLastOccurrence(keyToDelete);

        System.out.println("After Deleting " + keyToDelete + ":");
        linkedList.printList();
    }
}