public class Example8_1 {
    public static void main(String[] args) {

        Birthday birthObj=new Birthday(2,2,2000);
        People p1=new People("Ali",birthObj);
        p1.printInfo();
    }
}
class Birthday {

    private int month;
    private int day;
    private int year;

    Birthday() {
        month=0;
        year=0;
        day=0;
    }
    Birthday(int m, int d, int y) {
        this.month=m;
        this.day=d;
        this.year=y;
    }
    public void printDate()
    {
        System.out.println(this.month+"/"+this.day+"/"+this.year);
    }
}
class People {
    private String name;
    private Birthday dob;
    //Declaring member function
    People(String n,Birthday b) {
        this.name=n;
        this.dob=b;
    }
    public void printInfo() {
        System.out.println(name+" was born on");
        dob.printDate();
    }
}

