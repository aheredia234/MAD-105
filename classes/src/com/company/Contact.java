package com.company;

public class Contact {
    String sFirstName = "";
    String sLastName = "";
    String sPhoneNum = "";


    public Contact(String sFirstName, String sLastName, String sPhoneNum) {
        this.sFirstName = sFirstName;
        this.sLastName = sLastName;
        this.sPhoneNum = sPhoneNum;
    }

    public String getsPhoneNum() {
        return sPhoneNum;
    }

    public String getsFirstName() {
        return sFirstName;
    }

    public void setsFirstName(String sFirstName) {
        this.sFirstName = sFirstName;
    }

    public void setsPhoneNum(String sPhoneNum) {
        this.sPhoneNum = sPhoneNum;
    }

    public String getsLastName() {
        return sLastName;
    }

    public void setsLastName(String sLastName) {
        this.sLastName = sLastName;
    }

    public void printFirstName()
    {
        System.out.println("First name: " + sFirstName);
    }

    public void printLastName()
    {
        System.out.println("First name: " + sLastName);
    }

    public void printPhoneNum()
    {
        System.out.println("First name: " + sPhoneNum);
    }
}
