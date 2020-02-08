package com.company;

public abstract class ToppingDecorator implements Pizza {

    protected Pizza tempPizza;

    public ToppingDecorator(Pizza tempPizza){
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
