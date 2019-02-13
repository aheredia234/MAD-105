package com.company;
import java.util.*;

public class Main {

    //parallel arrays of the items and item amount
    private static String[] supplies = {"Buns", "Hotdogs", "Ketchup", "Mustard", "Relish"};
    private static int[] amount = {5, 6, 7, 8, 9};

    //methods for checking, adding, or subtracting from item amount
    private static void check(String s) {
        for (int i = 0; i < supplies.length; i++) {
            if (supplies[i].equals(s)) {
                System.out.println(amount[i]);
            }
        }
    }

    private static void add(String s, int num) {
        for (int i = 0; i < supplies.length; i++) {
            if (supplies[i].equals(s)) {
                int org = amount[i];
                amount[i] = amount[i] + num;

                //displays original amount, amount added, and new amount
                System.out.println(supplies[i] + ":\n" + "Original amount: " + org + "\nAmount added: " + num + "\nNew " +
                        "total: " + amount[i]);
            }
        }
    }

    private static void subtract(String s, int num) {
        for (int i = 0; i < supplies.length; i++) {
            if (supplies[i].equals(s)) {
                int org = amount[i];
                amount[i] = amount[i] - num;

                //makes sure items do not go negative
                if (amount[i] < 0) {
                    amount[i] = 0;
                }
                System.out.println(supplies[i] + ":\n" + "Original amount: " + org + "\nAmount subtracted: " + num + "\nNew " +
                        "total: " + amount[i]);
            }
        }
    }

    private static void x(int num) {
        Scanner scan = new Scanner(System.in);
        if (num == 1) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Which item would you like to check?");
            String food = sc.nextLine();
            check(food);
        }

        if (num == 2) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Which item would you like to add to?");
            String food = sc.nextLine();
            System.out.println("How much would you like to add to it?");
            int j = scan.nextInt();
            add(food, j);
        }

        if (num == 3) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Which item would you like to subtract from?");
            String food = sc.nextLine();
            System.out.println("How much would you like to subtract from it?");
            int j = scan.nextInt();
            subtract(food, j);

        }
    }

    public static void main(String[] args) {
        //user needs to be able search any item and any amount -- add or subtract
        // error if sum is <0 display name -- org amount -- amount add / subtracted / new total

        //displays menu options, loops through item array
        System.out.println("\t Menu:");
        for (int i = 0; i < supplies.length; i++) {
            //displays user options
            System.out.println();
            System.out.println("Type the number of which action you'd like to do:\n1: Check inventory of an item" +
                    "\n2: Add to an item's inventory\n3: Subtract from an item's inventory ");

            Scanner scan = new Scanner(System.in);
            int c = scan.nextInt();

            //if valid input, use method x to run method of choice
            if (c <= 3 && c >= 1)
                x(c);

            //loops the options until appropriate option is selected 
            while (c < 1 || c > 3) {
                System.out.println("That was not an option\nType the number of which action you'd like to do:\n1: Check inventory of an item" +
                        "\n2: Add to an item's inventory\n3: Subtract from an item's inventory");
                c = scan.nextInt();
                x(c);
            }
        }
    }
}