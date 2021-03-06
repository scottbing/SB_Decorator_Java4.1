package com.company;

import java.text.DecimalFormat;

public class Main {

    private static DecimalFormat df = new DecimalFormat("0.00");

    public static void main(String[] args) {

        // 1.) Thick crust pizza with pepperoni, gouda, tomato sauce, and double mushrooms.
        Pizza thcpgtsdm = new Mushroom(new Mushroom((new TomatoSauce(new Gouda(new Pepperoni(new ThickCrust()))))));

        System.out.println("1.) Ingredients: " + thcpgtsdm.getDescription());
        System.out.println("Cost " + df.format(thcpgtsdm.getCost()));

        // 2.) Thin crust pizza with alfredo sauce, pesto sauce, mushrooms, and onions.
        Pizza tncaspsmo = new Onion(new Mushroom(new PestoSauce(new AlfredoSauce(new ThinCrust()))));

        System.out.println("2.) Ingredients: " + tncaspsmo.getDescription());
        System.out.println("Cost " + df.format(tncaspsmo.getCost()));

        // 3.) Crustless pizza with lettuce, pesto sauce, and gouda.
        Pizza crllpsg = new Gouda(new PestoSauce(new Onion(new Lettuce(new Crustless()))));

        System.out.println("3.) Ingredients: " + crllpsg.getDescription());
        System.out.println("Cost " + df.format(crllpsg.getCost()));

        Pizza mozThickPizza = new Mozzarella(new Gouda(new PestoSauce(new ThickCrust())));

        System.out.println("4.) Ingredients: " + mozThickPizza.getDescription());
        System.out.println("Cost " + df.format(mozThickPizza.getCost()));

        Pizza mozThin = new Mozzarella(new TomatoSauce(new ThinCrust()));

        System.out.println("5.)Ingredients: " + mozThin.getDescription());
        System.out.println("Cost " + df.format(mozThin.getCost()));

        Pizza mushOnionPepperThin = new Mushroom(new Onion(new Pepperoni((new AlfredoSauce(new ThinCrust())))));

        System.out.println("6.) Ingredients: " + mushOnionPepperThin.getDescription());
        System.out.println("Cost " + df.format(mushOnionPepperThin.getCost()));

        Pizza mushOnionPepperStuffed = new Mushroom(new Pepperoni(new Onion(new TomatoSauce(new StuffedCrust()))));

        System.out.println("7.) Ingredients: " + mushOnionPepperStuffed.getDescription());
        System.out.println("Cost " + df.format(mushOnionPepperStuffed.getCost()));

    }
}

