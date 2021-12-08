package com.bridgelabz.regex;


import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class UserRegistrationTest {

    String Email;
    static UserData userdata;
    static Pattern pattern;

    @BeforeClass
    public static void init() {

        userdata = UserData.getInstance();
        pattern = Pattern.getInstance();
    }



    @Test
    public void testAddedFistNameShouldBeValid() {

        IUserRegistration isvalidateFirstName = (FirstName) -> {

            assertEquals(true, userdata.getFirstName().matches("^([A-Z]{1}+[a-z]{2,})*$"));
            return false;

        };
    }
    @Test

    public void testAddedLastNameShouldBeValid() {
        IUserRegistration isvalidateLastName = (LastName) -> {
            assertEquals(true, userdata.getLastName().matches("^([A-Z]{1}+[a-z]{2,})*$"));
            return false;
        };
    }

    @Test
    public void testAddedEmailShouldBeValid() {
        IUserRegistration isvalidateEmail = (email) -> {
            assertEquals(true, userdata.getEmail().matches("^[0-9a-zA-Z+-._]+@[-+_.0-9a-zA-Z]{2,}.[a-zA-Z]{2,3}.([a-zA-z]{2,3})*$"));
            return false;
        };
    }

    @Test
    public void testAddedPhoneNumberShouldBeValid() {
        IUserRegistration isvalidatePhoneNumber = (phoneNumber) -> {
            assertEquals(true, userdata.getPhoneNumber().matches("^([0-9]{1,2})\\s([0-9]{10})$"));
            return false;
        };
    }


    @Test
    public void testAddedPasswordShouldBeValid() {
        IUserRegistration isvalidatePassword = (password) -> {
            assertEquals(true, userdata.getPassword().matches("^(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])"
                    + "(?=.*(@)).{8,}$"));
            return false;
        };
    }
}
