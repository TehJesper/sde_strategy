package com.hz;
import products.Product;

import java.util.ArrayList;

public class ShoppingCart extends ArrayList<Product>{

//    Context context = new Context(new Regular());
    Context context = new Context(new ChristmasEve());
//    Context context = new Context(new BlackFriday());

    public double getTotalPrice(Customer customer) {

        double totalPrice = 0.0;

        for(Product product : this) {

            int index = this.indexOf(product);

            double discount = context.getDiscount(product, index, customer);
            double price = product.getPrice() * discount;

            totalPrice += price;
        }

        return totalPrice;
    }
}