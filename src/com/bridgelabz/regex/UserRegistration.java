package com.bridgelabz.regex;

public class UserRegistration {

    public static void main(String[] args) {
        String firstName, lastName, email, password, phoneNumber;
        Pattern pattern = new Pattern();
        pattern.addFirstName();
        firstName = pattern.getFirstName();
        pattern.addLastName();
        lastName = pattern.getLastName();
        pattern.addEmail();
        email = pattern.getEmail();
        System.out.println(
                "\nUser Data:-\n\tFirst Name : " + firstName + "\n\tLast Name : " + lastName + "\n\tEmail : " + email);
    }
}
