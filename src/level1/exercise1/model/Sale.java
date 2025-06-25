package level1.exercise1.model;

import java.util.ArrayList;

public class Sale {
    private ArrayList<Product> products;
    private double totalPrice;

    public Sale() {
        this.totalPrice = 0.0;
        this.products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        if (product == null) {
            throw new IllegalArgumentException("Cannot add null product.");
        }
        products.add(product);
    }

    public void calculateTotalSale() throws EmptySaleException {
        if(products.isEmpty()) {
            throw new EmptySaleException("To make a sale you must first add products");
        }
        double finalPrice = 0.0;
        for(Product actualProduct : products) {
            finalPrice += actualProduct.getPrice();
        }
        System.out.println("The total sale price is: " + finalPrice + " €");
    }



}
