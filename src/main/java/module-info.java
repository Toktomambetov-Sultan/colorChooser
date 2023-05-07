module java_fx.colorchooser {
    requires javafx.controls;
    requires javafx.fxml;


    opens java_fx.colorchooser to javafx.fxml;
    exports java_fx.colorchooser;
}