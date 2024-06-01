module com.main.codelabmodul6 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.main.codelabmodul6 to javafx.fxml;
    exports com.main.codelabmodul6;
}