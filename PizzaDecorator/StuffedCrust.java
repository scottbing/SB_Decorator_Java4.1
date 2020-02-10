package com.company;

public class StuffedCrust implements Pizza {

    public StuffedCrust() {
        super();

        System.out.println("Adding Stuffed Crust");
    }

    @Override
    public String getDescription() {
        return "Stuffed Crust ";
    }

    @Override
    public Double getCost() {
        return 3.50;
    }

}