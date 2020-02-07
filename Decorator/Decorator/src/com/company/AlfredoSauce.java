package com.company;

public class AlfredoSauce extends ToppingDecorator {

    public AlfredoSauce(Pizza tempPizza) {
        super(tempPizza);

        System.out.println("Adding AlfredoSauce");
    }

    @Override
    public String getDestription() {
        return super.getDestription() + "Alfredo Sauce";
    }

    @Override
    public Double getCost() {
        return super.getCost() + 0.75;
    }
}
