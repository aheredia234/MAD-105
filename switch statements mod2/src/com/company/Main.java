package com.company;

import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {

        String str;
        System.out.println("Enter a number 1-10");

        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();

        switch (num) {
            case 1:
                str = "eins";
                System.out.println(str + " is " + num + " in German");
                break;
            case 2:
                str = "zwei";
                System.out.println(str + " is " + num + " in German");
                break;
            case 3:
                str = "drei";
                System.out.println(str + " is " + num + " in German");
                break;
            case 4:
                str = "vier";
                System.out.println(str + " is " + num + " in German");
                break;
            case 5:
                str = "funf";
                System.out.println(str + " is " + num + " in German");
                break;
            case 6:
                str = "sechs";
                System.out.println(str + " is " + num + " in German");
                break;
            case 7:
                str = "sieben";
                System.out.println(str + " is " + num + " in German");
                break;
            case 8:
                str = "acht";
                System.out.println(str + " is " + num + " in German");
                break;
            case 9:
                str = "neun";
                System.out.println(str + " is " + num + " in German");
                break;
            case 10:
                str = "zehn";
                System.out.println(str + " is " + num + " in German");
                break;
            default:
                str = "That was an invalid entry";
                System.out.println(str);
        }

    }

}