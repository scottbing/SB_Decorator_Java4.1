package com.company;

public abstract class SauceDecorator implements Pizza {

    protected Pizza tempPizza;

    public SauceDecorator(Pizza tempPizza){
        this.tempPizza = tempPizza;
    }

    @Override
    public String getDescription() {
        return tempPizza.getDescription();
    }

    @Override
    public Double getCost() {
        return tempPizza.getCost();
    }

}
