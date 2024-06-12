module com.example.functions {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens com.example.functions to javafx.fxml;
    exports com.example.functions;
}