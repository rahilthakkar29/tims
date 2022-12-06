package com.pragra.day16.tims;

public class GiftCard implements ITimsMerchendise{
    @Override
    public double getPrice() {
        return 25.00;
    }

    @Override
    public String getFeature() {
        return "$25 Tims gift card";
    }

    @Override
    public String toString() {
        return "Gift Card: \nFeatures:: "+getFeature()+ " Price:: "+getPrice();
    }
}
