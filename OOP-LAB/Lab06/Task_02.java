public class Task_02 {
    public static void main(String[] args) {

        Parent p1 = new Parent();
        Child c1 =new Child();

        p1.parent();
        c1.child();
        c1.parent();

    }
}

class Parent{

    void parent(){
        System.out.println("This is a parent class!");
    }

}

class Child extends Parent{

    void child(){
        System.out.println("This is a child class!");
    }

}