public class Ques1 {
        int a;
        int b;

        public Ques1(int a, int b) {
            this.a = a;
            this.b = b;
        }

        public void swapValues() {

            a = a + b;
            b = a - b;
            a = a - b;
        }
//        public void displayValues() {
//            System.out.println("After swapping:");
//            System.out.println("a: " + a);
//            System.out.println("b: " + b);
//        }

        public static void main(String[] args) {
            Ques1 s = new Ques1(5, 10);
            System.out.println("Before swapping:");
            System.out.println("a: " + s.a);
            System.out.println("b: " + s.b);

            s.swapValues();
//            s.displayValues();
            System.out.println("After swapping:");
            System.out.println("a: " + s.a);
            System.out.println("b: " + s.b);
        }
    }


