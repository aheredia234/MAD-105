package com.company;

public enum PositionTitle
{
    ADMINISTRATION("Administration"),
    PRODUCTION("Production"),
    SALES("Sales"),
    MAINTENANCE("Maintenance"),
    TECHNICAL("Technical"),
    SECRETARIAL("Secretarial");

    String s = "";

    PositionTitle(String s)
    {
        this.s = s;
    }


    @Override
    public String toString() {
        return super.toString();
    }
}
