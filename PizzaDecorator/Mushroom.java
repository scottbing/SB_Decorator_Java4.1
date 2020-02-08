package com.company;

public class Mushroom extends ToppingDecorator {

    public Mushroom(Pizza tempPizza) {
        super(tempPizza);

        System.out.println("Adding Mushrooms");
    }

    @Override
    public String getDescription() {
        return super.getDescription() + "Mushroom ";
    }

    @Override
    public Double getCost() {
        return super.getCost() + 0.55;
    }
}