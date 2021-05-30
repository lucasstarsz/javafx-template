module javafxtemplate {
    requires javafx.base;
    requires javafx.graphics;
    requires javafx.controls;
    requires javafx.fxml;

    exports template;

    // If your project uses FXML, make sure to open all packages that use
    // it to javafx.fxml like so:
    //
    // opens template.Main to javafx.fxml;
}
