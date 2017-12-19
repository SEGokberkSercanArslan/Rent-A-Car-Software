package sample;


import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.net.URL;
import java.util.ResourceBundle;

public class VehicleOffDutyController extends MainMenuController implements Initializable{


    public TableView<Rent> vehicleOffServiceTableView;
    public TableColumn<Rent,String> customerNameColumn;
    public TableColumn<Rent, String> customerSurnameColumn;
    public TableColumn<Rent,String> vehicleTypeColumn;
    public TableColumn<Rent,String> vehicleManufacturerColumn;
    public TableColumn<Rent,String> vehicleModelColumn;
    public TableColumn<Rent,String> vehiclePlateNumberColumn;
    public TableColumn<Rent,String> vehicleStatusColumn;
    public DatePicker rentOutDatePicker;

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
        customerNameColumn.setCellValueFactory(new PropertyValueFactory<Rent,String>("name"));
        customerSurnameColumn.setCellValueFactory(new PropertyValueFactory<Rent,String>("surname"));
        vehicleTypeColumn.setCellValueFactory(new PropertyValueFactory<Rent,String>("vehicleType"));
        vehicleManufacturerColumn.setCellValueFactory(new PropertyValueFactory<Rent,String>("vehicleManufacturer"));
        vehicleModelColumn.setCellValueFactory(new PropertyValueFactory<Rent,String>("vehicleModel"));
        vehiclePlateNumberColumn.setCellValueFactory(new PropertyValueFactory<Rent,String>("vehiclePlateNumber"));
        vehicleStatusColumn.setCellValueFactory(new PropertyValueFactory<Rent,String>("vehicleStatus"));
        vehicleOffServiceTableView.setItems(Rent.rentObservableList);
    }
}
