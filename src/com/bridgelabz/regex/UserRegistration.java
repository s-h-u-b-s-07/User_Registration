package com.bridgelabz.regex;

public class UserRegistration {

    public static void main(String[] args) {
        System.out.println("USER REGISTRATION SYSTEM");

        String firstName, lastName, email, password, phoneNumber;

        Pattern pattern = new Pattern();
        pattern.isValidFirstName();
        firstName = pattern.getFirstName();
        System.out.println("First Name : " + firstName);


    }
}
