module com.example.jwestex1c2 {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;

    opens com.example.jwestex1c2 to javafx.fxml;
    exports com.example.jwestex1c2;
}