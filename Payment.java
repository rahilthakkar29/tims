package com.pragra.day16.tims;

import java.util.regex.Pattern;

public class Payment {
    public boolean cardCheck(String cardNumber){
        if(Pattern.matches("[0-9]{12}", cardNumber)){
            return true;
        }
        return false;
    }

    public boolean dateCheck(String date){
        if(Pattern.matches("(0[1-9]|1[0-2])(2[3-9])", date)){
            return true;
        }
        return false;
    }

    public boolean cvvCheck(String cvv){
        if(Pattern.matches("[0-9]{3}", cvv)){
            return true;
        }
        return false;
    }
}
