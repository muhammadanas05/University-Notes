public class Main {
    public static void main(String[] args) {
        Stack stack = new Stack();
        System.out.println("PUSH");
        stack.push(41);
        stack.push(70);
        stack.push(90);

        stack.print();

        System.out.println("PEEK " + stack.peek());
        System.out.println("DELETE(POP)");
        System.out.println(stack.pop());

        stack.print();
    }
}
