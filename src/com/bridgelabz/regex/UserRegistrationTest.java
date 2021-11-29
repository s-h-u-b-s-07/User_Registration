package com.bridgelabz.regex;


import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class UserRegistrationTest {

    String Email;
    static UserData userdata;
    static Pattern pattern;
//	public static UserRegistrationTest instance;

//	public UserRegistrationTest(String email) {
//		super();
//		this.Email = email;
//	}
//
//	@Parameterized.Parameters
//	public Collection input() {
//		return Arrays.asList(null);
//
//	}

    @BeforeClass
    public static void init() {

        userdata = UserData.getInstance();
        pattern = Pattern.getInstance();
    }



    @Test
    public void testAddedFistNameShouldBeValid() {
        pattern.isValidFirstName();
        assertEquals(true, userdata.getFirstName().matches("^([A-Z]{1}+[a-z]{2,})*$"));
    }

    @Test

    public void testAddedLastNameShouldBeValid() {
        pattern.addLastName();
        assertEquals(true, userdata.getLastName().matches("^([A-Z]{1}+[a-z]{2,})*$"));
    }

    @Test
    public void testAddedEmailShouldBeValid() {
        pattern.addEmail();
        assertEquals(true, userdata.getEmail().matches("^[0-9a-zA-Z+-._]+@[-+_.0-9a-zA-Z]*.[a-zA-Z]{2,3}.([a-zA-z]{2,3})*$"));
    }

    @Test
    public void
    testAddedPhoneNumberShouldBeValid() {
        pattern.addPhoneNumber();
        assertEquals(true, userdata.getPhoneNumber().matches("^([0-9]{1,2})\\s([0-9]{10})$"));
    }

    @Test
    public void testAddedPasswordShouldBeValid() {
        pattern.addPassword();
        assertEquals(true, userdata.getPassword().matches("^(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=.*(@)).{8,}$"));
    }
}
