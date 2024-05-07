module com.empresa.javafxscenebuilder {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;
    requires com.almasb.fxgl.all;

    opens com.empresa.javafxscenebuilder to javafx.fxml;
    exports com.empresa.javafxscenebuilder;
}