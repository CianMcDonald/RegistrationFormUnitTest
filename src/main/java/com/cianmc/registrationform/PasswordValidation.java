package com.cianmc.registrationform;

public class PasswordValidation {
    public static boolean isValid(String password) {
        return isValidLength(password) && containsLetter(password);
    }

    public static boolean isValidLength(String password) {
        return password.length() >= 7;
    }

    public static boolean containsLetter(String password){
        return password.matches(".+[a-zA-Z].+");
    }
}
