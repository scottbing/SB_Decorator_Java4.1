package com.company;

public class Crustless implements Pizza {

    public Crustless() {
        super();

        System.out.println("Salad");
    }

    @Override
    public String getDescription() {
        return "Salad ";
    }

    @Override
    public Double getCost() {
        return 1.75;
    }

}