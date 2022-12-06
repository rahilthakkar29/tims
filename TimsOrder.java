package com.pragra.day16.tims;

import java.util.Scanner;

public class TimsOrder {
    Payment payment = new Payment();
    Scanner sc = new Scanner(System.in);
    ITimItems[] items = new ITimItems[100];
    int counter = 0;
    int mainChoice;
    int productChoice;

    int cart;
    public void start(){
        boolean loop = true;
            while(loop){
            Menu.initialMenu();
            mainChoice = sc.nextInt();
            switch (mainChoice){
                case 1:
                    Menu.merchendiseMenu();
                    productChoice = sc.nextInt();
                    Menu.merchendiseChoice(productChoice);
                    Menu.addToCart();
                    cart = sc.nextInt();
                    switch (cart){
                        case 1:
                            items[counter++] = merchendiseAdd(productChoice);
                            break;
                        case 2:
                            continue;
                        default:
                            System.out.println("Not a valid option");
                    }
                    break;
                case 2:
                    Menu.consumableMenu();
                    productChoice = sc.nextInt();
                    Menu.consumableChoice(productChoice);
                    Menu.addToCart();
                    cart = sc.nextInt();
                    switch (cart){
                        case 1:
                            items[counter++] = consumableAdd(productChoice);
                            break;
                        case 0:
                            continue;
                        default:
                            System.out.println("Not a valid option");
                    }
                    break;
                case 3:
                    loop = false;
                    break;
                default:
                    System.out.println("Please choose a valid option.");
            }
        }
    }

    public ITimItems merchendiseAdd(int productChoice){
        switch (productChoice){
            case 1:
                return new Mug();
            case 2:
                return new CoffeePowder();
            case 3:
                return new GiftCard();
            case 4:
                return new PlayerCard();
        }
        return null;
    }

    public ITimItems consumableAdd(int productChoice){
        switch (productChoice){
            case 1:
                return new Bagel();
            case 2:
                return new Coffee();
            case 3:
                return new Donut();
            case 4:
                return new Wrap();
        }
        return null;
    }

    public double totalDue(){
        double total = 0;
        for(int i = 0; i < counter; i++){
            total += items[i].getPrice();
        }
        return total;
    }

    public void paymentStart(){
        sc.nextLine();
        String cardnumber;
        String date;
        String cvv;
        Menu.cardNumber();
        cardnumber = sc.nextLine();
        Menu.date();
        date = sc.nextLine();
        Menu.cvv();
        cvv = sc.nextLine();
        if(payment.cardCheck(cardnumber)){
            if(payment.dateCheck(date)){
                if(payment.cvvCheck(cvv)){
                    System.out.println("Payment done, but you won't get anything!!!");
                }else {
                    System.out.println("Wrong CVV");
                }
            }else {
                System.out.println("Wrong date format");
            }
        }else {
            System.out.println("Incorrect card number");
        }
    }

    @Override
    public String toString() {
        String s = "";
        for(int i = 0; i < counter; i++){
            s += items[i].toString();
            s += "\n";
        }
        return "\n\n========================================================================\n\n"+
                "Order Summary::\n\n"+
                "========================================================================\n\n"
                +s+ "\n";

    }
}

