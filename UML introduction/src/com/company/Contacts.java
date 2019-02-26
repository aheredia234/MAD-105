package com.company;

public class Contacts
{
    private String name = "";
    private int eNum = 0;
    private int shift = 0;

    //constructor method to create an obj of type Contacts
    public Contacts(String name, int eNum, int shift) {
        this.name = name;
        this.eNum = eNum;
        this.shift = shift;
    }


    //methods to set and return variables
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int geteNum() {
        return eNum;
    }

    public void seteNum(int eNum) {
        this.eNum = eNum;
    }

    public int getShift() {
        return shift;
    }

    public void setShift(int shift) {
        this.shift = shift;
    }

    //displays all Contact variables
    public void display(){
        System.out.println("Name: " + name + "\nEmployee number: "
        + eNum + "\nShift: " + shift +"\n");
    }
}
