package com.company;

public class TomatoSauce extends SauceDecorator {

    public TomatoSauce(Pizza tempPizza) {
        super(tempPizza);

        System.out.println("Adding Mozzarella");
    }

    @Override
    public String getDescription() {
        return super.getDescription() + "Tomato Sauce ";
    }


    @Override
    public Double getCost() {
        return super.getCost() + 0.75;
    }
}
