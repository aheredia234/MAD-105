package com.company;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Main
{

    public static void main(String[] args)
    {
        LocalDate today = LocalDate.now(); //current date & time
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("M/d/yyyy");

        LocalDate lastMoon =  LocalDate.of(2019,2, 19);


        //corrects date of last full moon past february
        while(today.getMonth()!=lastMoon.getMonth())
        {
            lastMoon.plusDays(29);
        }
        LocalDate nextMoon = LocalDate.now();

        //eq to calculate next full moon date
        nextMoon = today.plusDays(29).plusDays(lastMoon.getDayOfMonth()-today.getDayOfMonth());

        //format both dates & print
        String snDate = lastMoon.format(dtf);
        String sDate = nextMoon.format(dtf);
        System.out.println("The last full moon was: " + snDate);
        System.out.println("The next full moon is: " + sDate);
    }
}