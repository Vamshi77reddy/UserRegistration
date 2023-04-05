package com.bridgeLabz;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
    public boolean validateFirstName(String name) {

        Pattern pattern = Pattern.compile("^[A-Z][a-z]{3,}$");
        Matcher matcher = pattern.matcher(name);
        if (matcher.matches())
            return true;
        else
            return false;
    }
    public boolean validateLastName(String name) {

        Pattern pattern = Pattern.compile("^[A-Z][a-z]{3,}$");
        Matcher matcher = pattern.matcher(name);
        if (matcher.matches())
            return true;
        else
            return false;
    }
    public boolean validateEmail(String eMail) {

        System.out.print("Enter Email id:- ");
        Pattern pattern2 = Pattern.compile("^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$");
        Matcher matcher2 = pattern2.matcher(eMail);
        if (matcher2.matches()) {
            return true;
        } else {
            return false;
        }
    }

}
