package com.company;
import java.util.*;
public class Main
{
    public static void main(String[] args)
    {
	    double temp;
        System.out.println("Input temp");

        //scans for input for variable
	    Scanner scan = new Scanner(System.in);
	    //sets temp equal to input value
	    temp = scan.nextDouble();

	    //prints whether its low, normal, or high temperature
	    if(temp<97.5)
        {
            System.out.println(temp+ ": temperature is low");
        }
        else if(temp<=99.5)
        {
            System.out.println(temp +": temperature is normal");
        }
        else
        {
            System.out.println(temp+ ": temperature is high");
        }
    }
}
