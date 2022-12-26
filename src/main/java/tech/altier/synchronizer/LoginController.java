package tech.altier.synchronizer;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;

public class LoginController {
    @FXML
    private PasswordField accessTokenField;
    @FXML
    private Label label;

    public static String ACCESS_TOKEN;

    @FXML
    private void onLoginButtonClick() {
        System.out.println("Login button clicked!");
        ACCESS_TOKEN = accessTokenField.getText();

        // Check if null or empty
        if (ACCESS_TOKEN == null || ACCESS_TOKEN.isEmpty()) {
            label.setText("Please enter a valid access token!");
        }
    }
}
