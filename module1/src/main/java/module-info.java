module com.example.module1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.module1 to javafx.fxml;
    exports com.example.module1;
}