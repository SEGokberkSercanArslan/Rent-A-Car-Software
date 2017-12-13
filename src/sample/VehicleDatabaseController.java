package sample;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.net.URL;
import java.util.ResourceBundle;

public class VehicleDatabaseController extends MainMenuController implements Initializable {

    public TableColumn<Vehicle,String> vehiclePlateNumber;
    public TableColumn<Vehicle,String> vehicleManufacturer;
    public TableColumn<Vehicle,String> vehicleType;
    public TableColumn<Vehicle,String> vehicleModel;
    public TableColumn<Vehicle,Integer> vehicleKilometer;
    public TableColumn<Vehicle,Double> vehiclePrice;
    public TableColumn<Vehicle,Double> vehicleGains;
    public TableColumn<Vehicle,String> vehicleStatus;
    public TableView<Vehicle> tableView;

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
        tableView.setItems(Vehicle.vehicleObservableList);
    }
}
