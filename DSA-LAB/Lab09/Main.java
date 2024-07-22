// public class Main {
//     public static void main(String[] args) {
//         BinarySearchTreeDeletion tree = new BinarySearchTreeDeletion();
//         tree.root = new Node(50);
//         tree.root.left = new Node(30);
//         tree.root.right = new Node(70);
//         tree.root.left.left = new Node(20);
//         tree.root.left.right = new Node(40);
//         tree.root.right.left = new Node(60);
//         tree.root.right.right = new Node(80);

//         System.out.println("Inorder traversal before deletion:");
//         tree.inOrderTraversal(tree.root);
//         System.out.println();

//         int keyToDelete = 10;
//         tree.root = tree.deleteNode(tree.root, keyToDelete);

//         System.out.println("Inorder traversal after deleting " + keyToDelete + ":");
//         tree.inOrderTraversal(tree.root);
//     }
// }

// // BST DELETION

// class Node {
//     int data;
//     Node left, right;

//     public Node(int item) {
//         data = item;
//         left = right = null;
//     }
// }

// class BinarySearchTreeDeletion {
//     Node root;

//     BinarySearchTreeDeletion() {
//         root = null;
//     }

//     // Function to perform BST deletion
//     public Node deleteNode(Node root, int key) {
//         if (root == null)
//             return root;

//         // Traverse the tree to find the node to be deleted
//         if (key < root.data)
//             root.left = deleteNode(root.left, key);
//         else if (key > root.data)
//             root.right = deleteNode(root.right, key);
//         else {
//             // Node with only one child or no child
//             if (root.left == null)
//                 return root.right;
//             else if (root.right == null)
//                 return root.left;

//             // Node with two children, get the inorder successor (smallest in the right subtree)
//             root.data = minValue(root.right);

//             // Delete the inorder successor
//             root.right = deleteNode(root.right, root.data);
//         }

//         return root;
//     }

//     // Helper function to find the smallest value in a BST
//     private int minValue(Node root) {
//         int minValue = root.data;
//         while (root.left != null) {
//             minValue = root.left.data;
//             root = root.left;
//         }
//         return minValue;
//     }

//     // Function to print inorder traversal of the tree
//     public void inOrderTraversal(Node root) {
//         if (root != null) {
//             inOrderTraversal(root.left);
//             System.out.print(root.data + " ");
//             inOrderTraversal(root.right);
//         }
//     }
// }

