package com.cianmc.registrationform;

public class PasswordValidation {
    public boolean isValid(String password) {
        return password.length() >= 7;
    }
}
