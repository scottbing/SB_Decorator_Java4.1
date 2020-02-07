package com.company;

public class Mushrooms extends ToppingDecorator {

    public Mushrooms(Pizza tempPizza) {
        super(tempPizza);

        System.out.println("Adding Mushrooms");
    }

    @Override
    public String getDestription() {
        return super.getDestription() + "Mushrooms";
    }

    @Override
    public Double getCost() {
        return super.getCost() + 0.45;
    }
}