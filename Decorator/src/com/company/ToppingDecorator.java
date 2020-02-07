package com.company;

public abstract class ToppingDecorator implements Pizza {

    protected Pizza tempPizza;

    public ToppingDecorator(Pizza tempPizza){
        this.tempPizza = tempPizza;
    }

    @Override
    public String getDestription() {
        return tempPizza.getDestription();
        }

    @Override
    public Double getCost() {
        return tempPizza.getCost();
        }

}
