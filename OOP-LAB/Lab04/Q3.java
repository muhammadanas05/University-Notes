public class Q3 {
    int x;

    Q3 () {
        System.out.println("Inside non-parameterized constructor");
        x = 0;
    }

    Q3 (int x) {
        System.out.println("Inside parameterized constructor");
        this.x = x;
    }

    static {
        System.out.println("Inside static block");
    }

    void display() {
        System.out.println("Value: " + x);
    }

    public static void main(String[] args) {
        Q3 a1 = new Q3();

        Q3 a2 = new Q3(5);

        a2.display();
    }
}
