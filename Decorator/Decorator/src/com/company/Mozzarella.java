package com.company;

public class Mozzarella extends ToppingDecorator {

    public Mozzarella(Pizza tempPizza) {
        super(tempPizza);

        System.out.println("Adding Mozzarella");
    }

    @Override
    public String getDestription() {
        return super.getDestription() + "Mozzerella";
    }

    @Override
    public Double getCost() {
        return super.getCost() + 0.50;
    }
}
