module com.example.javabase_27062023_soshenko {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.javabase_27062023_soshenko to javafx.fxml;
    exports com.example.javabase_27062023_soshenko;
}