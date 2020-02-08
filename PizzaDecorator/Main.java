package com.company;

import java.text.DecimalFormat;

public class Main {

    private static DecimalFormat df = new DecimalFormat("0.00");

    public static void main(String[] args) {
        // write your code here
        Pizza plainPizza = new PlainPizza();

        // 1.) Thick crust pizza with pepperoni, gouda, tomato sauce, and double mushrooms.
        Pizza thcpgtsdm = new Mushroom(new Mushroom((new TomatoSauce(new Gouda(new Pepperoni(new ThickCrust(new PlainPizza())))))));

        System.out.println("1.) Ingredients: " + thcpgtsdm.getDescription());
        System.out.println("Cost " + df.format(thcpgtsdm.getCost()));

        // 2.) Thin crust pizza with alfredo sauce, pesto sauce, mushrooms, and onions.
        Pizza tncaspsmo = new Onion(new Mushroom(new PestoSauce(new AlfredoSauce(new ThinCrust(new PlainPizza())))));

        System.out.println("2.) Ingredients: " + tncaspsmo.getDescription());
        System.out.println("Cost " + df.format(tncaspsmo.getCost()));

        // 3.) Crustless pizza with lettuce, pesto sauce, and gouda.
        Pizza crllpsg = new Gouda(new PestoSauce(new Lettuce(new Crustless(new PlainPizza()))));

        System.out.println("3.) Ingredients: " + crllpsg.getDescription());
        System.out.println("Cost " + df.format(crllpsg.getCost()));

        Pizza mozThickPizza = new Mozzarella(new ThickCrust(new TomatoSauce(new PlainPizza())));

        System.out.println("Ingredients: " + mozThickPizza.getDescription());
        System.out.println("Cost " + df.format(mozThickPizza.getCost()));

        Pizza mozThinPizza = new Mozzarella(new ThinCrust(new TomatoSauce(new PlainPizza())));

        System.out.println("Ingredients: " + mozThinPizza.getDescription());
        System.out.println("Cost " + df.format(mozThinPizza.getCost()));

        Pizza pepperThinPizza = new Onion(new Pepperoni(new ThickCrust(new TomatoSauce(new PlainPizza()))));

        System.out.println("Ingredients: " + pepperThinPizza.getDescription());
        System.out.println("Cost " + df.format(pepperThinPizza.getCost()));

    }
}

