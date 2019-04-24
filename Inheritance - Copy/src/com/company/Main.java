package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// menu with options: residential customer, commercial customer, done
        //has methods that get data entry from user
        menu();
        int num = 0;
        try {
            Scanner scan = new Scanner(System.in);
            num = scan.nextInt();
        } catch (InputMismatchException e) {
            e.printStackTrace();
        }

        switch (num)
        {
            case 1:
                commercial();
                break;
            case 2:
                residential();
            case 3:
                System.out.println("Your session is over");
            default:
                System.out.println("");
        }

    }

    private static void menu()
    {
        System.out.println("Select an option 1-3:");
        System.out.println("1. Commercial");
        System.out.println("2. Residential");
        System.out.println("3. Done");
    }

    private static void commercial()
    {
        boolean mult = false;
        Scanner scan = new Scanner(System.in);
        System.out.println("Commercial Customer");
        System.out.println("Enter company name");
        String name = null;
        try {
            name = scan.nextLine();
        } catch (InputMismatchException e) {
            e.printStackTrace();
        }
        System.out.println("Enter phone number");
        String phone = null;
        try {
            phone = scan.nextLine();
        } catch (InputMismatchException e) {
            e.printStackTrace();
        }
        System.out.println("Enter address");
        String address = null;
        try {
            address = scan.nextLine();
        } catch (InputMismatchException e) {
            e.printStackTrace();
        }
        System.out.println("Enter square footage");
        double sqft = scan.nextDouble();
        System.out.println("Enter amount of properties\n");
        int a = 0;
        try {
            a = scan.nextInt();
        } catch (InputMismatchException e) {
            e.printStackTrace();
        }
        if(a>1)
            mult = true;

        //constructing commercial object
        Commercial com = new Commercial(name,phone,address,sqft,mult);
        com.display();

        // loops through the menu until the user presses done
        String[] j = new String[0];
        main(j);
    }

    private static void residential()
    {
        boolean senior = false;
        Scanner scan = new Scanner(System.in);
        System.out.println("Residential Customer");
        System.out.println("Enter your name");
        String name = null;
        try {
            name = scan.nextLine();
        } catch (InputMismatchException e) {
            e.printStackTrace();
        }
        System.out.println("Are you a senior? y/n");
        String s = null;
        try {
            s = scan.nextLine();
        } catch (InputMismatchException e) {
            e.printStackTrace();
        }
        System.out.println("Enter phone number");
        String phone = null;
        try {
            phone = scan.nextLine();
        } catch (InputMismatchException e) {
            e.printStackTrace();
        }
        System.out.println("Enter address");
        String address = null;
        try {
            address = scan.nextLine();
        } catch (InputMismatchException e) {
            e.printStackTrace();
        }
        System.out.println("Enter square footage");
        double sqft = 0;
        try {
            sqft = scan.nextDouble();
        } catch (InputMismatchException e) {
            e.printStackTrace();
        }
        if(s.equals("y")||s.equals("Y")||s.equals("yes")||s.equals("Yes"))
            senior = true;

        //constructing customer object
        Residential res = new Residential(name,phone,address,sqft,senior);
        res.display();
        //loops whole program until they press 3
        String[] j = new String[0];
        main(j);
    }
}
