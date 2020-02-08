package com.company;

public class AlfredoSauce extends SauceDecorator {

    public AlfredoSauce(Pizza tempPizza) {
        super(tempPizza);

        System.out.println("Adding Alfredo Sauce");
    }

    @Override
    public String getDescription() {
        return super.getDescription() + "Alfredo Sauce ";
    }

    @Override
    public Double getCost() {
        return super.getCost() + 2.75;
    }
}