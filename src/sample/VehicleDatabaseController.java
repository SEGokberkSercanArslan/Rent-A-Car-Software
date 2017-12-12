package sample;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;

import java.net.URL;
import java.util.ResourceBundle;

public class VehicleDatabaseController extends MainMenuController implements Initializable {

    public TableColumn vehiclePlateNumber;
    public TableColumn vehicleManufacturer;
    public TableColumn vehicleType;
    public TableColumn vehicleModel;
    public TableColumn vehicleKilometer;
    public TableColumn vehiclePrice;
    public TableColumn vehicleGains;
    public TableColumn vehicleStatus;

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

    }
}
