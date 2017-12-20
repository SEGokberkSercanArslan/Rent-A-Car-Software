package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;

import java.io.IOException;
import java.io.Serializable;
import java.util.Optional;

public class RentVehicleController3 extends MainMenuController implements Serializable {


    public DatePicker dayPickerRentFrom;
    public DatePicker dayPickerRentTo;
    public TextField rentalFeeField;
    public TextField delayFeeField;

    @FXML
    public void rentThisVehicle(ActionEvent event) {
        try {
            if (dayPickerRentFrom.getValue().toEpochDay()>dayPickerRentTo.getValue().toEpochDay()){
                Alert DayCompareError = new Alert(Alert.AlertType.ERROR);
                DayCompareError.setTitle("Error");
                DayCompareError.setHeaderText("Car rental day can not be in the future due to vehicle rent-off day.");
                DayCompareError.showAndWait();
            }
            else {
                Alert DoYouWantToContinue = new Alert(Alert.AlertType.CONFIRMATION);
                DoYouWantToContinue.setTitle("Confirmation");
                DoYouWantToContinue.setHeaderText("Do you want to continue rent ?");

                Optional<ButtonType> result = DoYouWantToContinue.showAndWait();
                if (result.get() == ButtonType.OK) {
                    new Rent(RentVehicleController2.getChosenVehicle(), RentVehicleController.getChosenCustomer(),
                            dayPickerRentFrom.getValue().toEpochDay(), dayPickerRentTo.getValue().toEpochDay(), true
                            , Double.parseDouble(rentalFeeField.getText()), Double.parseDouble(delayFeeField.getText()));
                    Alert SuccessfullyRented = new Alert(Alert.AlertType.INFORMATION);
                    SuccessfullyRented.setTitle("Information");
                    SuccessfullyRented.setHeaderText("Vehicle Successfully Rented All Records Saved.");
                    SuccessfullyRented.showAndWait();
                    rentalFeeField.clear();
                    delayFeeField.clear();
                } else {
                    DoYouWantToContinue.close();
                }
            }
        }
        catch (Exception ex){
            ex.printStackTrace();
            Alert WrongTypeOfInput = new Alert(Alert.AlertType.ERROR);
            WrongTypeOfInput.setTitle("Error");
            WrongTypeOfInput.setHeaderText("You must give numbers Rental and Delay Fee box.");
            WrongTypeOfInput.showAndWait();
            rentalFeeField.clear();
            delayFeeField.clear();
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
}
