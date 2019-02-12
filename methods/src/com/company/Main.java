package com.company;

import java.text.DecimalFormat;
import java.util.*;


public class Main {

    //methods for finding the area of each shape

    //circles
    private static void aCircle()
    {
        //formats decimals
        DecimalFormat df = new DecimalFormat("#.##");

        //asks for user input
        System.out.println("Input the radius");
        Scanner scan = new Scanner(System.in);
        double radius = scan.nextDouble();

        //calculates and prints formatted answer
        double area = Math.pow(radius,2)*(Math.PI);
        System.out.println(df.format(area));
    }

    //triangle area
    private static void aTriangle()
    {
        //formats decimals
        DecimalFormat df = new DecimalFormat("#.##");

        System.out.println("Input the height");
        Scanner scan = new Scanner(System.in);
        double height = scan.nextDouble();

        System.out.println("Input the base length");
        Scanner sc = new Scanner(System.in);
        double base = sc.nextDouble();

        double area= .5*base*height;
        System.out.println(df.format(area));
    }


    private static void aRectangle()
    {
        //formats decimals
        DecimalFormat df = new DecimalFormat("#.##");

        System.out.println("Input the height");
        Scanner scan = new Scanner(System.in);
        double height = scan.nextDouble();

        System.out.println("Input the base length");
        Scanner sc = new Scanner(System.in);
        double base = sc.nextDouble();

        double area=base*height;
        System.out.println(df.format(area));
    }

    private static void aTrapezoid()
    {
        //formats decimals
        DecimalFormat df = new DecimalFormat("#.##");

        System.out.println("Input the height");
        Scanner scan = new Scanner(System.in);
        double height = scan.nextDouble();

        System.out.println("Input the base 1 length");
        double base = scan.nextDouble();

        System.out.println("Input the base 2 length");
        double b = scan.nextDouble();

        double area= .5*(base+b)*height;
        System.out.println(df.format(area));
    }

    public static void main(String[] args)
    {


	    String[] shapes = {"1: triangle","2: circle", "3: rectangle", "4: trapezoid"};

        System.out.println("Choose a shape to find the area of:");
        for(String s: shapes)
        {
            System.out.println(s);
        }

        Scanner scan = new Scanner(System.in);
        int choice = scan.nextInt();


        //switch statements gave errors with type String -- (reason im using ints)  -- I read that its because i have
        //out dated compiler
        switch(choice)
        {
            case 1:
                aTriangle();
                break;
            case 2:
                aCircle();
                break;
            case 3:
                aRectangle();
                break;
            case 4:
                aTrapezoid();
                break;
            default:
                System.out.println("that was not on the menu");
        }
    }
}
