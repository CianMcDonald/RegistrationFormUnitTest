package com.cianmc.registrationform;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class RegisterPresenter {

    public TextField emailField;
    public PasswordField passwordField;
    public Button submitButton;
    public Label responseLabel;

    public void handleSubmitButtonAction(ActionEvent actionEvent) {
        String email = emailField.getText();
        String password = passwordField.getText();
        if (!EmailAddressValidator.isValid(email) ) {
            responseLabel.setText("Error: Invalid email");

        } else if (!PasswordValidation.isValid(password)){
            responseLabel.setText("Error: invalid Password");
        } else {
            responseLabel.setText("Success!");
        }

    }
}