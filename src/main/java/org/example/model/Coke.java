package org.example.model;

public class Coke extends ProductForSale{

    double asidite;

    public Coke(String type, int price, String description) {
        super(type, price, description);
    }

    public Coke(String type, int price, String description, double asidite) {
        super(type, price, description);
        this.asidite = asidite;
    }

    @Override
    public void showDetails() {
        System.out.println("TYPE: " + this.getType() + "PRICE: " + this.getPrice() +"$ "+  " DESCRIPTION: "+ this.getDescription() + "SALT ASIDITE: "+this.asidite);

    }

}
