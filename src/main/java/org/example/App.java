package org.example;

import java.util.Scanner;

/*
 * UCF COP3330 Fall 2021 Assignment 1 Solution
 * Copyright 2021 Mohammed_Almeaither
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println("Exercise 18 - Temperature Converter");
        double F,C;
        String choice;
        System.out.println("Press C to convert from Fahrenheit to Celsius.");
        System.out.println("Press F to convert from Celsius to Fahrenheit.");
        System.out.print("Your choice: ");
        Scanner in = new Scanner(System.in);
        choice = in.next();
        if( choice.equalsIgnoreCase("C"))
        {
            System.out.print("Please enter the temperature in Fahrenheit: ");
            F = Double.parseDouble(in.next());
            C = (F-32.0)*5.0/9.0;
            System.out.println("The temperature in Celsius: " + C);
        }
        else {
            System.out.print("Please enter the temperature in Celsius: ");
            C = Double.parseDouble(in.next());
            F = C*9.0/5.0 + 32;
            System.out.println("The temperature in Fahrenheit: " + F);
        }

    }
}
