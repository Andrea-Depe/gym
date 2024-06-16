module gym_software_project.gym_software_project {
    requires javafx.controls;
    requires javafx.fxml;
    requires jdk.jdi;
    requires java.sql;
    requires com.h2database;

    // Open the controller package to javafx.fxml
    opens gym_software_project.gym_software_project.controller to javafx.fxml;

    exports gym_software_project.gym_software_project.controller;
    exports gym_software_project.gym_software_project.model;
    exports gym_software_project.gym_software_project;
}
