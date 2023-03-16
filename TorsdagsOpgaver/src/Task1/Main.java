package Task1;

import java.util.ArrayList;

public class Main {

    public static ArrayList<Customer> customers = new ArrayList<>();


    public static void printCustomers() {
        for (Customer i : customers){
            System.out.println(i);
        }
    }

    public static void main(String[] args) {

        customers.add( new Customer ("Cecilie","Duran","Ceci"));
        customers.add( new Customer("Barbara", "Duran", "Babi"));
        customers.add( new Customer("Nikolaj", "Heller", "Niko"));
        customers.add( new Customer("Aron", "Smith", "AS"));
        customers.add( new Customer("Jammal", "Albagnarh", "Jam"));
        customers.add( new Customer("Mijail", "Rükobiech", "Ruko"));

        printCustomers();
    }
}


