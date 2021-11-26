module com.cianmc.registrationform {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.cianmc.registrationform to javafx.fxml;
    exports com.cianmc.registrationform;
}