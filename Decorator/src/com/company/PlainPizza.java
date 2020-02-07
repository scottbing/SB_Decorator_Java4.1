package com.company;

public class PlainPizza implements Pizza{
    String description;
    Double cost;

    @Override
    public String getDestription() {
        return "Thin Crust";
    }

    public Double getCost() {
        return 4.00;
    }
}