package Collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class Customer {
    private String name;
    private String email;

    public Customer(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }
}

public class Task1 {
    public static void main(String[] args) {
        List<Customer> customerList = new ArrayList<>();
        customerList.add(new Customer("Ibrahim", "ibrahim@gmail.com"));
        customerList.add(new Customer("Rafay", "rafay@gmail.com"));
        customerList.add(new Customer("Bilal", "bilal@gmail.com"));
        customerList.add(new Customer("Qazi", "qazi@gmail.com"));
        customerList.add(new Customer("Khizar", "khizar@gmail.com"));

        Set<Customer> customerSet = new HashSet<>(customerList);

        for (Customer customer : customerSet) {
            System.out.println("Name: " + customer.getName() + ", Email: " + customer.getEmail());
        }
    }
}
