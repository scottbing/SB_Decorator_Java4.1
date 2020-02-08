package com.company;

public abstract class CheeseDecorator implements Pizza {

    protected Pizza tempPizza;

    public CheeseDecorator(Pizza tempPizza){
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