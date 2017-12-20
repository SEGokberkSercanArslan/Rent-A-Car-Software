package sample;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import java.net.URL;
import java.util.Objects;
import java.util.Optional;
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

    @FXML
    public void rentOutButton(ActionEvent event) {
        long rentDate =0;
        long planedRentOutDate=0;
        long actualRentOutDate=0;
        int dayDifferencePlaned=0;
        int dayDifferenceActual=0;
        double totalFee=0;
        Rent rentObj;
        rentObj = vehicleOffServiceTableView.getSelectionModel().getSelectedItem();
        rentDate = rentObj.getVehicleRentDate();
        planedRentOutDate = rentObj.getVehicleOffDutyDatePlanned();
        actualRentOutDate = rentOutDatePicker.getValue().toEpochDay();
        dayDifferencePlaned = (int) Math.abs(planedRentOutDate-rentDate);
        dayDifferenceActual = (int) Math.abs(rentOutDatePicker.getValue().toEpochDay()-rentDate);
        System.out.println("Day Difference planed :"+dayDifferencePlaned);
        System.out.println("Day Difference actual :"+dayDifferenceActual);
        if(dayDifferencePlaned>dayDifferenceActual){
            totalFee = dayDifferencePlaned*rentObj.getRentalFee();
        }
        else {
            totalFee = dayDifferencePlaned*rentObj.getRentalFee()+(dayDifferenceActual-dayDifferencePlaned)*rentObj.getDelayFee();
        }
        Alert CalculatedTotalFee = new Alert(Alert.AlertType.CONFIRMATION);
        CalculatedTotalFee.setTitle("Confirmation");
        CalculatedTotalFee.setHeaderText("The rental fee is calculated below the detailed information.");
        CalculatedTotalFee.setContentText("Total Fee :"+totalFee);

        Optional<ButtonType> result = CalculatedTotalFee.showAndWait();
        if (result.get() == ButtonType.OK) {
            rentObj.setItLog(true);
            Rent.rentLog.add(rentObj);
            Rent.rentLogObservableList.add(rentObj);
            Rent.info.remove(rentObj);
            Rent.rentObservableList.removeAll(rentObj);
            for (int counter=0;counter<Vehicle.info.size();counter++){
                if(Objects.equals(rentObj.getVehiclePlateNumber(), Vehicle.info.get(counter).getVehiclePlateNumber())){
                    Vehicle.info.get(counter).setVehicleStatus("OUT Service");
                }
            }
            for (int counter=0;counter<Vehicle.vehicleObservableList.size();counter++){
                if(Objects.equals(rentObj.getVehiclePlateNumber(), Vehicle.vehicleObservableList.get(counter).getVehiclePlateNumber())){
                    Vehicle.vehicleObservableList.get(counter).setVehicleStatus("OUT Service");
                }
            }
        } else {
            CalculatedTotalFee.close();
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
    public void logOut(ActionEvent event) throws Exception {
        super.logOut(event);
    }

    @Override
    public void personalLog(ActionEvent event) throws Exception {
        super.personalLog(event);
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
