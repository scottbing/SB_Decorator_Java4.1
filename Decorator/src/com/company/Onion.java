package com.company;

public class Onion extends ToppingDecorator {

    public Onion(Pizza tempPizza) {
        super(tempPizza);

        System.out.println("Adding Onion");
    }

    @Override
    public String getDestription() {
        return super.getDestription() + "Onion";
    }

    @Override
    public Double getCost() {
        return super.getCost() + 0.85;
    }
}
