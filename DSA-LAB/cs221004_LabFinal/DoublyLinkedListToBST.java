// class Employee {
//     int Eid;
//     String Ename;
//     int Esalary;
//     Employee prev, next;

//     public Employee(int Eid, String Ename, int Esalary) {
//         this.Eid = Eid;
//         this.Ename = Ename;
//         this.Esalary = Esalary;
//         this.prev = null;
//         this.next = null;
//     }
// }

// class TreeNode {
//     Employee data;
//     TreeNode left, right;

//     public TreeNode(Employee data) {
//         this.data = data;
//         this.left = null;
//         this.right = null;
//     }
// }

// class BST {
//     TreeNode root;

//     public BST() {
//         this.root = null;
//     }

    
//     private TreeNode insert(TreeNode root, Employee data) {
//         if (root == null) {
//             return new TreeNode(data);
//         }

//         if (data.Esalary < root.data.Esalary) {
//             root.left = insert(root.left, data);
//         } else if (data.Esalary > root.data.Esalary) {
//             root.right = insert(root.right, data);
//         }

//         return root;
//     }

//     public void insert(Employee data) {
//         this.root = insert(this.root, data);
//     }

    
//     private String findMaxSalaryEmployee(TreeNode root) {
//         while (root.right != null) {
//             root = root.right;
//         }
//         return root.data.Ename;
//     }

//     public String getMaxSalaryEmployee() {
//         if (this.root == null) {
//             return null; // BST is empty
//         }

//         return findMaxSalaryEmployee(this.root);
//     }
// }

// public class DoublyLinkedListToBST {
//     public static void main(String[] args) {
//         Employee e1 = new Employee(1, "x", 150000);
//         Employee e2 = new Employee(2, "y", 120000);
//         Employee e3 = new Employee(3, "z", 56000);
//         Employee e4 = new Employee(4, "a", 70000);
//         Employee e5 = new Employee(5, "b", 80000);
//         Employee e6 = new Employee(6, "c", 72000);
//         Employee e7 = new Employee(7, "d", 100000);

        
//         e1.next = e2;
//         e2.prev = e1;
//         e2.next = e3;
//         e3.prev = e2;
//         e3.next = e4;
//         e4.prev = e3;
//         e4.next = e5;
//         e5.prev = e4;
//         e5.next = e6;
//         e6.prev = e5;
//         e6.next = e7;
//         e7.prev = e6;

       
//         BST bst = constructBSTFromDoublyLinkedList(e1);

        
//         String maxSalaryEmployee = bst.getMaxSalaryEmployee();

//         System.out.println("Maximum salaried employee: " + maxSalaryEmployee);
//     }

//     private static BST constructBSTFromDoublyLinkedList(Employee head) {
//         if (head == null) {
//             return null;
//         }

      
//         Employee center = findCenter(head);

 
//         BST bst = new BST();
//         bst.insert(center);

//         Employee rightList = center.next;
//         center.prev = null;
//         center.next = null;

//         while (rightList != null) {
//             bst.insert(rightList);
//             rightList = rightList.next;
//         }

//         return bst;
//     }

//     private static Employee findCenter(Employee head) {
//         if (head == null || head.next == null) {
//             return head;
//         }

//         Employee slow = head;
//         Employee fast = head.next;

//         while (fast != null && fast.next != null) {
//             slow = slow.next;
//             fast = fast.next.next;
//         }

//         return slow;
//     }
// }
