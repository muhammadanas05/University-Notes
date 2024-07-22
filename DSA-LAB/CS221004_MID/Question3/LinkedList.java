package Question3;

public class LinkedList {

    //     Noode head,tail;
    //     public void createNewNode(int data) {
             
    //     Noode newNode = new Noode(data);

    //     if (head == null) {
            
    //         head = newNode;
    //         tail = newNode;
    //     } else {
    //         tail.next = newNode;
    //         newNode.prev = tail;
    //         tail = newNode;
    //     }
    // }

    static void Output(Noode head, int x) {
        Noode F = head;
        Noode S = head;

        while (S.next != null) {
            S = S.next;
        }

        boolean found = false;

        while (F != null && S != null && F != S && S.next != F) {
            int sum = F.data + S.data;

            if (sum == x) {
                System.out.println("(" + F.data + ", " + S.data + ")");
                found = true;
                F = F.next;
                S = S.prev;
            } else {
                if (sum < x) {
                    F = F.next;
                } else {
                    S = S.prev;
                }
            }
        }

        if (!found) {
            System.out.println("No pairs found");
        }

    }

    public static void main(String[] args) {
        Noode head = new Noode(1);
        head.next = new Noode(2);
        head.next.prev = head;
        head.next.next = new Noode(4);
        head.next.next.prev = head.next;
        head.next.next.next = new Noode(5);
        head.next.next.next.prev = head.next.next;
        head.next.next.next.next = new Noode(6);
        head.next.next.next.next.prev = head.next.next.next;
        head.next.next.next.next.next = new Noode(8);
        head.next.next.next.next.next.prev = head.next.next.next.next;
        head.next.next.next.next.next.next = new Noode(9);
        head.next.next.next.next.next.next.prev = head.next.next.next.next.next;

        // LinkedList head = new LinkedList();
        // head.createNewNode(1);
        // head.createNewNode(2);
        // head.createNewNode(4);
        // head.createNewNode(5);
        // head.createNewNode(6);
        // head.createNewNode(8);
        // head.createNewNode(9);
        

        int x = 7;
        Output(head, x);
    }
}





