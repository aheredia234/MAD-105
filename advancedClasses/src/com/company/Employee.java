package com.company;

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
}
