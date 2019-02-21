package com.company;

import java.math.*;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Main
{
    // You are going to create a tip calculator program.
    // You will have the user enter the cost of items, and keep entering items until the user enters 0.
    //  At that point, you will display the total cost, taxes (assume 2.5 percent or .025),
    // total with taxes, and recommend a 17.5% tip. Display appropriately for currency,
    // with dollar signs and rounding to two decimal places.

    public static void main(String[] args)
    {
        double num = 0;

        //scan for user input
        Scanner scan = new Scanner(System.in);

        //kicks off the process before it goes into a loop
        System.out.println("Enter a price, or press 0 to get total price");
        double d1 = scan.nextDouble();
        num = d1; //holds every new value plus previous values
        while(d1 != 0){ //loops until they enter zero
            System.out.println("Enter a price, or press 0 to get total price");
             d1 = scan.nextDouble();
             num+=d1;
        }
        double tax = .025;
        double tip = .175;

        //turns doubles into strings so they can be inputed into bigdecimals
        String snum = Double.toString(num);
        String stax = Double.toString(tax);
        String stip = Double.toString(tip);

        //makes the strings into BigDecimals, for preciseness
        BigDecimal bnum = new BigDecimal(snum);
        BigDecimal btax = new BigDecimal(stax).multiply(bnum);
        BigDecimal btotal = bnum.add(btax);
        BigDecimal btip = new BigDecimal(stip).multiply(btotal);

        //formats bigdecimals 
        DecimalFormat df = new DecimalFormat("$#0.00");

        System.out.println("Total: " + df.format(bnum) + "\nTaxes " + df.format(btax) + "\nTotal with taxes " +
                df.format(btotal) + "\nRecommended tip " + df.format(btip));
    }
}