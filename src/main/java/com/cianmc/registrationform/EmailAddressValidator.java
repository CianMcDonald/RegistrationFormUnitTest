package com.cianmc.registrationform;

public class EmailAddressValidator {
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
        String[] parts = email.split("@");
        return parts[0].length() > 0;
    }
}
