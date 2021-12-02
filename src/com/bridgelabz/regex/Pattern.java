package com.bridgelabz.regex;

import java.util.Scanner;

public class Pattern {

    private String firstName, lastName, email, password, phoneNumber;
    private static Pattern instance;

    Scanner sc = new Scanner(System.in);

    public Pattern() {

    }

    public static Pattern getInstance() {
        if(instance == null) {
            instance = new Pattern();
        }
        return instance;
    }

    public boolean isValidFirstName()  {

        UserData userdata = UserData.getInstance();
        System.out.print("Enter First Name : ");
        firstName = sc.nextLine();
        userdata.setFirstName(firstName);
        boolean check = firstName.matches("^([A-Z]{1}+[a-z]{2,})*$");
        try {
            if (check == true) {

                System.out.println("Valid");
            } else {
//			System.out.println("Invalid Add again(Eg:Jyotirmaya)");
                throw new InvalidUserDetailsException("FirstName");
//			isValidFirstName();
            }
        }catch(InvalidUserDetailsException e){
            e.printStackTrace();
        }
        return check;
    }

    public boolean addLastName() {

        UserData userdata = UserData.getInstance();
        System.out.print("Enter Last Name : ");
        lastName = sc.nextLine();
        userdata.setLastName(lastName);
        boolean check = lastName.matches("^([A-Z]{1}+[a-z]{2,})*$");
        try {
            if (check == true) {

                System.out.println("Valid");
            } else {
                throw new InvalidUserDetailsException("LastName");
//			addLastName();
            }
        }catch(InvalidUserDetailsException e) {
            e.printStackTrace();
        }
        return check;
    }

    public boolean addEmail() {

        UserData userdata = UserData.getInstance();
        System.out.print("Enter Email : ");
        email = sc.nextLine();
        userdata.setEmail(email);
//		System.out.print(email);
        boolean check = email.matches("^[0-9a-zA-Z+-._]+@[-+_.0-9a-zA-Z]{2,}.[a-zA-Z]{2,3}.([a-zA-z]{2,3})*$");
        try {
            if (check == true) {
//			userdata.setEmail(email);
                System.out.println("Valid");
            } else {
                throw new InvalidUserDetailsException("Email");
//			addEmail();
            }
        }catch(InvalidUserDetailsException e) {
            e.printStackTrace();
        }
        return check;
    }

    public boolean addEmail(String email) {

        UserData userdata = UserData.getInstance();

        userdata.setEmail(email);
//		System.out.print(email);
        boolean check = email.matches("^[0-9a-zA-Z+-._]+@[-+_.0-9a-zA-Z]{2,}.[a-zA-Z]{2,3}.([a-zA-z]{2,3})*$");
        try {
            if (check == true) {
//			userdata.setEmail(email);
                System.out.println("Valid");
            } else {
                throw new InvalidUserDetailsException("Email");
//			addEmail();
            }
        }catch(InvalidUserDetailsException e) {
            e.printStackTrace();
        }
        return check;
    }

    public boolean addPhoneNumber()  {

        UserData userdata = UserData.getInstance();
        System.out.print("Enter Phone Number : ");
        phoneNumber = sc.nextLine();
        userdata.setPhoneNumber(phoneNumber);
        boolean check = phoneNumber.matches("^([0-9]{1,2})\\s([0-9]{10})$");
        try {
            if (check == true) {

                System.out.println("Valid");
            } else {
                throw new InvalidUserDetailsException("Phone");
//			addPhoneNumber();
            }
        }catch(InvalidUserDetailsException e) {
            e.printStackTrace();
        }
        return check;
    }

    public boolean addPassword() {

        UserData userdata = UserData.getInstance();
        System.out.print("Enter Password : ");
        password = sc.nextLine();
        userdata.setPassword(password);
        boolean check = password.matches("^(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=.*(@)).{8,}$");
        try {
            if (check == true) {
//			userdata.setPassword(password);
                System.out.println("Valid");
            } else {
                throw new InvalidUserDetailsException("Password");
//			addPassword();
            }
        }catch(InvalidUserDetailsException e) {
            e.printStackTrace();
        }
        return check;
    }

}