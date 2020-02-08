package com.company;

public class ThinCrust extends CrustDecorator {

    public ThinCrust(Pizza tempPizza) {
        super(tempPizza);

        System.out.println("Adding ThinCrust");
    }

    @Override
    public String getDescription() {
        return super.getDescription() + "Thin Crust ";
    }

    @Override
    public Double getCost() {
        return super.getCost() + 2.75;
    }
}