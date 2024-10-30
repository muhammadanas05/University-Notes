public class Rectangle {
    private double L;
    private double B;
    private static int count = 0;

    public Rectangle(double length, double breadth) {
        this.L = length;
        this.B = breadth;
        count++;
    }

    public Rectangle() {
        this.L = 0;
        this.B = 0;
        count++;
    }

    public double getLength() {
        return this.L;
    }

    public double getBreadth() {
        return this.B;
    }


    public void setLength(double length) {
        this.L = length;
    }

    public void setBreadth(double breadth) {
        this.B = breadth;
    }

    public static int getCount() {
        return count;
    }
}


