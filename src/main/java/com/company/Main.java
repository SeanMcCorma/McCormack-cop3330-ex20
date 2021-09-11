package com.company;

import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Sean McCormack
 */
public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.printf("What is the order amount? ");
        double amount = Double.parseDouble(scan.nextLine());
        System.out.printf("What state do you live in? ");
        String state = scan.nextLine();
        if(state.equals("Wisconsin")){
            System.out.printf("What county do you live in? ");
            String county = scan.nextLine();
            if(county.equals("Eau Claire")){
                double tax = Math.ceil(amount*0.005*100)/100;
                double total = amount+tax;
                System.out.println("The tax is $"+tax+".");
                System.out.println("The total is $"+total+".");
            }else{
                double tax = Math.ceil(amount*0.004*100)/100;
                double total = amount+tax;
                System.out.println("The tax is $"+tax+".");
                System.out.println("The total is $"+total+".");
            }
        }else if(state.equals("Illinois")){
            double tax = Math.ceil(amount*0.008*100)/100;
            double total = amount+tax;
            System.out.println("The tax is $"+tax+".");
            System.out.println("The total is $"+total+".");
        }else{
            System.out.println("The total is $"+amount+".");
        }
        // write your code here
    }
}
