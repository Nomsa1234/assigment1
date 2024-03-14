module com.example.nmuso {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.nmuso to javafx.fxml;
    exports com.example.nmuso;
}