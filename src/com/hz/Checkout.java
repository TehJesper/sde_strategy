package com.hz;

public class Checkout {

    private SalesAction salesAction;

    public Checkout(SalesAction action) {
//        Context context = new Context(action);
        this.salesAction = action;
        System.out.println(action);

    }

    public void nextInLine(Customer customer) {


        // Welcome customer
        String welcome = String.format("Hello %s, would you pass me your shopping cart?",
                customer.getName());
        Console.write(welcome);

        // perform checkout
        ShoppingCart cart = customer.getCart();
        double amountToPay = cart.getTotalPrice(customer);

        String payinfo = String.format("Let's see, that will be.. %.02f. Cash or card?", amountToPay);
        Console.write(payinfo);
    }
}
