class Node {
    int key;
    Node left, right;

    public Node(int item) {
        key = item;
        left = right = null;
    }
}

public class BSTInsert {

    Node root;

    BSTInsert() {
        root = null;
    }

    // Insert a key into the BST
    public void insert(int key) {
        root = insertRec(root, key);
    }

    private Node insertRec(Node root, int key) {
        if (root == null) {
            root = new Node(key);
            return root;
        }

        if (key < root.key)
            root.left = insertRec(root.left, key);
        else if (key > root.key)
            root.right = insertRec(root.right, key);

        return root;
    }

    public static void main(String[] args) {
        BSTInsert tree = new BSTInsert();

        // Insert keys
        tree.insert(50);
        tree.insert(30);
        tree.insert(10);
        tree.insert(70);
        tree.insert(20);
        tree.insert(40);
        tree.insert(210);

        // Display the BST after insertion
        System.out.println("Inorder traversal after insertion:");
        tree.inOrderTraversal(tree.root);
    }

    // Function to print inorder traversal of the tree
    private void inOrderTraversal(Node root) {
        if (root != null) {
            inOrderTraversal(root.left);
            System.out.print(root.key + " ");
            inOrderTraversal(root.right);
        }
    }
}
