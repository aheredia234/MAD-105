package com.company;

import java.math.BigDecimal;
import java.text.DecimalFormat;

public class Employee
{
    private String sName;
    private String sPosition;
    private Boolean bSalary;
    private double payRate;
    private int shift;
    private String startDate;

    public Employee(String sName, String sPosition, Boolean bSalary, double payRate, int shift, String startDate) {
        this.sName = sName;
        this.sPosition = sPosition;
        this.bSalary = bSalary;
        this.payRate = payRate;
        this.shift = shift;
        this.startDate = startDate;
    }

    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName;
    }

    public String getsPosition() {
        return sPosition;
    }

    public void setsPosition(String sPosition) {
        this.sPosition = sPosition;
    }

    public Boolean getbSalary() {
        return bSalary;
    }

    public void setbSalary(Boolean bSalary) {
        this.bSalary = bSalary;
    }

    public double getPayRate() {
        return payRate;
    }

    public void setPayRate(double payRate) {
        this.payRate = payRate;
    }

    public int getShift() {
        return shift;
    }

    public void setShift(int shift) {
        this.shift = shift;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public void display()
    {
        System.out.println(sName);
        System.out.println(sPosition + " is Salary: " + bSalary);
        System.out.println("Shift: " + shift);
        System.out.println("Rate of pay: " + payRate + " per hour");


    }

    public void calculate(double hours)
    {
        double num = hours*payRate;
        if(bSalary==false && hours > 40)
            num = num+ ((hours-40)*payRate*1.5);
        else
            num = hours*payRate;
        if(shift == 2)
            num = num+(num*0.05);
        if(shift == 3)
            num = num+(num*.1);
        String snum = Double.toString(num);
        BigDecimal bum = new BigDecimal(snum);
        DecimalFormat df = new DecimalFormat("$#0.00");
        System.out.println(sName + " made " +  df.format(bum) + " this week\n" );
    }

}
