public class Task_01 {
    public static void main(String[] args) {
        Square s1 = new Square();
        s1.shape();
        s1.rectangle();
    }
}
    class Shape {
        void shape() {
            System.out.println("This is a shape!");
        }
    }

    class Rectangle extends Shape {
        void rectangle() {
            System.out.println("This is a rectangular shape!");
        }
    }

    class Circle extends Shape {
        void circle() {
            System.out.println("This is a circular shape!");
        }
    }

    class Square extends Rectangle {
        void square() {
            System.out.println("Square is rectangle!");
        }
    }
