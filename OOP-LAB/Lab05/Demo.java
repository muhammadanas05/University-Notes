public class Demo {
    public static void main(String[] args) {

        Rectangle r1 = new Rectangle(10, 19);

        Rectangle r2 = new Rectangle();
        r2.setLength(60);
        r2.setBreadth(85);

        System.out.println("Rectangle 1");
        System.out.println("Length = " + r1.getLength());
        System.out.println("Breadth = " + r1.getBreadth());
        System.out.println();
        System.out.println("Rectangle 2");
        System.out.println("Length = " + r2.getLength());
        System.out.println("Breadth = " + r2.getBreadth());
        System.out.println();
        System.out.println("Total number of Rectangle objects created: " + Rectangle.getCount());
    }
}