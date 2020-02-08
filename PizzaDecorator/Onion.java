package com.company;

public class Onion extends ToppingDecorator {

    public Onion(Pizza tempPizza) {
        super(tempPizza);

        System.out.println("Adding Onions");
    }

    @Override
    public String getDescription() {
        return super.getDescription() + "Onion ";
    }

    @Override
    public Double getCost() {
        return super.getCost() + 0.55;
    }
}