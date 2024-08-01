package org.example.model;

public class Store {
    public static void main(String[] args) {
        ProductForSale[]  products = new ProductForSale[10];
        products[0] = new Chocolate("Chocolate", 30, "Bitter Chocolate", 0.27);
        products[1] = new Coke("ColaTurka", 6, "Cola Turka", 0.87);
        products[2] = new Chocolate("Bread", 2, "No Salt Bread", 0.0);

        listProducts(products);

    }

    public static void listProducts(ProductForSale[] products) {
        for(ProductForSale product : products) {
            if(product != null) {
                product.showDetails();
                System.out.println("-------------------------");
            }
        }
    }
}