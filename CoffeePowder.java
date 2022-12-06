package com.pragra.day16.tims;

public class CoffeePowder implements ITimsMerchendise{
    @Override
    public double getPrice() {
        return 89.99;
    }

    @Override
    public String getFeature() {
        return "Dark Roast coffee powder";
    }

    @Override
    public String toString() {
        return "Coffee Powder: \nFeatures:: "+getFeature()+ " Price:: "+getPrice();
    }
}
