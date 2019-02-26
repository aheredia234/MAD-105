package com.company;

public class Main {

    public static void main(String[] args) {

    //initializes jim as type Contacts, sets name, employee number, and shift
	Contacts jim = new Contacts("Jim", 7, 2);
	//outputs name, employee number, and shift, all at once
	jim.display();

	Contacts stacy = new Contacts("Stacy", 38,1);
	stacy.display();

	Contacts richard = new Contacts("Richard", 3, 3);
	richard.display();
    }
}
