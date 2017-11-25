package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

import java.util.Objects;

public class NewUserController extends MainMenuController {


    public TextField NameField;
    public TextField SurnameField;
    public TextField TelephoneField;
    public TextField UsernameField;
    public TextField EmailField;
    public PasswordField PasswordField;
    public TextField AddressField;
    public TextField IdNumberField;

    @FXML
    public void saveUser(ActionEvent event){
        Personal newPersonal = new Personal(NameField.getText(),SurnameField.getText(),EmailField.getText(),TelephoneField.getText()
        ,UsernameField.getText(),PasswordField.getText(),AddressField.getText(),IdNumberField.getText());

        for (int counter=0;counter<Personal.info.size();counter++){
            if (Objects.equals(newPersonal.getIdNumber(), Personal.info.get(counter).getIdNumber())){
                Alert IdMatchedDB = new Alert(Alert.AlertType.ERROR);
                IdMatchedDB.setTitle("Error");
                IdMatchedDB.setHeaderText("ID match");
                IdMatchedDB.setContentText("Given ID number matched another person's ID in database Please check ID again.");
                IdMatchedDB.showAndWait();
                Personal.info.remove(Personal.info.size()-1);
                break;
            }
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