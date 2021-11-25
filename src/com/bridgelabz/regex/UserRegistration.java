package com.bridgelabz.regex;

public class UserRegistration {

    private String firstName, lastName, email, password, phoneNumber;

    public static void main(String[] args) {
        UserRegistration user = new UserRegistration();
        Pattern pattern = new Pattern();

		/*pattern.addFirstName();
		user.firstName = pattern.getFirstName();

		pattern.addLastName();
		user.lastName = pattern.getLastName();

		pattern.addEmail();
		user.email = pattern.getEmail();

		pattern.addPhoneNumber();
		user.phoneNumber = pattern.getPhoneNumber();*/

        pattern.addPassword();
        user.password = pattern.getPassword();
        user.display();
    }

    private void display() {
        System.out.println("\nUser Data:-\n\tFirst Name : " + firstName + "\n\tLast Name : " + lastName + "\n\tEmail : "
                + email + "\n\tPhone Number : " + phoneNumber + "\n\tPassword : " + password);
    }
}