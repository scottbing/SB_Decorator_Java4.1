package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Pizza plainPizza = new PlainPizza();

        Pizza mozThickPizza = new Mozzarella(new ThickCrust(new TomatoSauce(new PlainPizza())));

        System.out.println("Ingredients: " + mozThickPizza.getDescription());
        System.out.println("Cost " + mozThickPizza.getCost());

        Pizza mozThinPizza = new Mozzarella(new ThinCrust(new TomatoSauce(new PlainPizza())));

        System.out.println("Ingredients: " + mozThinPizza.getDescription());
        System.out.println("Cost " + mozThinPizza.getCost());

        Pizza pepperThinPizza = new Onion(new Pepperoni(new ThickCrust(new TomatoSauce(new PlainPizza()))));

        System.out.println("Ingredients: " + pepperThinPizza.getDescription());
        System.out.println("Cost " + pepperThinPizza.getCost());

    }
}

