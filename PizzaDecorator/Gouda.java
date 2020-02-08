package com.company;

public class Gouda extends CheeseDecorator {

    public Gouda(Pizza tempPizza) {
        super(tempPizza);

        System.out.println("Adding Gouda");
    }

    @Override
    public String getDescription() {
        return super.getDescription() + "Gouda ";
    }

    @Override
    public Double getCost() {
        return super.getCost() + 0.75;
    }
}