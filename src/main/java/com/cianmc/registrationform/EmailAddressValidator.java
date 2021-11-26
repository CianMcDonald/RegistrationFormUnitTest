package com.cianmc.registrationform;

public class EmailAddressValidator {
    public static boolean isValid(String email) {
        return email.length() > 0 && email.contains("@");
    }
}
