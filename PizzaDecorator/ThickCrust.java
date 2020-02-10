package com.company;

public class ThickCrust implements Pizza {

    public ThickCrust() {
        super();

        System.out.println("Adding Thick Crust");
    }

    @Override
    public String getDescription() {
        return "Thick Crust ";
    }

    @Override
    public Double getCost() {
        return 3.10;
    }

}