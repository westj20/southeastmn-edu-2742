module beanbags.beanbag {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;

    opens beanbags.beanbag to javafx.fxml;
    exports beanbags.beanbag;
}