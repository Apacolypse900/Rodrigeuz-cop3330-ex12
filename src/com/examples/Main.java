package com.examples;

import java.util.Scanner;
/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Jesus Rodriguez
 */
public class Main {

    public static void main(String[] args) {

        Scanner myObj = new Scanner(System.in);

        double Principal;
        double RateofInterest;
        double RateofInterestPer;
        int Years;
        double rounded;


        System.out.print("Enter the principal: ");
            Principal = myObj.nextInt();

        System.out.print("Enter the rate of Interest: ");
            RateofInterest = myObj.nextDouble();
            RateofInterestPer = RateofInterest/100;

        System.out.print("Enter the number of years: ");
            Years = myObj.nextInt();

        double SimpleInterest = Principal * (1 + (RateofInterestPer * Years));
        rounded = Math.round(SimpleInterest * 100)/100.0;

        System.out.println("After " + Years + " years at " + RateofInterest + "% ,the investment will be worth $" + rounded);


    }
}
