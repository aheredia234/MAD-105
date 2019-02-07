package com.company;


import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        String[]  menu = new String[5];

        menu[0] = "Hotdogs";
        menu[1] = "Hamburgers";
        menu[2] = "Pizza";
        menu[3] = "Coke";
        menu[4] = "Dr Pepper";

        //display menu
        for (int i = 0; i < menu.length; i++)
        {
            System.out.print(menu[i] + "\t");
        }

        System.out.println("Type the menu item you would like");

        Scanner scan = new Scanner(System.in);
        scan = scan.nextLine();
    }
}
