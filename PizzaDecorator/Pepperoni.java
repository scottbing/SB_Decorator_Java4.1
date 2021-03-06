package com.company;

public class Pepperoni extends ToppingDecorator {

    public Pepperoni(Pizza tempPizza) {
        super(tempPizza);

        System.out.println("Adding Pepperoni");
    }

    @Override
    public String getDescription() {
        return super.getDescription() + "Pepperoni ";
    }

    @Override
    public Double getCost() {
        return super.getCost() + 0.85;
    }
}