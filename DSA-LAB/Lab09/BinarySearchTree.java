// class Node {
//     int data;
//     Node left, right;

//     public Node(int item) {
//         data = item;
//         left = right = null;
//     }
// }

// public class BinarySearchTree {

//     Node root;

//     BinarySearchTree() {
//         root = null;
//     }

//     // Function to insert a key into the BST
//     public void insert(int key) {
//         root = insertRec(root, key);
//     }

//     private Node insertRec(Node root, int key) {
//         if (root == null) {
//             root = new Node(key);
//             return root;
//         }

//         if (key < root.data) {
//             root.left = insertRec(root.left, key);
//         } else if (key > root.data) {
//             root.right = insertRec(root.right, key);
//         }

//         return root;
//     }

//     // Inorder (Left, Root, Right) traversal
//     public void inOrderTraversal(Node root) {
//         if (root != null) {
//             inOrderTraversal(root.left);
//             System.out.print(root.data + " ");
//             inOrderTraversal(root.right);
//         }
//     }

//     // Preorder (Root, Left, Right) traversal
//     public void preOrderTraversal(Node root) {
//         if (root != null) {
//             System.out.print(root.data + " ");
//             preOrderTraversal(root.left);
//             preOrderTraversal(root.right);
//         }
//     }

//     // Postorder (Left, Right, Root) traversal
//     public void postOrderTraversal(Node root) {
//         if (root != null) {
//             postOrderTraversal(root.left);
//             postOrderTraversal(root.right);
//             System.out.print(root.data + " ");
//         }
//     }

//     public static void main(String[] args) {
//         BinarySearchTree tree = new BinarySearchTree();
//         int[] keys = {50, 30, 70, 20, 40, 60, 80};

//         for (int key : keys) {
//             tree.insert(key);
//         }

//         System.out.println("Inorder traversal:");
//         tree.inOrderTraversal(tree.root);
//         System.out.println();

//         System.out.println("Preorder traversal:");
//         tree.preOrderTraversal(tree.root);
//         System.out.println();

//         System.out.println("Postorder traversal:");
//         tree.postOrderTraversal(tree.root);
//     }
// }
