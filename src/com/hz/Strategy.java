package com.hz;

import products.Product;

public interface Strategy {

    double getDiscount(Product product, int index, Customer customer);
}
