package com.company;

public class Main
{

    public static void main(String[] args)
    {
        //Test the class by instantiating 3 people, one on salary working 45 hours that week on first shift,
        // one on hourly working 50 hours that week on second shift,
        // and one on hourly working 35 hours that week, on third shift.
	    Employee emp1 = new Employee("Jen Carlson", PositionTitle.ADMINISTRATION.toString(), true,
                30.00, 1, "January 1st");
	    Employee emp2 = new Employee("James J", PositionTitle.TECHNICAL.toString(), false,
                25.00, 2, "May 1st, 2017");
	    Employee emp3 = new Employee("Margo Clemins",PositionTitle.SALES.toString(),false,
                27.00,3, "February 2nd, 2015");
    }
}
