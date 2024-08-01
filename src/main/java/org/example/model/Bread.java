package org.example.model;

public class Bread extends ProductForSale{

    double saltPercent;


    public Bread(String type, int price, String description ) {
        super(type, price, description);
    }
    public Bread(String type, int price, String description ,double saltPercent) {
        super(type, price, description);
        this.saltPercent = saltPercent;
    }

    @Override
    public void showDetails() {
        System.out.println("TYPE: " + this.getType() + "PRICE: " + this.getPrice() +"$ "+ " DESCRIPTION: "+ this.getDescription() + "SALT PERCENT: "+this.saltPercent);
    }
}
