import java.util.Scanner;
//
//
//public class TextEditorConsole {
//    private static DoublyLinkedList textList;
//
//    public static void main(String[] args) {
//        textList = new DoublyLinkedList();
//        Scanner scanner = new Scanner(System.in);
//
//        while (true) {
//            System.out.println("Text: " + textList.getText());
//            System.out.println("1. Insert  2. Delete  3. Modify  4. Exit");
//            System.out.print("Choose an option: ");
//            int choice = scanner.nextInt();
//            scanner.nextLine(); // consume newline
//
//            switch (choice) {
//                case 1:
//                    System.out.print("Enter text to insert: ");
//                    String input = scanner.nextLine();
//                    char[] chars = input.toCharArray();
//                    for (char c : chars) {
//                        textList.insert(c);
//                    }
//                    break;
//                case 2:
//                    textList.delete();
//                    break;
//                case 3:
//                    System.out.print("Enter new character: ");
//                    char newData = scanner.nextLine().charAt(0);
//                    textList.modify(newData);
//                    break;
//                case 4:
//                    System.out.println("Exiting the text editor.");
//                    scanner.close();
//                    System.exit(0);
//                default:
//                    System.out.println("Invalid choice. Please try again.");
//            }
//        }
//    }
//}




public class TextEditorConsole {
    private static DoublyLinkedList textList;

    public static void main(String[] args) {
        textList = new DoublyLinkedList();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Text: " + textList.getText());
            System.out.println("1. Insert  2. Delete  3. Modify  4. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter text to insert: ");
                    String input = scanner.nextLine();
                    char[] chars = input.toCharArray();
                    for (char c : chars) {
                        textList.insert(c);
                    }
                    break;
                case 2:
                    System.out.print("Enter position to delete: ");
                    int deletePosition = scanner.nextInt();
                    textList.delete(deletePosition);
                    break;
                case 3:
                    System.out.print("Enter new character: ");
                    char newData = scanner.nextLine().charAt(0);
                    System.out.print("Enter position to modify: ");
                    int modifyPosition = scanner.nextInt();
                    textList.modify(newData, modifyPosition);
                    break;
                case 4:
//                    System.out.println("Exiting the text editor.");
                    System.out.println("***GOODBYE DEER***");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
