module com.example.conversortemperaturas {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;

    opens com.example.conversortemperaturas to javafx.fxml;
    exports com.example.conversortemperaturas;
}