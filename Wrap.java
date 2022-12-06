package com.pragra.day16.tims;

public class Wrap implements ITimsConsumable{
    @Override
    public double getPrice() {
        return 8.99;
    }

    @Override
    public int getCalories() {
        return 225;
    }

    @Override
    public String toString() {
        return "Veggie wrap: \nCalories:: "+getCalories()+ " Price:: "+getPrice();
    }
}
