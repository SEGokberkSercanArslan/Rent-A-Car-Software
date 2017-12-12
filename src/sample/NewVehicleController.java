package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;

import java.io.IOException;
import java.net.URL;
import java.util.Objects;
import java.util.Optional;
import java.util.ResourceBundle;

public class NewVehicleController extends MainMenuController implements Initializable {


    public ChoiceBox<String> VehicleTypes;
    public TextField vehicleManufacturerField;
    public TextField vehicleModelField;
    public TextField vehicleColourField;
    public TextField licencePlateNumberField;
    public TextField vehicleKilometerField;
    public TextField vehiclePriceField;
    public Button saveVehicleButton;

    //SRC: http://www.wikizero.org/index.php?q=aHR0cHM6Ly9lbi53aWtpcGVkaWEub3JnL3dpa2kvQ2F0ZWdvcnk6Q2FyX2NsYXNzaWZpY2F0aW9ucw
    ObservableList<String> TypesOfVehicle = FXCollections.observableArrayList("Microcar", "Economy Car", "Compact Car",
            "Mid-Size car","Entry-level luxury car","Full-Size Car","Mid-Size Luxury Car","Full-Size Luxury Car","Grand Tourer",
            "Super Car","Convertible","Roadster","MPV","Minivan","Cargo Van","Passenger Van","Mini SUV","Compact SUV","Mid-Size SUV",
            "Full-Size SUV","Mini Pickup Truck","Mid-Size Pickup Truck","Full-Size Pickup Truck","Heavy Duty Pickup Truck");

    @FXML
    public void saveVehicle(){

        try {
            for(int counter=0;counter<Vehicle.info.size();counter++){
                if (Objects.equals(licencePlateNumberField.getText(), Vehicle.info.get(counter).getVehicleLisancePlate())){
                    Alert SamePlateNumberError = new Alert(Alert.AlertType.ERROR);
                    SamePlateNumberError.setTitle("Error");
                    SamePlateNumberError.setHeaderText("There is a another vehicle use to same LicencePlate");
                    SamePlateNumberError.showAndWait();
                    licencePlateNumberField.clear();
                    break;
                }
            }

            Alert DoYouWantToContinue = new Alert(Alert.AlertType.CONFIRMATION);
            DoYouWantToContinue.setTitle("Confirmation");
            DoYouWantToContinue.setHeaderText("Do you want to continue to add this vehicle ?");

            Optional<ButtonType> result = DoYouWantToContinue.showAndWait();
            if (result.get() == ButtonType.OK) {
                new Vehicle(VehicleTypes.getValue(),vehicleModelField.getText(),vehicleColourField.getText(), licencePlateNumberField.getText(),
                        Integer.parseInt(vehicleKilometerField.getText()),Double.parseDouble(vehiclePriceField.getText()),vehicleManufacturerField.getText());
            } else {
                throw new IOException();
            }

        }
        catch (IOException io){
            vehicleModelField.clear();
            vehicleColourField.clear();
            licencePlateNumberField.clear();
            vehicleKilometerField.clear();
            vehiclePriceField.clear();
            vehicleManufacturerField.clear();
        }
        catch (Exception exp){
            Alert ErrorAddVehicle = new Alert(Alert.AlertType.ERROR);
            ErrorAddVehicle.setTitle("Error");
            ErrorAddVehicle.setHeaderText("Cannot continue following operation");
            ErrorAddVehicle.setContentText("You must give following field to numeric not words! \n Vehicle Kilometer , Vehicle Price");
            ErrorAddVehicle.showAndWait();
            vehicleKilometerField.clear();
            vehiclePriceField.clear();
        }
        finally {

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
        VehicleTypes.setItems(TypesOfVehicle);
    }
}
