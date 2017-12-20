package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.Objects;
import java.util.Optional;
import java.util.ResourceBundle;

public class RentVehicleController extends MainMenuController implements Initializable  {


    private static Customer chosenCustomer;

    public TextField customerNameField;
    public TextField customerSurnameField;
    public TextField customerAddressField;
    public TextField customerTelephoneField;
    public TextField customerDriverLicenceNumberField;
    public TextField customerIdentificationField;




    @FXML
    public void nextVehicleButton(ActionEvent event) throws IOException {
        boolean customerRentACar = false;

        if (Objects.equals(customerNameField.getText(), "")){
            Alert customerNameWarn = new Alert(Alert.AlertType.WARNING);
            customerNameWarn.setTitle("Warning");
            customerNameWarn.setHeaderText("Customer Name Cannot be Empty");
            customerNameWarn.showAndWait();
        }
        else if (Objects.equals(customerSurnameField.getText(), "")){
            Alert customerSurnameWarn = new Alert(Alert.AlertType.WARNING);
            customerSurnameWarn.setTitle("Warning");
            customerSurnameWarn.setHeaderText("Customer Surname Cannot be Empty");
            customerSurnameWarn.showAndWait();
        }
        else if (Objects.equals(customerAddressField.getText(), "")){
            Alert customerAddressWarn = new Alert(Alert.AlertType.WARNING);
            customerAddressWarn.setTitle("Warning");
            customerAddressWarn.setHeaderText("Customer Address Cannot be Empty");
            customerAddressWarn.showAndWait();
        }
        else if (Objects.equals(customerTelephoneField.getText(), "")){
            Alert customerTelephoneWarn = new Alert(Alert.AlertType.WARNING);
            customerTelephoneWarn.setTitle("Warning");
            customerTelephoneWarn.setHeaderText("Customer Telephone Number Cannot be Empty");
            customerTelephoneWarn.showAndWait();
        }
        else if (Objects.equals(customerDriverLicenceNumberField.getText(), "")){
            Alert customerDriverLicenceNumberWarn = new Alert(Alert.AlertType.WARNING);
            customerDriverLicenceNumberWarn.setTitle("Warning");
            customerDriverLicenceNumberWarn.setHeaderText("Customer Driver Licence Number Cannot be Empty");
            customerDriverLicenceNumberWarn.showAndWait();
        }
        else if (Objects.equals(customerIdentificationField.getText(), "")){
            Alert customerIdentificationWarn = new Alert(Alert.AlertType.WARNING);
            customerIdentificationWarn.setTitle("Warning");
            customerIdentificationWarn.setHeaderText("Customer Identification Number Cannot be Empty");
            customerIdentificationWarn.showAndWait();
        }
        else {
            for(int counter=0;counter<Customer.info.size();counter++){
                if (Objects.equals(customerIdentificationField.getText(), Rent.info.get(counter).getIdNumber())){
                    Alert customerIdentificationMatch = new Alert(Alert.AlertType.ERROR);
                    customerIdentificationMatch.setTitle("Error");
                    customerIdentificationMatch.setHeaderText("Customer already rent a car");
                    customerIdentificationMatch.showAndWait();
                    customerRentACar = true;
                    break;
                }
            }
            if(!customerRentACar){
                Alert DoYouWantToContinue = new Alert(Alert.AlertType.CONFIRMATION);
                DoYouWantToContinue.setTitle("Confirmation");
                DoYouWantToContinue.setHeaderText("Are all the information provided correct?");

                Optional<ButtonType> result = DoYouWantToContinue.showAndWait();
                if (result.get() == ButtonType.OK) {

                    setChosenCustomer(new Customer(customerNameField.getText(),customerSurnameField.getText(),customerAddressField.getText(),customerTelephoneField.getText(),
                            customerIdentificationField.getText(),customerDriverLicenceNumberField.getText()));

                    Parent RentVehicleScreen2 = FXMLLoader.load(getClass().getResource("RentVehicleScreen2.fxml"));
                    Scene RentVehicleScreen2Scene = new Scene(RentVehicleScreen2);
                    Stage RentVehicleScreen2Stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
                    RentVehicleScreen2Stage.setScene(RentVehicleScreen2Scene);
                    RentVehicleScreen2Stage.show();
                    //initialize();
                } else {
                    DoYouWantToContinue.close();
                }


            }
        }

    }


    public static void setChosenCustomer(Customer chosenCustomer) {
        RentVehicleController.chosenCustomer = chosenCustomer;
    }
    public static Customer getChosenCustomer() {
        return chosenCustomer;
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

    }
}
