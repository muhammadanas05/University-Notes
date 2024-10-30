import java.util.Scanner;

public class BankAccount {
    // Assignment#3 Q.1

    int Acc_no;
    String name;
    double balance;

    BankAccount(int x, String y, double z){
        Acc_no=x;
        name=y;
        balance=z;
    }
    void credit(double amount){
        this.balance +=  amount;
    }
    public void credit(){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the amount you want to credit: ");
        double amount = s.nextDouble();
        this.credit(amount);
    }
    void display(){
        System.out.println("Account Information");
        System.out.println("Account Number: "+ Acc_no);
        System.out.println("Account Holders Name: "+ name);
        System.out.println("Balance: "+balance);
    }


    public static void main(String[] args) {

        BankAccount p1 = new BankAccount(1125,"Ali",5340000);
        BankAccount p2 = new BankAccount(1016,"Ahmed",40000);
        BankAccount p3 = new BankAccount(1027,"Bilal",340000);

        p1.credit();
        p2.credit(4009.0);
        p3.credit(8900.0);

        p1.display();
        p2.display();
        p3.display();


    }
}

