package org.example;

/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solutions
 *  Copyright 2021 Chad Higgins
 */

/*
You’ll often need to determine which part of a program is run based on user input or other events.

Create a program that converts temperatures from Fahrenheit to Celsius or from Celsius to Fahrenheit.
Prompt for the starting temperature. The program should prompt for the type of conversion and then perform the conversion.

The formulas are

C = (F − 32) × 5 / 9
and

F = (C × 9 / 5) + 32
Example Output
Press C to convert from Fahrenheit to Celsius.
Press F to convert from Celsius to Fahrenheit.
Your choice: C
Please enter the temperature in Fahrenheit: 32
The temperature in Celsius is 0.

Constraints
Ensure that you allow upper or lowercase values for C and F.
Use as few output statements as possible and avoid repeating output strings.
 */

import java.util.Locale;
import java.util.Scanner;

public class App
{
    public static void main( String[] args )
    {
        Scanner in = new Scanner(System.in);

        System.out.println("Press C to convert from Fahrenheit to Celsius.\n" +
                "Press F to convert from Celsius to Fahrenheit.");

        System.out.println("Your choice: ");
        String Type = in.nextLine().toUpperCase(Locale.ROOT);

        double newTemp;
        double currentTemp;

        if(Type.equals("C"))
        {
            System.out.println("Please enter the temperature in Fahrenheit: ");
            currentTemp = in.nextDouble();
            newTemp = (currentTemp*9/5) + 32;
            newTemp =(currentTemp-32)*5/9;
            System.out.println("The temperature in Celsius is "+newTemp+".");
        }
        else if(Type.equals("F"))
        {
            System.out.println("Please enter the temperature in Celsius: ");
            currentTemp = in.nextDouble();
            newTemp = (currentTemp*9/5) + 32;
            System.out.println("The temperature in Fahrenheit is "+newTemp+".");
        }

    }
}
