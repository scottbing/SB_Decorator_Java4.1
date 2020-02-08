package com.company;

public class Crustless extends CrustDecorator {

    public Crustless(Pizza tempPizza) {
        super(tempPizza);

        System.out.println("Salad");
    }

    @Override
    public String getDescription() {
        return super.getDescription() + "Salad ";
    }

    @Override
    public Double getCost() {
        return super.getCost() + 1.75;
    }
}