package com.pluralsight;

public class Receipt {
    public static void main(String[] args) {

        String itemName = "oranges";
        double price = 250.65;
        int quantity = 2;

        System.out.println("You bought " + quantity + " " + itemName + " for $" + price);
    }
}