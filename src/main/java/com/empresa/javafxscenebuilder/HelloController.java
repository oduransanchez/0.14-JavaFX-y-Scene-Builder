package com.empresa.javafxscenebuilder;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

public class HelloController {
    @FXML
    private TextField txtCorreo;

    @FXML
    private PasswordField txtContrasena;

    @FXML
    private PasswordField txtConfirmarContrasena;

    @FXML
    private CheckBox cbPrivacidad;

    @FXML
    void registrarse(ActionEvent event) {
        String correo = txtCorreo.getText();
        String contrasena = txtContrasena.getText();
        String confirmarContrasena = txtConfirmarContrasena.getText();
        boolean privacidadAceptada = cbPrivacidad.isSelected();

        if (correo.isEmpty() || contrasena.isEmpty() || confirmarContrasena.isEmpty()) {
            mostrarAlerta("Por favor completa todos los campos.");
        } else if (!contrasena.equals(confirmarContrasena)) {
            mostrarAlerta("Las contraseñas no coinciden.");
        } else if (!privacidadAceptada) {
            mostrarAlerta("Debes aceptar la política de privacidad.");
        } else {
            mostrarAlerta("Usuario registrado correctamente.");
        }
    }

    private void mostrarAlerta(String mensaje) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Registro de Usuario");
        alert.setHeaderText(null);
        alert.setContentText(mensaje);
        alert.showAndWait();
    }
}
