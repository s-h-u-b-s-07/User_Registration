package com.bridgelabz.regex;

public class InvalidUserDetailsException extends Exception{

    enum Exception{FirstName,LastName,Email,Password,PhoneNumber};
    Exception exception;

    InvalidUserDetailsException(String exception){

        if(exception == "FirstName") {
            this.exception = Exception.FirstName;
        }else if (exception == "LastName") {
            this.exception = Exception.LastName;
        }else if (exception == "Email") {
            this.exception = Exception.Email;
        }else if (exception == "Password") {
            this.exception = Exception.Password;
        }else if (exception == "Phone") {
            this.exception = Exception.PhoneNumber;
        }
    }
    public String toString() {
        return "Exception : Invalid "+exception;

    }
}
