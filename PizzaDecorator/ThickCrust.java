package com.company;

public class ThickCrust extends CrustDecorator {

    public ThickCrust(Pizza tempPizza) {
        super(tempPizza);

        System.out.println("Adding ThickCrust");
    }

    @Override
    public String getDescription() {
        return super.getDescription() + "Thick Crust ";
    }


    @Override
    public Double getCost() {
        return super.getCost() + 2.75;
    }
}