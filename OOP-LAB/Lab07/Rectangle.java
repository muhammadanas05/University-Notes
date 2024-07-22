class Rectangle {
    int length;
    int breadth;

    Rectangle(int length, int breath) {
        this.length = length;
        this.breadth = breath;
    }

    void area() {
        System.out.println("Area of rectangle: " + (length * breadth));
    }

    void perimeter() {
        System.out.println("Perimeter of rectangle: " + 2 * (length + breadth));
    }
}

class Square extends Rectangle {
    Square(int s) {
        super(s, s);
    }
@Override
    void area() {
        System.out.println("Area of Square: " + (length * breadth));
    }

    void perimeter() {
        System.out.println("Perimeter of Square: " + 2 * (length + breadth));
    }


    public static void main(String[] args) {
        Rectangle r = new Rectangle(15, 25);
        Square s = new Square(9);

        r.area();
        r.perimeter();

        s.area();
        s.perimeter();

    }
}
