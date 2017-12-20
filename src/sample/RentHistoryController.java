package sample;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.net.URL;
import java.util.ResourceBundle;

public class RentHistoryController extends MainMenuController implements Initializable{

    public TableView<Rent> rentHistoryTableView;
    public TableColumn<Rent,String> rentPersonalColumn;
    public TableColumn<Rent,String> customerNameColumn;
    public TableColumn<Rent,String> customerSurnameColumn;
    public TableColumn<Rent,String> customerIDColumn;
    public TableColumn<Rent,String> vehiclePlateColumn;
    public TableColumn<Rent,String> vehicleTypeColumn;
    public TableColumn<Rent,String> rentDateColumn;
    public TableColumn<Rent,String> rentOffDateColumn;

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
    public void logOut(ActionEvent event) throws Exception {
        super.logOut(event);
    }

    @Override
    public void personalLog(ActionEvent event) throws Exception {
        super.personalLog(event);
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        rentPersonalColumn.setCellValueFactory(new PropertyValueFactory<Rent,String>("personalName"));
        customerNameColumn.setCellValueFactory(new PropertyValueFactory<Rent,String>("name"));
        customerSurnameColumn.setCellValueFactory(new PropertyValueFactory<Rent,String>("surname"));
        customerIDColumn.setCellValueFactory(new PropertyValueFactory<Rent,String>("idNumber"));
        vehiclePlateColumn.setCellValueFactory(new PropertyValueFactory<Rent,String>("vehiclePlateNumber"));
        vehicleTypeColumn.setCellValueFactory(new PropertyValueFactory<Rent,String>("vehicleType"));
        rentDateColumn.setCellValueFactory(new PropertyValueFactory<Rent,String>("rentDate"));
        rentOffDateColumn.setCellValueFactory(new PropertyValueFactory<Rent,String>("rentOffDate"));
        rentHistoryTableView.setItems(Rent.rentLogObservableList);
    }
}
