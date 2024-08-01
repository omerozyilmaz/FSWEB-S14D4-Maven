package org.example.model;

public class Chocolate extends ProductForSale{

    double bitterPercent;

    public Chocolate(String type, int price, String description) {
        super(type, price, description);
    }

    public Chocolate(String type, int price, String description, double bitterPercent) {
        super(type, price, description);
        this.bitterPercent = bitterPercent;
    }

    @Override
    public void showDetails() {
        System.out.println("TYPE: " + this.getType() + "PRICE: " + this.getPrice() +"$ " + "DESCRIPTION: "+ this.getDescription() + " SALT BITTER PERCENT: "+this.bitterPercent);

    }
}
