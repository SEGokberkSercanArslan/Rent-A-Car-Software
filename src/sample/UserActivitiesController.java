package sample;

import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class UserActivitiesController extends MainMenuController implements Initializable {
    public TableColumn<Personal,String> userNameColumn;
    public TableColumn<Personal,String> userSurnameColumn;
    public TableColumn<Personal,String> usernameColumn;
    public TableColumn<Personal,String> userPasswordColumn;
    public TableColumn<Personal,String> userIDNumberColumn;
    public TableColumn<Personal,String> userAddressColumn;
    public TableColumn<Personal,String> userTelephoneColumn;
    public TableColumn<Personal,String> userEMailColumn;
    public TableColumn<Personal,String> userPrivilegeColumn;
    public TableView<Personal> userActivitiesTableView;

    @FXML
    public void deleteUserFromDatabase(ActionEvent event) throws IOException {
        ObservableList<Personal> selectedPersonalOnTable;
        selectedPersonalOnTable = userActivitiesTableView.getSelectionModel().getSelectedItems();
        Personal deleteThisPersonal = userActivitiesTableView.getSelectionModel().getSelectedItem();
        Personal.personalObservableList.removeAll(selectedPersonalOnTable);
        Personal.info.remove(deleteThisPersonal);
        SerializeObjects.clearPersonalsData();
        SerializeObjects.initialziePersonalObjectsToFile();

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
    public final void initialize(URL location, ResourceBundle resources) {
        userNameColumn.setCellValueFactory(new PropertyValueFactory<Personal,String>("name"));
        userSurnameColumn.setCellValueFactory(new PropertyValueFactory<Personal,String>("surname"));
        usernameColumn.setCellValueFactory(new PropertyValueFactory<Personal,String>("username"));
        userPasswordColumn.setCellValueFactory(new PropertyValueFactory<Personal,String>("password"));
        userIDNumberColumn.setCellValueFactory(new PropertyValueFactory<Personal,String>("idNumber"));
        userAddressColumn.setCellValueFactory(new PropertyValueFactory<Personal,String>("address"));
        userTelephoneColumn.setCellValueFactory(new PropertyValueFactory<Personal,String>("telephoneNumber"));
        userEMailColumn.setCellValueFactory(new PropertyValueFactory<Personal,String>("emailAddress"));
        userPrivilegeColumn.setCellValueFactory(new PropertyValueFactory<Personal,String>("privilege"));
        userActivitiesTableView.setItems(Personal.personalObservableList);
    }
}
