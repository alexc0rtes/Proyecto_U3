module com.example.chat_u2 {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires java.logging;

    opens com.example.chat_u2 to javafx.fxml;
    exports com.example.chat_u2;
}