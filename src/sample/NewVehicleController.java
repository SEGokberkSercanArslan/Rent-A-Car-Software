package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.control.ChoiceBox;

import java.net.URL;
import java.util.ResourceBundle;

public class NewVehicleController extends MainMenuController implements Initializable {


    public ChoiceBox<String> VehicleTypes;
    //SRC: http://www.wikizero.org/index.php?q=aHR0cHM6Ly9lbi53aWtpcGVkaWEub3JnL3dpa2kvQ2F0ZWdvcnk6Q2FyX2NsYXNzaWZpY2F0aW9ucw
    ObservableList<String> TypesOfVehicle = FXCollections.observableArrayList("Microcar", "Economy Car", "Compact Car",
            "Mid-Size car","Entry-level luxury car","Full-Size Car","Mid-Size Luxury Car","Full-Size Luxury Car","Grand Tourer",
            "Super Car","Convertible","Roadster","MPV","Minivan","Cargo Van","Passenger Van","Mini SUV","Compact SUV","Mid-Size SUV",
            "Full-Size SUV","Mini Pickup Truck","Mid-Size Pickup Truck","Full-Size Pickup Truck","Heavy Duty Pickup Truck");

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
