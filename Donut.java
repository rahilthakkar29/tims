package com.pragra.day16.tims;

public class Donut implements ITimsConsumable{
    @Override
    public double getPrice() {
        return 2.99;
    }

    @Override
    public int getCalories() {
        return 125;
    }

    @Override
    public String toString() {
        return "Donut: \nCalories:: "+getCalories()+ " Price:: "+getPrice();
    }
}
