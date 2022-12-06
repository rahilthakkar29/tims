package com.pragra.day16.tims;

public class Bagel implements ITimsConsumable{
    @Override
    public double getPrice() {
        return 3.99;
    }


    @Override
    public int getCalories() {
        return 95;
    }

    @Override
    public String toString() {
        return "Bagel: \nCalories:: "+getCalories()+ " Price:: "+getPrice();
    }
}
