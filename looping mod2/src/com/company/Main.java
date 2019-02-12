package com.company;

import java.util.*;

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

        System.out.println("\nType the menu item you would like");

        Scanner scan = new Scanner(System.in);
        String choice = scan.nextLine();

        for(int i = 0; i < menu.length; i++)
        {
            if(choice.equals(menu[i]))
            {
                System.out.println("You chose " + menu[i]);

            }

            if(i == menu.length-1 && choice != menu[i])
            {
                System.out.println(choice + " is not on the menu");
            }
        }
    }
}
