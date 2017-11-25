package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;

public class MainMenuController {

    @FXML
    public void menuItemAbout(ActionEvent event){
        Alert softwareInfo = new Alert(Alert.AlertType.INFORMATION);
        softwareInfo.setTitle("About Software");
        softwareInfo.setHeaderText("Rent A Car software for more information please contact se-sercan@outlook.com");
        softwareInfo.setContentText("The software created by Gökberk Sercan Arslan and Kübra Korkmaz");
        softwareInfo.showAndWait();
    }

    @FXML
    public void userActivities(ActionEvent event){

    }

    @FXML
    public void newUser(ActionEvent event) {

    }

    @FXML
    public void deleteUser(ActionEvent event) {

    }

    @FXML
    public void vehicleDatabase(ActionEvent event) {

    }

    @FXML
    public void newVehicle(ActionEvent event) {

    }

    @FXML
    public void deleteVehicle(ActionEvent event) {

    }

    @FXML
    public void rentVehicle(ActionEvent event) {

    }

    @FXML
    public void rentHistory(ActionEvent event) {

    }

    @FXML
    public void vehicleOffDuty(ActionEvent event) {

    }

    @FXML
    public void customerHistory(ActionEvent event) {

    }



}
