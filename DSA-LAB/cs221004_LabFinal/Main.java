class Employee {
    int id;
    String name;
    int salary;

    Employee(int id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
}

class DoublyLL {
    private Node head;
    private Node tail;

    static class Node {
        Employee employee;
        Node next;
        Node prev;

        Node(Employee employee) {
            this.employee = employee;
            this.next = null;
            this.prev = null;
        }
    }

    private Node createNewNode(Employee employee) {
        Node node = new Node(employee);
        node.prev = null;
        node.next = null;
        return node;
    }

    public void insertAtBeginning(Employee employee) {
        Node newnode = createNewNode(employee);
        if (head == null) {
            head = newnode;
            tail = newnode;
        } else {
            head.prev = newnode;
            newnode.next = head;
            head = newnode;
        }
    }

    public void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.employee.name + ": " + current.employee.salary + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public Node findCenter() {
        if (head == null) {
            System.out.println("DLL is empty.");
            return null;
        }

        Node slowPointer = head;
        Node fastPointer = head;

        while (fastPointer != null && fastPointer.next != null) {
            slowPointer = slowPointer.next;
            fastPointer = fastPointer.next.next;
        }

        return slowPointer;
    }
}

class BST {
    static class TreeNode {
        Employee employee;
        TreeNode left, right;

        public TreeNode(Employee employee) {
            this.employee = employee;
            this.left = this.right = null;
        }
    }

    private TreeNode root;

    public void insert(Employee employee) {
        root = insertRec(root, employee);
    }

    private TreeNode insertRec(TreeNode root, Employee employee) {
        if (root == null) {
            root = new TreeNode(employee);
            return root;
        }

        if (employee.salary < root.employee.salary) {
            root.left = insertRec(root.left, employee);
        } else if (employee.salary > root.employee.salary) {
            root.right = insertRec(root.right, employee);
        }

        return root;
    }

    public Employee findMaxSalaryEmployee() {
        if (root == null) {
            return null;
        }

        TreeNode current = root;
        while (current.right != null) {
            current = current.right;
        }

        return current.employee;
    }
}

public class Main {
    public static void main(String[] args) {
        DoublyLL doublyLL = new DoublyLL();
        BST bst = new BST();

        Employee e1 = new Employee(1, "x", 150000);
        Employee e2 = new Employee(2, "y", 120000);
        Employee e3 = new Employee(3, "z", 56000);
        Employee e4 = new Employee(4, "a", 80000);
        Employee e5 = new Employee(5, "b", 70000);
        Employee e6 = new Employee(6, "c", 72000);
        Employee e7 = new Employee(7, "d", 100000);

        doublyLL.insertAtBeginning(e1);
        doublyLL.insertAtBeginning(e2);
        doublyLL.insertAtBeginning(e3);
        doublyLL.insertAtBeginning(e4);
        doublyLL.insertAtBeginning(e5);
        doublyLL.insertAtBeginning(e6);
        doublyLL.insertAtBeginning(e7);

        System.out.println("Doubly Linked List:");
        doublyLL.display();

        DoublyLL.Node centerNode = doublyLL.findCenter();

        if (centerNode != null) {
            bst.insert(centerNode.employee);

            DoublyLL.Node current = centerNode.next;
            while (current != null) {
                bst.insert(current.employee);
                current = current.next;
            }
        }

        System.out.println("\nMax Salary Employee in BST:");
        Employee maxSalaryEmployee = bst.findMaxSalaryEmployee();
        if (maxSalaryEmployee != null) {
            System.out.println(maxSalaryEmployee.name + ": " + maxSalaryEmployee.salary);
        } else {
            System.out.println("BST is empty.");
        }
    }
}




