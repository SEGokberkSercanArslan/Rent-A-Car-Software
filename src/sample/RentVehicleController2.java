package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.Objects;
import java.util.Optional;
import java.util.ResourceBundle;

public class RentVehicleController2 extends MainMenuController implements Initializable{

    private static Vehicle  chosenVehicle;
    
    public TableView<Vehicle> vehicleSelectionTableView;
    public TableColumn<Vehicle,String> vehiclePlateNumber;
    public TableColumn<Vehicle,String> vehicleManufacturer;
    public TableColumn<Vehicle,String> vehicleType;
    public TableColumn<Vehicle,String> vehicleModel;
    public TableColumn<Vehicle,Integer> vehicleKilometer;
    public TableColumn<Vehicle,Double> vehiclePrice;
    public TableColumn<Vehicle,Double> vehicleGains;
    public TableColumn<Vehicle,String> vehicleStatus;

    public static void setChosenVehicle(Vehicle chosenVehicle) {
        RentVehicleController2.chosenVehicle = chosenVehicle;
    }

    public static Vehicle getChosenVehicle() {
        return chosenVehicle;
    }

    @FXML
    public void billingScreenNextButton(ActionEvent event) throws IOException {
        Alert WantToContinue = new Alert(Alert.AlertType.CONFIRMATION);
        WantToContinue.setTitle("Confirmation");
        WantToContinue.setHeaderText("Do you want to continue selected Vehicle ?");

        Optional<ButtonType> result = WantToContinue.showAndWait();
        if (result.get() == ButtonType.OK) {
            if(Objects.equals(vehicleSelectionTableView.getSelectionModel().getSelectedItem().getVehicleStatus(), "OUT Service")){
                setChosenVehicle(vehicleSelectionTableView.getSelectionModel().getSelectedItem());
                Parent RentVehicleScreen3 = FXMLLoader.load(getClass().getResource("RentVehicleScreen3.fxml"));
                Scene RentVehicleScreenScene3 = new Scene(RentVehicleScreen3);
                Stage RentVehicleScreenStage3 = (Stage) ((Node) event.getSource()).getScene().getWindow();
                RentVehicleScreenStage3.setScene(RentVehicleScreenScene3);
                RentVehicleScreenStage3.show();
            }
            else{
                Alert InWorkVehicle = new Alert(Alert.AlertType.ERROR);
                InWorkVehicle.setTitle("Error");
                InWorkVehicle.setHeaderText("The vehicle is currently in work");
                InWorkVehicle.showAndWait();
            }
        }
        else {
            WantToContinue.close();
        }

    }

    @Override
    public void menuItemAbout(ActionEvent event) {
        super.menuItemAbout(event);
    }

    @Override
    public void deleteUser(ActionEvent event) throws Exception {
        super.deleteUser(event);
    }

    @Override
    public void deleteVehicle(ActionEvent event) throws Exception {
        super.deleteVehicle(event);
    }

    @Override
    public void customerHistory(ActionEvent event) throws Exception {
        super.customerHistory(event);
    }

    @Override
    public void newUser(ActionEvent event) throws Exception {
        super.newUser(event);
    }

    @Override
    public void newVehicle(ActionEvent event) throws Exception {
        super.newVehicle(event);
    }

    @Override
    public void vehicleDatabase(ActionEvent event) throws Exception {
        super.vehicleDatabase(event);
    }

    @Override
    public void rentHistory(ActionEvent event) throws Exception {
        super.rentHistory(event);
    }

    @Override
    public void rentVehicle(ActionEvent event) throws Exception {
        super.rentVehicle(event);
    }

    @Override
    public void userActivities(ActionEvent event) throws Exception {
        super.userActivities(event);
    }

    @Override
    public void vehicleOffDuty(ActionEvent event) throws Exception {
        super.vehicleOffDuty(event);
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        vehiclePlateNumber.setCellValueFactory(new PropertyValueFactory<Vehicle,String>("vehiclePlateNumber"));
        vehicleManufacturer.setCellValueFactory(new PropertyValueFactory<Vehicle,String>("vehicleManufacturer"));
        vehicleType.setCellValueFactory(new PropertyValueFactory<Vehicle,String>("vehicleType"));
        vehicleModel.setCellValueFactory(new PropertyValueFactory<Vehicle,String>("vehicleModel"));
        vehicleKilometer.setCellValueFactory(new PropertyValueFactory<Vehicle,Integer>("vehicleKilometer"));
        vehiclePrice.setCellValueFactory(new PropertyValueFactory<Vehicle,Double>("vehiclePrice"));
        vehicleGains.setCellValueFactory(new PropertyValueFactory<Vehicle,Double>("vehicleGains"));
        vehicleStatus.setCellValueFactory(new PropertyValueFactory<Vehicle,String>("vehicleStatus"));
        vehicleSelectionTableView.setItems(Vehicle.vehicleObservableList);
    }
}
