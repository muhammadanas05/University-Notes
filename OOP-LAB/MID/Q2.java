public class Q2 {
    public static void main(String[] args) {

       Fish f = new Fish(5);
       f.isMammal();

       Duck d = new Duck(2);
       d.swim();
       d.isMammal();
       d.quack();

       Zebra z = new Zebra(10);

        System.out.println();
        System.out.println("Sample Output:");
        d.display();
        f.display();
        z.display();
    }
}
class Animal {
    public int age;
    public String gender;

    public void isMammal(){
        System.out.println("Animal Class isMammal method called");
    }
    void display(){
        System.out.println("Age of animals");
    }
}

class Duck extends Animal{
    public String beakColor = "yellow";

    public Duck (int a){
        this.age = a;
    }
    void display(){
        System.out.println("Age of Duck is "+ age+ " years");
    }
    public void swim(){
        System.out.println("Duck Class Swim method called");
    }
    public void quack(){
        System.out.println("Duck Class quack method called");
    }

}
class Fish extends Animal{

    private int sizeInFt;
    private boolean canEat;

    void display(){
        System.out.println("Age of Fish is "+ age +" years");
    }
    public Fish (int a){
        this.age = a;
    }
    private void swim(){
        System.out.println("Fish Class swim method called");
    }

}
class Zebra extends Animal{
    public boolean is_wild;

    public Zebra (int a){
        this.age = a;
    }
    void display(){
        System.out.println("Age of Zebra is "+ age+ " years");
    }
    public void run(){
        System.out.println("Zebra Class run method called");
    }
}