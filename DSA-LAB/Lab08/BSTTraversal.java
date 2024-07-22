class Node {
    int data;
    Node left, right;

    public Node(int item) {
        data = item;
        left = right = null;
    }
}

public class BSTTraversal {

    Node root;

    BSTTraversal() {
        root = null;
    }

    // Preorder (Root, Left, Right) traversal
    public void preOrderTraversal(Node root) {
        if (root != null) {
            System.out.print(root.data + " ");
            preOrderTraversal(root.left);
            preOrderTraversal(root.right);
        }
    }

    // Inorder (Left, Root, Right) traversal
    public void inOrderTraversal(Node root) {
        if (root != null) {
            inOrderTraversal(root.left);
            System.out.print(root.data + " ");
            inOrderTraversal(root.right);
        }
    }

    // Postorder (Left, Right, Root) traversal
    public void postOrderTraversal(Node root) {
        if (root != null) {
            postOrderTraversal(root.left);
            postOrderTraversal(root.right);
            System.out.print(root.data + " ");
        }
    }

    public static void main(String[] args) {
        BSTTraversal tree = new BSTTraversal();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);

        System.out.println("Preorder traversal:");
        tree.preOrderTraversal(tree.root);
        System.out.println();

        System.out.println("Inorder traversal:");
        tree.inOrderTraversal(tree.root);
        System.out.println();

        System.out.println("Postorder traversal:");
        tree.postOrderTraversal(tree.root);
    }
}
