package com.pragra.day16.tims;

public class Coffee implements ITimsConsumable{
    @Override
    public double getPrice() {
        return 2.85;
    }

    @Override
    public int getCalories() {
        return 12;
    }

    @Override
    public String toString() {
        return "Coffee: \nCalories:: "+getCalories()+ " Price:: "+getPrice();
    }
}
