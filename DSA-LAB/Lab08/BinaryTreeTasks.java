class Node {
    int data;
    Node left, right;

    public Node(int item) {
        data = item;
        left = right = null;
    }
}

public class BinaryTreeTasks {

    // Task 1: Calculate level of the binary tree
    public static int calculateTreeLevel(Node root) {
        if (root == null)
            return 0;

        int leftLevel = calculateTreeLevel(root.left);
        int rightLevel = calculateTreeLevel(root.right);

        return Math.max(leftLevel, rightLevel) + 1;
    }

    // Task 2: Check whether a given tree is complete tree, full tree or both
    public static boolean isCompleteTree(Node root) {
        return isCompleteTreeHelper(root, 0, calculateTreeLevel(root), 0);
    }

    private static boolean isCompleteTreeHelper(Node root, int index, int level, int count) {
        if (root == null)
            return true;

        if (index >= count || level - 1 > index)
            return false;

        return isCompleteTreeHelper(root.left, 2 * index + 1, level, count)
                && isCompleteTreeHelper(root.right, 2 * index + 2, level, count);
    }

    // Task 3: Check the children sum property in binary tree
    public static boolean checkChildrenSumProperty(Node root) {
        if (root == null || (root.left == null && root.right == null))
            return true;

        int leftData = (root.left != null) ? root.left.data : 0;
        int rightData = (root.right != null) ? root.right.data : 0;

        return (root.data == leftData + rightData)
                && checkChildrenSumProperty(root.left)
                && checkChildrenSumProperty(root.right);
    }

    public static void main(String[] args) {
        // Example Usage
        Node root = new Node(10);
        root.left = new Node(8);
        root.right = new Node(2);
        root.left.left = new Node(3);
        root.left.right = new Node(5);

        System.out.println("Level of the binary tree: " + calculateTreeLevel(root));
        System.out.println("Is the tree complete: " + isCompleteTree(root));
        System.out.println("Satisfies Children Sum Property: " + checkChildrenSumProperty(root));
    }
}
