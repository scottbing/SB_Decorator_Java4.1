package com.company;

public class Crustless extends CrustDecorator {

    public Crustless(Pizza tempPizza) {
        super(tempPizza);

        System.out.println("Adding Crustless");
    }

    @Override
    public String getDestription() {
        return super.getDestription() + "Crustless";
    }

    @Override
    public Double getCost() {
        return super.getCost() + 0.20;
    }
}
