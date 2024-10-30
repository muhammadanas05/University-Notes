public class Shape {

    int l;
    int b;

//    Shape(int l, int b){
//        this.l=l;
//        this.b=b;
//    }

    void area(int l){
        System.out.println("Area of Square is: "+ l*l);
    }
    void area(int l, int b){
        System.out.println("Area of Rectangle: "+ l*b);
    }

    public static void main(String[] args) {
//        Shape s =new Shape(5,15);
        Shape s =new Shape();
        s.area(5);
        s.area(5,15);
    }

}
