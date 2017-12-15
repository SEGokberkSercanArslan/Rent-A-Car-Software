package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.util.Objects;

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
    public void userActivities(ActionEvent event) throws Exception{
        if(Objects.equals(Personal.currentUser.getPrivilege(), "Admin")){
        Parent userActivitiesScreen = FXMLLoader.load(getClass().getResource("UserActivitiesScreen.fxml"));
        Scene userScene = new Scene(userActivitiesScreen);
        Stage userStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        userStage.setScene(userScene);
        userStage.show(); }
        else{
            Alert PrivliledgeWarning = new Alert(Alert.AlertType.WARNING);
            PrivliledgeWarning.setTitle("Warning");
            PrivliledgeWarning.setHeaderText("You don't have authorization for this.");
            PrivliledgeWarning.showAndWait();
        }
    }

    @FXML
    public void newUser(ActionEvent event) throws Exception{
        Parent newUserScreen = FXMLLoader.load(getClass().getResource("NewUserScreen.fxml"));
        Scene newUserScene = new Scene(newUserScreen);
        Stage newUserStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        newUserStage.setScene(newUserScene);
        newUserStage.show();
    }

    @FXML
    public void deleteUser(ActionEvent event) throws Exception{
        Parent deleteUserScreen = FXMLLoader.load(getClass().getResource("DeleteUserScreen.fxml"));
        Scene deleteUserScene = new Scene(deleteUserScreen);
        Stage deleteUSerStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        deleteUSerStage.setScene(deleteUserScene);
        deleteUSerStage.show();
    }

    @FXML
    public void vehicleDatabase(ActionEvent event) throws Exception{
        Parent vehicleDatabaseScreen = FXMLLoader.load(getClass().getResource("VehicleDatabaseScreen.fxml"));
        Scene vehicleDatabaseScene = new Scene(vehicleDatabaseScreen);
        Stage vehicleDatabaseStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        vehicleDatabaseStage.setScene(vehicleDatabaseScene);
        vehicleDatabaseStage.show();
    }

    @FXML
    public void newVehicle(ActionEvent event) throws Exception{
        Parent newVehicleScreen = FXMLLoader.load(getClass().getResource("NewVehicleScreen.fxml"));
        Scene newVehicleScene = new Scene(newVehicleScreen);
        Stage newVehicleStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        newVehicleStage.setScene(newVehicleScene);
        newVehicleStage.show();
    }

    @FXML
    public void deleteVehicle(ActionEvent event) throws Exception{
        Parent deleteVehicleScreen = FXMLLoader.load(getClass().getResource("DeleteVehicleScreen.fxml"));
        Scene deleteVehicleScene = new Scene(deleteVehicleScreen);
        Stage deleteVehicleStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        deleteVehicleStage.setScene(deleteVehicleScene);
        deleteVehicleStage.show();
    }

    @FXML
    public void rentVehicle(ActionEvent event) throws Exception{
        Parent rentVehicleScreen = FXMLLoader.load(getClass().getResource("RentVehicleScreen.fxml"));
        Scene rentVehicleScene = new Scene(rentVehicleScreen);
        Stage rentVehicleStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        rentVehicleStage.setScene(rentVehicleScene);
        rentVehicleStage.show();
    }

    @FXML
    public void rentHistory(ActionEvent event) throws Exception{
        Parent rentHistoryScreen = FXMLLoader.load(getClass().getResource("RentHistoryScreen.fxml"));
        Scene rentHistoryScene = new Scene(rentHistoryScreen);
        Stage rentHistoryStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        rentHistoryStage.setScene(rentHistoryScene);
        rentHistoryStage.show();
    }

    @FXML
    public void vehicleOffDuty(ActionEvent event) throws Exception{
        Parent vehicleOffDutyScreen = FXMLLoader.load(getClass().getResource("VehicleOffDutyScreen.fxml"));
        Scene vehicleOffDutyScene = new Scene(vehicleOffDutyScreen);
        Stage vehicleOffDutyStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        vehicleOffDutyStage.setScene(vehicleOffDutyScene);
        vehicleOffDutyStage.show();
    }

    @FXML
    public void customerHistory(ActionEvent event) throws Exception {
        Parent customerHistoryScreen = FXMLLoader.load(getClass().getResource("CustomerHistoryScreen.fxml"));
        Scene customerHistoryScene = new Scene(customerHistoryScreen);
        Stage customerHistoryStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        customerHistoryStage.setScene(customerHistoryScene);
        customerHistoryStage.show();
    }



}
