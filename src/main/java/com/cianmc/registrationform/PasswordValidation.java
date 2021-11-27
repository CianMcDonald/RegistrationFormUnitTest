package com.cianmc.registrationform;

public class PasswordValidation {
    public static boolean isValid(String password) {
        return password.length() >= 7;
    }
}
