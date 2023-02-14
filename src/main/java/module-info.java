module com.example.ikonli_gradle {
    requires javafx.controls;
    requires javafx.fxml;
    requires org.kordamp.ikonli.javafx;
    opens com.example.ikonli_gradle to javafx.fxml;
    exports com.example.ikonli_gradle;
}