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
}
