package com.cianmc.registrationform;

import javafx.css.Match;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailAddressValidator {
    private static final String regex = "^[A-Za-z0-9+_.-]";
    public static boolean isValid(String email) {
        return isTooShort(email) && containsAt(email) && isValidUsername(email);
    }
    public static boolean isTooShort(String email){
        return email.length() > 0;
    }

    public static boolean containsAt(String email) {
        return email.contains("@");
    }

    public static boolean isValidUsername(String email) {
        Pattern pattern = Pattern.compile(regex);
        String[] parts = email.split("@");
        Matcher matcher = pattern.matcher(parts[0]);
        return matcher.matches();
    }

    public static boolean isValidDomain(String email) {
        Pattern pattern = Pattern.compile(regex);
        String[] parts = email.split("@");
        Matcher matcher = pattern.matcher(parts[1]);
        return matcher.matches();
    }
}
