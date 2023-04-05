package com.bridgeLabz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UserRegistrationTest {
    UserRegistration userRegistration = new UserRegistration();

    @Test
    void givenFirstNameShouldReturnTrue(){
        boolean actualValue = userRegistration.validateFirstName("Vamshi");
        Assertions.assertTrue(actualValue);
        System.out.println("FirstName Successfully Validate.");
    }
    @Test
    void givenLastNameReturnTrue(){
        boolean actualFirstName = userRegistration.validateLastName("Reddy");
        Assertions.assertTrue(actualFirstName);
        System.out.println("LastName Successfully Validate.");
    }
    @Test
    void givenEmailRerurnTrue(){
        boolean actualEmail = userRegistration.validateEmail("Vamshireddy2@gmail.com");
        Assertions.assertTrue(actualEmail);
        System.out.println("Email Successfully Validate.");
    }
    @Test
    void givenMobileNumberRerurnTrue(){
        boolean actualMobileNumber = userRegistration.validateMobileNumber("7730006563");
        Assertions.assertTrue(actualMobileNumber);
        System.out.println("Mobile Number Successfully Validate.");
    }
    @Test
    void givenPasswordRerurnTrue(){
        boolean actualMobileNumber = userRegistration.validatePassword("vamshivV");
        Assertions.assertTrue(actualMobileNumber);
        System.out.println("Password Successfully Validate.");
    }
}
