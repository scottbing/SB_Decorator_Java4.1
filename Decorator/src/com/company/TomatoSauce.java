package com.company;

public class TomatoSauce extends ToppingDecorator {

    public TomatoSauce(Pizza tempPizza) {
        super(tempPizza);

        System.out.println("Adding Mozzarella");
    }

    @Override
    public String getDestription() {
        return super.getDestription() + "Tomato Sauce";
    }

    @Override
    public Double getCost() {
        return super.getCost() + 0.75;
    }
}
