package com.company;

public class Mozzarella extends CheeseDecorator {

    public Mozzarella(Pizza tempPizza) {
        super(tempPizza);

        System.out.println("Adding Mozzarella");
    }

    @Override
    public String getDescription() {
        return super.getDescription() + "Mozzarella ";
    }

    @Override
    public Double getCost() {
        return super.getCost() + 0.50;
    }
}
