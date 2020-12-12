package com.hz;

import products.Product;

public class Regular implements Strategy{

    @Override
    public double getDiscount(Product product, int index, Customer customer) {

        double discount = 0.0;

        if (customer.isRegular()){
            discount = 0.2;
        }
        else {
            discount = 0;
        }

        return 1 - discount;
    }
}
