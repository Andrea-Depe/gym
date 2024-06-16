package gym_software_project.gym_software_project.controller;


import gym_software_project.gym_software_project.model.AgendaManager;
import gym_software_project.gym_software_project.model.UserAnagraficaModel;
import gym_software_project.gym_software_project.MainView;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

import java.util.List;

public class AdminUserTableController {
    private static int currentAdminID;

    AgendaManager agendaManager = new AgendaManager();

    public AdminUserTableController() {}

    @FXML
    private Button GoBackButton;

    @FXML
    private TableView<UserAnagraficaModel> userTable;

    @FXML
    private TableColumn<UserAnagraficaModel, String> userNameCol;

    @FXML
    private TableColumn<UserAnagraficaModel, String> userSurnameCol;

    @FXML
    private TableColumn<UserAnagraficaModel, String>  userHeightCol;

    @FXML
    private TableColumn<UserAnagraficaModel, String> userWeightCol;

    @FXML
    private TableColumn<UserAnagraficaModel, String> userAgeCol;

    public void set_current_ID (int userID) {
        currentAdminID = userID;
        System.out.println("ADMIN USER TABLE CONTROLLER: current_ID set to " + currentAdminID);
    }

    @FXML
    private void handleBackButtonClick() {
        MainView.goBack();
    }

    public void initialize() {
        userNameCol.setCellValueFactory(cellData -> cellData.getValue().userNameProperty());
        userSurnameCol.setCellValueFactory(cellData -> cellData.getValue().userSurnameProperty());
        userHeightCol.setCellValueFactory(cellData -> cellData.getValue().userHeightProperty());
        userWeightCol.setCellValueFactory(cellData -> cellData.getValue().userWeightProperty());
        userAgeCol.setCellValueFactory(cellData -> cellData.getValue().userAgeProperty());

        userTable.setItems(getData());
    }

    private ObservableList<UserAnagraficaModel>  getData() {

        List<UserAnagraficaModel> users = agendaManager.get_user_by_admin(currentAdminID);
        ObservableList<UserAnagraficaModel> data = FXCollections.observableArrayList(users);

        return data;
    }

}
