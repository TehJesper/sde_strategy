package com.hz;

import products.Product;

public class ChristmasEve implements Strategy {

    @Override
    public double getDiscount(Product product, int index, Customer customer) {
        boolean isFirstProduct = index == 0;
        double discount = 0.0;
        // on Christmas Eve, 1st product 20%, the next 12.5% discount


            if(isFirstProduct) {
                discount = .20;
            } else {
                discount = .125;
            }
        return 1 - discount;

    }
}
