package com.bridgeLabz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class UserRegistrationTest {
    static UserRegistration userRegistration = new UserRegistration();


    @BeforeAll
    public static void init() {
        System.out.println("Before all");
        userRegistration = new UserRegistration();
    }
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
        boolean actualMobileNumber = userRegistration.validatePassword("vamshI@9");
        Assertions.assertTrue(actualMobileNumber);
        System.out.println("Password Successfully Validate.");
    }
    @Test
    void checkEmailShouldReturnTrue() {
        String text = "abc@yahoo.com";
        boolean email = userRegistration.validateEmail(text);
        Assertions.assertTrue(email);
        String text1 = "abc@yahoo.com";
        boolean email1 = userRegistration.validateEmail(text1);
        Assertions.assertTrue(email1);
        String text2 = "abc@yahoo.com";
        boolean email2 = userRegistration.validateEmail(text2);
        Assertions.assertTrue(email2);
        String text3 = "abc@yahoo.com";
        boolean email3 = userRegistration.validateEmail(text3);
        Assertions.assertTrue(email3);
        String text4 = "abc@yahoo.com";
        boolean email4 = userRegistration.validateEmail(text4);
        Assertions.assertTrue(email4);
        String text5 = "abc@yahoo.com";
        boolean email5 = userRegistration.validateEmail(text5);
        Assertions.assertTrue(email5);
        String text6 = "abc@yahoo.com";
        boolean email6 = userRegistration.validateEmail(text6);
        Assertions.assertTrue(email6);

        System.out.println("All test case successfully Passed!!!!");

    }
}
