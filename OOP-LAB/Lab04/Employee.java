public class Employee {

    String E_name;
    static String C_name = "The Great Company";
    String E_id;


    Employee (String E_name, String E_id){

        this.E_name =E_name;
        C_name =C_name;
        this.E_id = E_id;

    }

    static {
        System.out.println("Emplyee's Information:");
    }
    void display(){
        System.out.println();
        System.out.print("Name: "+ E_name);
        System.out.print("Company Name: "+ C_name);
        System.out.print("  E_id: "+E_id);
    }


    public static void main(String[] args) {

        Employee e1 = new Employee(" Kamran ", " 221024 ");

        Employee e2 = new Employee(" Ali    ", " 221434 ");

        Employee e3 = new Employee(" Sana   ", " 220276 ");

        Employee e4 = new Employee(" Zahra  ", " 227654 ");


        e1.display();
        e2.display();
        e3.display();
        e4.display();

    }
}
