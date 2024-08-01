package org.example.model;

public abstract class ProductForSale {
    private String type;
    private int price;
    private String description;

    public ProductForSale(String type, int price, String description) {
        this.type = type;
        this.price = price;
        this.description = description;
    }
    public int getSalesPrice(int qualtity) {
        return price * qualtity;
    }

    public abstract void showDetails();

    public String getType() {
        return type;
    }

    public int getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }
}
