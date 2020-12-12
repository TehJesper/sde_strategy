package com.hz;

import products.BlenderWithIntegratedRadio;
import products.CuteTeddyBear;
import products.TVScreen;

public class Main {

    // Main scenario
    public static void main(String[] args) {

        // There is a shop with a checkout
        Checkout kassa5 = new Checkout(SalesAction.ChristmasEve);

        // Two customers enter the shop
        Customer piet = new Customer(CustomerType.New, "Piet");
        Customer anne = new Customer(CustomerType.New, "Anne");

        // buying stuff
        piet.buys(new BlenderWithIntegratedRadio());
        piet.buys(new CuteTeddyBear());

        anne.buys(new TVScreen());

        // and proceed to checkout
        kassa5.nextInLine(piet);
        kassa5.nextInLine(anne);
    }
}
