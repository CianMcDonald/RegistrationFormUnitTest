package com.cianmc.registrationform;

public class EmailAddressValidator {
    public boolean isValid(String email) {
        return email.length() > 0;
    }
}
