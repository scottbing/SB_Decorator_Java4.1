package com.company;

public abstract class CrustDecorator implements Pizza {

    protected Pizza tempPizza;

    public CrustDecorator(Pizza tempPizza){
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