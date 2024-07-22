// class Node {
// int key;
// Node
// left, right;
 
// public Node (int item) { 
//     key  = item;
//     left = right = null;
// }
// }

// class BST {
//     Node root;
//     BST(int key) {
//         root = new Node(key);
//     }
    
//     BST() {
//         root = null;
//     }
    
//     void printPostorder(Node node)
//     {
//         if(node == null)
//             return;
        
//         printPostorder(node.left);
//         printPostorder(node.right);
//         System.out.print(node.key + " ");
//     }
    
//     void printInorder(Node node) {
//         if(node == null)
//             return;
        
//         printInorder(node.left);
//         System.out.print(node.key + " ");
        
//         printInorder(node.right);
//     }
    
//     void printPreorder(Node node) {
//         if(node == null)
//             return;
        
//         System.out.print(node.key + " ");
        
//        printPreorder(node.left);
       
//        printPreorder(node.right);
//     }
    
//     public Node search(Node root, int key) {
//         if(root == null || root.key == key) {
//          System.out.println("YES");
//             return root;
//         }

//         if(root.key > key)
//             return search(root.left, key);
        
//         return search(root.right, key);
//     }
    
// }

// public class Lab09Prac {
//     public static void main(String[] args) {
//         BST tree = new BST();
        
//         tree.root = new Node(1);
        
//         Node a = new Node(3);
//         tree.root.left = a;
//         Node b = new Node(4);
//         tree.root.right = b;
        
//         a.left = new Node(5);
//         a.right = new Node(6);
        
//         b.left = new Node(7);
//         b.right = new Node(8);
        
        
//         tree.printInorder(tree.root);
//         System.out.println();
//         tree.printPostorder(tree.root);
//          System.out.println();
//         tree.printPreorder(tree.root);
//         System.out.println();
//         tree.search(a,9);
                
//     }
// }

