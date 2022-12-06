package com.pragra.day16.tims;

public class Menu {

    private static ITimItems item;

    public static void initialMenu(){
        System.out.println("----------------Please select from the following option----------------");
        System.out.println("1. Tim merchandise");
        System.out.println("2. Tim consumable");
        System.out.println("3. Exit");
        System.out.print("Choose your option:: ");
    }
    public static void merchendiseMenu(){
        System.out.println("---------Now select from the following---------");
        System.out.println("1. Mug");
        System.out.println("2. Coffee Powder");
        System.out.println("3. Gift Card");
        System.out.println("4. Player Card");
        System.out.print("Choose your option:: ");
    }

    public static void consumableMenu(){
        System.out.println("---------Now select from the following---------");
        System.out.println("1. Bagel");
        System.out.println("2. Coffee");
        System.out.println("3. Donut");
        System.out.println("4. Wrap");
        System.out.print("Choose your option:: ");
    }

    public static void merchendiseChoice(int choice){
        switch (choice){
            case 1:
                item = new Mug();
                System.out.println(item);
                break;
            case 2:
                item = new CoffeePowder();
                System.out.println(item);
                break;
            case 3:
                item = new GiftCard();
                System.out.println(item);
                break;
            case 4:
                item = new PlayerCard();
                System.out.println(item);
                break;
            default:
                System.out.println("Not a valid option");
        }
    }

    public static void consumableChoice(int choice){
        switch (choice){
            case 1:
                item = new Bagel();
                System.out.println(item);
                break;
            case 2:
                item = new Coffee();
                System.out.println(item);
                break;
            case 3:
                item = new Donut();
                System.out.println(item);
                break;
            case 4:
                item = new Wrap();
                System.out.println(item);
                break;
            default:
                System.out.println("Not a valid option");
        }
    }

    public static void addToCart(){
        System.out.println("---------Now select from the following---------");
        System.out.println("1. Order this");
        System.out.println("2. Back to main menu");
        System.out.print("Select your option:: ");
    }

    public static void cardNumber(){
        System.out.println("\n\nNow, please enter the payment information\n\n");
        System.out.println("Card number should be exactly 12 digits");
        System.out.print("Card Number:: ");
    }

    public static void date(){
        System.out.println("Enter the date in MMYY format");
        System.out.print("Date(MMYY):: ");
    }

    public static void cvv(){
        System.out.println("Enter the cvv number");
        System.out.print("CVV(3 digits):: ");
    }


}
