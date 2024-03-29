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
import java.util.ResourceBundle;

public class NewUserController extends MainMenuController implements Initializable {


    public TextField NameField;
    public TextField SurnameField;
    public TextField TelephoneField;
    public TextField UsernameField;
    public TextField EmailField;
    public PasswordField PasswordField;
    public TextField AddressField;
    public TextField IdNumberField;
    public boolean isEmployee=false;
    public ChoiceBox<String> PrivilegeChoiceBox;
    ObservableList <String> items = FXCollections.observableArrayList("Admin","Employee");

    @FXML
    public void saveUser(ActionEvent event) throws IOException {

            if ((Objects.equals(NameField.getText(), "") || Objects.equals(SurnameField.getText(), "") || Objects.equals(TelephoneField.getText(), "") ||
                    Objects.equals(UsernameField.getText(), "") || Objects.equals(EmailField.getText(), "") || Objects.equals(PasswordField.getText(), "") ||
                    Objects.equals(AddressField.getText(), "") || Objects.equals(IdNumberField.getText(), ""))){
                Alert EmptyField = new Alert(Alert.AlertType.ERROR);
                EmptyField.setTitle("Error");
                EmptyField.setHeaderText("You must fill the boxes");
                EmptyField.showAndWait();
                isEmployee = true;
            }
            else {
                for (int counter = 0; counter < Personal.info.size(); counter++) {
                    if (!Objects.equals(Personal.currentUser.getPrivilege(), "Admin")) {
                        Alert PrivilegeError = new Alert(Alert.AlertType.ERROR);
                        PrivilegeError.setTitle("Error");
                        PrivilegeError.setHeaderText("Permission Error");
                        PrivilegeError.setContentText("You don't have permission for add personal.");
                        PrivilegeError.showAndWait();
                        isEmployee = true;
                        break;
                    } else if (Objects.equals(UsernameField.getText(), Personal.info.get(counter).getUsername())) {
                        Alert UserNameMatched = new Alert(Alert.AlertType.ERROR);
                        UserNameMatched.setTitle("Error");
                        UserNameMatched.setHeaderText("User Name Matched ");
                        UserNameMatched.setContentText("Look like another employee use this username please found another one.");
                        UserNameMatched.showAndWait();
                        isEmployee = true;
                        break;
                    } else if (Objects.equals(IdNumberField.getText(), Personal.info.get(counter).getIdNumber())) {
                        Alert IdMatchedDB = new Alert(Alert.AlertType.ERROR);
                        IdMatchedDB.setTitle("Error");
                        IdMatchedDB.setHeaderText("ID Matched");
                        IdMatchedDB.setContentText("Given ID number matched another person's ID in database Please check ID again.");
                        IdMatchedDB.showAndWait();
                        isEmployee = true;
                        break;
                    }

                    else {
                        isEmployee = false;
                    }

                }
            }

        if (!isEmployee){
            Personal newPersonal = new Personal(NameField.getText(),SurnameField.getText(),EmailField.getText(),TelephoneField.getText()
                    ,UsernameField.getText(),PasswordField.getText(),AddressField.getText(),IdNumberField.getText(), PrivilegeChoiceBox.getValue());
            NameField.clear();
            SurnameField.clear();
            TelephoneField.clear();
            UsernameField.clear();
            EmailField.clear();
            PasswordField.clear();
            AddressField.clear();
            IdNumberField.clear();
            SerializeObjects.clearPersonalsData();
            SerializeObjects.initializePersonalObjectsToFile();
            Alert SuccessfullyAdded = new Alert(Alert.AlertType.INFORMATION);
            SuccessfullyAdded.setTitle("Info");
            SuccessfullyAdded.setHeaderText("Personal Successfully Added");
            SuccessfullyAdded.showAndWait();
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
        PrivilegeChoiceBox.setItems(items);
    }
}
