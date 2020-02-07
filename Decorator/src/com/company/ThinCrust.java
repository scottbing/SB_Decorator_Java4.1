package com.company;

public class ThinCrust extends CrustDecorator {

    public ThinCrust(Pizza tempPizza) {
        super(tempPizza);

        System.out.println("Adding ThinCrust");
    }

    @Override
    public String getDestription() {
        return super.getDestription() + "ThinCrust";
    }

    @Override
    public Double getCost() {
        return super.getCost() + 0.65;
    }
}
