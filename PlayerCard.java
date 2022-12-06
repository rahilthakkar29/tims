package com.pragra.day16.tims;

public class PlayerCard implements ITimsMerchendise{
    @Override
    public double getPrice() {
        return 12.99;
    }

    @Override
    public String getFeature() {
        return "Fifa world cup special edition player card.";
    }

    @Override
    public String toString() {
        return "Player Card : \nFeatures:: "+getFeature()+ " Price:: "+getPrice();
    }
}
