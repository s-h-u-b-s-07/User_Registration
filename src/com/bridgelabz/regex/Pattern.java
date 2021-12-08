package com.bridgelabz.regex;

import java.util.Scanner;

public class Pattern {

    private String firstName, lastName, email, password, phoneNumber;
    private static Pattern instance;

    Scanner sc = new Scanner(System.in);

    void userEntry() throws InvalidUserDetailsException {

        IUserRegistration isvalidateFirstName = (FirstName) -> {
            try {
                UserData userdata = new UserData();
                System.out.print("Enter First Name : ");
                String name = sc.nextLine();
                userdata.setFirstName(name);
                if (name.matches("^([A-Z]{1}+[a-z]{2,})*$"))
                    return true;
                throw new InvalidUserDetailsException("FirstName");
            }catch(InvalidUserDetailsException e){
                System.out.println(e.getMessage());
            }
            return false;
        };
        System.out.println(isvalidateFirstName.details(firstName));


        IUserRegistration isvalidateLastName = (LastName) -> {
            try {
                UserData userdata = new UserData();
                System.out.print("Enter Last Name : ");
                String name = sc.nextLine();
                userdata.setLastName(name);
                if (name.matches("^([A-Z]{1}+[a-z]{2,})*$"))
                    return true;
                throw new InvalidUserDetailsException("LastName");
            }catch(InvalidUserDetailsException e){
                System.out.println(e.getMessage());
            }
            return false;
        };
        System.out.println(isvalidateLastName.details(lastName));


        IUserRegistration isvalidateEmail = (email) -> {
            try {
                UserData userdata = new UserData();
                System.out.print("Enter E-Mail ID : ");
                String Email = sc.nextLine();
                userdata.setEmail(Email);
                if (Email.matches("^[0-9a-zA-Z+-._]+@[-+_.0-9a-zA-Z]{2,}.[a-zA-Z]{2,3}.([a-zA-z]{2,3})*$"))
                    return true;
                throw new InvalidUserDetailsException("Email");
            }catch(InvalidUserDetailsException e){
                System.out.println(e.getMessage());
            }
            return false;
        };
        System.out.println(isvalidateEmail.details(email));



        IUserRegistration isvalidatePhoneNumber = (phoneNumber) -> {
            try {
                UserData userdata = new UserData();
                System.out.print("Enter Phone Number : ");
                String PhoneNumber = sc.nextLine();
                userdata.setPhoneNumber(PhoneNumber);
                if (PhoneNumber.matches("^([0-9]{1,2})\\s([0-9]{10})$"))
                    return true;
                throw new InvalidUserDetailsException("PhoneNumber");
            }catch(InvalidUserDetailsException e){
                System.out.println(e.getMessage());
            }
            return false;
        };
        System.out.println(isvalidatePhoneNumber.details(phoneNumber));


        IUserRegistration isvalidatePassword = (password) -> {
            try {
                UserData userdata = new UserData();
                System.out.print("Enter Password : ");
                String Password = sc.nextLine();
                userdata.setPassword(Password);
                if (Password.matches("^(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=.*(@)).{8,}$"))
                    return true;
                throw new InvalidUserDetailsException("Password");
            }catch(InvalidUserDetailsException e){
                System.out.println(e.getMessage());
            }
            return false;
        };
        System.out.println(isvalidatePassword.details(password));
    }

    public static Pattern getInstance() {
        if(instance == null) {
            instance = new Pattern();
        }
        return instance;
    }

}