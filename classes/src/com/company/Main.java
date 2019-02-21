package com.company;

public class Main {

    public static void main(String[] args) {
	Contact person1 = new Contact("Angela", "Heredia", "8");

	String holdFirstName = person1.getsFirstName();

        person1.printFirstName();
    }
}
