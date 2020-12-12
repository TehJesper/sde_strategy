package com.hz;

import products.Product;

public class Context {

    private Strategy strategy;

    public Context(Strategy strategy){

        this.strategy = strategy;
    }

    public double getDiscount(Product product, int index, Customer customer ){
        return strategy.getDiscount(product, index, customer);
    }
}
