public class Main {
    public static void main(String[] args) {
        Animal r = new Reptile();
        r.eat();
        r.travel();
        System.out.println();
        Animal b = new Bird();
        b.eat();
        b.travel();
        System.out.println();
        Animal f = new Fish();
        f.eat();
        f.travel();
    }
}

interface Animal {
    void eat();
    void travel();
}

class Reptile implements Animal {
    public void eat() {
        System.out.println("Override eat Reptile Method");
    }

    @Override
    public void travel() {
        System.out.println("Override travel Reptile method");
    }
}
class Bird implements Animal {
    public void eat() {
        System.out.println("Override eat Bird method");
    }

    @Override
    public void travel() {
        System.out.println("Override travel Bird Method");
    }
}
class Fish implements Animal {
    @Override
    public void eat() {
        System.out.println("Override eat Fish Method");
    }
    public void travel() {
        System.out.println("Override travel Fish method");
    }
}

