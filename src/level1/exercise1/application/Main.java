package level1.exercise1.application;

import level1.exercise1.model.EmptySaleException;
import level1.exercise1.model.Product;
import level1.exercise1.model.Sale;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Sale sale1 = new Sale();

        try {
            sale1.calculateTotalSale();
        } catch (EmptySaleException exception) {
            System.out.println("Caught exception: " + exception.getMessage());
        }

        sale1.addProduct(new Product("pants", 20.0));
        sale1.addProduct(new Product("skirt", 15.5));

        try {
            sale1.calculateTotalSale();
        } catch (EmptySaleException e) {
            System.out.println("Caught exception: " + e.getMessage());
        }

        ArrayList<String> list = new ArrayList<>();
        list.add("One");

        try {
            System.out.println(list.get(3));
        } catch (IndexOutOfBoundsException exception) {
            System.out.println("Caught exception: " + exception.getMessage());
        }

    }
}
