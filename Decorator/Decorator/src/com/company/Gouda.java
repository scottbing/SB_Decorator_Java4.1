package com.company;

public class Gouda extends ToppingDecorator {

    public Gouda(Pizza tempPizza) {
        super(tempPizza);

        System.out.println("Adding Gouda");
    }

    @Override
    public String getDestription() {
        return super.getDestription() + "Gouda";
    }

    @Override
    public Double getCost() {
        return super.getCost() + 0.65;
    }
}
