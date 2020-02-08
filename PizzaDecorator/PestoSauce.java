package com.company;

public abstract class PestoSauce extends SauceDecorator {

    public PestoSauce(Pizza tempPizza) {
        super(tempPizza);

        System.out.println("Adding PestoSauce");
    }

    @Override
    public String getDescription() {
        return super.getDescription() + "Pesto Sauce ";
    }

    @Override
    public Double getCost() {
        return super.getCost() + 2.75;
    }
}