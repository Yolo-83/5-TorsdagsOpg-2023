package Task2;

import Task1.Customer;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Cafe cafe = new Cafe();
        cafe.loadMenuData();

        ArrayList<String> coffees = new ArrayList<>();
        for (String c : cafe.coffeeMenu) {
            System.out.println(coffees.get(Integer.parseInt(c)));
        }
    }
}