package com.hz;

import products.Product;

public class BlackFriday implements Strategy {

    @Override
    public double getDiscount(Product product, int index, Customer customer) {
        return 0.5;
    }
}
