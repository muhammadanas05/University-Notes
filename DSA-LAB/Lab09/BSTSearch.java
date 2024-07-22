class Node {
    int key;
    Node left, right;

    public Node(int item) {
        key = item;
        left = right = null;
    }
}

public class BSTSearch {

    Node root;

    BSTSearch() {
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

    // Search for a key in the BST
    public boolean search(int key) {
        return searchRec(root, key);
    }

    private boolean searchRec(Node root, int key) {
        if (root == null)
            return false;

        if (key == root.key)
            return true;

        if (key < root.key)
            return searchRec(root.left, key);
        else
            return searchRec(root.right, key);
    }

    // Find the minimum key in the BST
    public int findMin() {
        if (root == null)
            throw new IllegalStateException("Tree is empty");

        Node minNode = findMinRec(root);
        return minNode.key;
    }

    private Node findMinRec(Node root) {
        while (root.left != null)
            root = root.left;
        return root;
    }

    // Find the maximum key in the BST
    public int findMax() {
        if (root == null)
            throw new IllegalStateException("Tree is empty");

        Node maxNode = findMaxRec(root);
        return maxNode.key;
    }

    private Node findMaxRec(Node root) {
        while (root.right != null)
            root = root.right;
        return root;
    }

    public static void main(String[] args) {
        BSTSearch tree = new BSTSearch();

        // Insert keys
        tree.insert(50);
        tree.insert(30);
        tree.insert(70);
        tree.insert(20);
        tree.insert(40);

        // Search for a key
        int searchKey = 40;
        System.out.println("Search for key " + searchKey + ": " + tree.search(searchKey));

        // Find minimum and maximum keys
        System.out.println("Minimum key: " + tree.findMin());
        System.out.println("Maximum key: " + tree.findMax());
    }
}
