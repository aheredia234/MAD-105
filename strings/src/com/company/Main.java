package com.company;

import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
	// You will create a simple, 5 question, fill in the blank quiz on a subject of your choice. Use the
        // equalsIgnoreCase method to determine if the user provides the correct answer. Tell them if they got the
        // answer right or not. At the end of the quiz, tell them how many questions that they got right.

        //initializes answers
        String a1 = "Springfield";
        String a2 = "Denver";
        String a3 = "Nashville";
        String a4 = "Annapolis";
        String a5 = "Madison";

        //count for num of correct answers
        int count = 0;

        Scanner scan = new Scanner(System.in);


        //asks user question
        System.out.println("What is the capital of Illinois?");
            String s1 = scan.nextLine();
            //checks is user answer matches string variable values, adds one to count if equal
            if(s1.equalsIgnoreCase(a1))
            {
                System.out.println("That is correct");
                count++;
            }
            else
                System.out.println("That is incorrect");


        System.out.println("What is the capital of Colorado?");
            String s2 = scan.nextLine();
            if(s2.equalsIgnoreCase(a2))
              {
                 System.out.println("That is correct");
                 count++;
              }
            else
                System.out.println("That is incorrect");


        System.out.println("What is the capital of Tennessee?");
            String s3 = scan.nextLine();
            if(s3.equalsIgnoreCase(a3))
            {
                System.out.println("That is correct");
                count++;
            }
            else
                System.out.println("That is incorrect");


        System.out.println("What is the capital of Maryland?");
            String s4 = scan.nextLine();
            if(s4.equalsIgnoreCase(a4))
            {
                System.out.println("That is correct");
                count++;
            }
            else
                System.out.println("That is incorrect");

            
        System.out.println("What is the capital of Wisconsin?");
            String s5 = scan.nextLine();
            if(s5.equalsIgnoreCase(a5))
            {
                System.out.println("That is correct");
                count++;
            }
            else
                System.out.println("That is incorrect");

        System.out.println("You got " + count + " out of 5 correct");
    }
}
