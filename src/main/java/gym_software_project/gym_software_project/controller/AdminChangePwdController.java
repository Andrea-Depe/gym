package gym_software_project.gym_software_project.controller;

import gym_software_project.gym_software_project.model.UserManager;
import gym_software_project.gym_software_project.MainView;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class AdminChangePwdController {
    private static int currentAdminID;

    private UserManager userManager = new UserManager();

    @FXML
    private PasswordField passwordField;

    @FXML
    private PasswordField confirmPasswordField;

    @FXML
    private TextField errorField;

    @FXML
    private Button GoBackButton;

    @FXML
    public void handleChangePwd() {
        if (passwordField.getText().equals(confirmPasswordField.getText())) {
            userManager.changePassword(currentAdminID, passwordField.getText());
        } else {
            errorField.setVisible(true);
        }
    }

    @FXML
    private void handleBackButtonClick() {
        MainView.goBack();
    }

    public void set_current_ID (int userID) {
        currentAdminID = userID;
        System.out.println("ADMIN CHANGE PWD CONTROLLER: current_ID set to " + currentAdminID);
    }
}
