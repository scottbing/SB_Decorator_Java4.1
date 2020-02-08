package com.company;

public class Lettuce extends ToppingDecorator {

    public Lettuce(Pizza tempPizza) {
        super(tempPizza);

        System.out.println("Adding Lettuce");
    }

    @Override
    public String getDescription() {
        return super.getDescription() + "Lettuce ";
    }

    @Override
    public Double getCost() {
        return super.getCost() + 00.45;
    }
}