package com.company;

public class ThinCrust implements Pizza {

    public ThinCrust() {
        super();

        System.out.println("Adding Thin Crust");
    }

    @Override
    public String getDescription() {
        return "Thin Crust ";
    }

    @Override
    public Double getCost() {
        return 2.75;
    }

}