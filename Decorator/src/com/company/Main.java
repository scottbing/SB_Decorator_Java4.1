package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Pizza basicPizza = new Mozzarella(new TomatoSauce(new PlainPizza()));

        System.out.println("Ingedients " + basicPizza.getDestription());
        System.out.println("Cost " + basicPizza.getCost());

    }
}
