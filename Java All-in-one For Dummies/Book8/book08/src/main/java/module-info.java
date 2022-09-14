module com.example.book08 {
    requires javafx.controls;
    requires javafx.fxml;


    exports com.example.book08.chapter1;
    opens com.example.book08.chapter1 to javafx.fxml;
    exports com.example.book08.chapter2;
    opens com.example.book08.chapter2 to javafx.fxml;
}