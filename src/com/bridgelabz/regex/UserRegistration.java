package com.bridgelabz.regex;

public class UserRegistration {
    private String firstName, lastName, email, phoneNumber, password;

    public static void main(String[] args) {

        UserData userdata = UserData.getInstance();
        UserRegistration user = new UserRegistration();
        Pattern pattern = new Pattern();

        pattern.isValidFirstName();
        user.firstName = userdata.getFirstName();
//
//		pattern.addLastName();
//		user.lastName = userdata.getLastName();
//
//		pattern.addEmail();
//		user.email = userdata.getEmail();
//
//		pattern.addPhoneNumber();
//		user.phoneNumber = userdata.getPhoneNumber();
//
//		pattern.addPassword();
//		user.password = userdata.getPassword();
    }

//	private void display() {
//
//		System.out.println("\nUser Data:-\n\tFirst Name : " + firstName +
//				"\n\tLast Name : " + lastName + "\n\tEmail : "+ email + "\n\tPhone Number : " + phoneNumber);
//
//	}

}
