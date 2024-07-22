package Question3;

class Noode {
    int data;
    Noode next, prev;

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

    Noode(int value) {
        data = value;
        next = prev = null;
    }
}
