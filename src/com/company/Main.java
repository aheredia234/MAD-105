package com.company;

public class Main
{

    public static void main(String[] args)
    {
	 byte b = 8; //-128-127
	 short s = 78; //-32768-32767
        int i = 27;
        long l = 100;
        float f = .2f; // saves data compared to double
        double d = 2.0;
        boolean boo = false;
        char c = 'a';

        System.out.println(b + " Is a byte, which is 8 bit, stores -128-127, inclusive");
        System.out.println(s + " Is a short, which is 16 bit, stores -32768-32767");
        System.out.println(i + " is an int, which is 32 bit");
        System.out.println(l + " is a long, 64 bit");
        System.out.println(f + " is a float, is a decimal, saves space compared to a double");
        System.out.println(d + " is a double, which holds decimals");
        System.out.println(boo + " is a boolean, holds T/F values.");
        System.out.println(c + " is a char, it can hold a single character ");
    }
}
