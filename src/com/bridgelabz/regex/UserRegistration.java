package com.bridgelabz.regex;


	public class UserRegistration {
		private String firstName, lastName, email, phoneNumber, password;

		public static void main(String[] args) throws InvalidUserDetailsException {

			UserData userdata = UserData.getInstance();
			UserRegistration user = new UserRegistration();

			Pattern pattern = new Pattern();
			pattern.userEntry();

		}
	}

