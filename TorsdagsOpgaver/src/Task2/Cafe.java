package Task2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Cafe {

    public ArrayList<String> coffeeMenu = new ArrayList<String>();

    public void loadMenuData() {
        File file = new File("coffees.txt");

        try {
            Scanner scan = new Scanner(file);

            while (scan.hasNextLine()) {
                String coffee = scan.nextLine();
                coffeeMenu.add(coffee);
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found. Check path and filename");
        }
    }


}
