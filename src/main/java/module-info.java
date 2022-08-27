module com.example.ejercicios1open {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.ejercicios1open to javafx.fxml;
    exports com.example.ejercicios1open;
}