package com.pragra.day16.tims;

public class Mug implements ITimsMerchendise{
    @Override
    public double getPrice() {
        return 11.99;
    }

    @Override
    public String getFeature() {
        return "Fifa world cup special edition";
    }

    @Override
    public String toString() {
        return "Mug: \nFeatures:: "+getFeature() + " Price: $"+getPrice();
    }
}
