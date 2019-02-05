package com.company;
import java.util.*;
public class Main
{

    public static void main(String[] args)
    {
//        int usernum1 = getInput( "Enter a number: ");
//      int usernum2 = getInput( "enter a number: ");
         int result=2;
//        result = bigger(usernum1, usernum2);

        result = bigger(1,4,100);
        System.out.println("The biggest number is " + result);
    }
    private static int getInput(String sLabel)
    {
        int items = 0;
        Scanner scan = new Scanner(System.in);
        System.out.print(sLabel);
        items = scan.nextInt();
        return items;
    }

    private static int bigger(int num1, int num2)
    {
        int result =  0;
        if (num1>num2)
        {
            return num1;
        }
        else {
            return num2;
        }
    }

    private static int bigger(int num1, int num2, int num3)
    {
        int results;
        if(num1>num2 && num1>num3){
            results = num1;
        }
        else if (num2>num1 && num2>num3){
            results = num2;
        }
        else{
            results = num3;
        }
        return results;
    }

}
