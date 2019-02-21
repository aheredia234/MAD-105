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
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a price, or press 0 to get total price");
        double d1 = scan.nextDouble();
        num = d1;
        while(d1 != 0){
            System.out.println("Enter a price, or press 0 to get total price");
             d1 = scan.nextDouble();
             num+=d1;
        }
        double tax = .025;
        double tip = .175;

        String snum = Double.toString(num);
        String stax = Double.toString(tax);
        String stip = Double.toString(tip);

        BigDecimal bnum = new BigDecimal(snum);
        BigDecimal btax = new BigDecimal(stax).multiply(bnum);
        BigDecimal btotal = bnum.add(btax);
        BigDecimal btip = new BigDecimal(stip).multiply(btotal);


        System.out.println("Total: " + bnum.toString() + "\nTaxes " + btax.toString() + "\nTotal with taxes " +
                btotal.toString() + "\nRecommended tip " + btip.toString());
    }
}