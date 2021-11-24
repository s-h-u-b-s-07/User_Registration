package com.bridgelabz.regex;

public class UserRegistration {

    public static void main(String[] args) {
        String firstName, lastName, email, password, phoneNumber;
        Pattern pattern = new Pattern();
        pattern.addFirstName();
        firstName = pattern.getFirstName();
        pattern.addLastName();
        lastName = pattern.getLastName();
        System.out.println("\nUser Data:-\n\tFirst Name : " + firstName + "\n\tLast Name : " + lastName);

    }
}
