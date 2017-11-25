package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;



public class addUserController {

    @FXML
    private TextField personNameField;
    @FXML
    private TextField personSurnameField;
    @FXML
    private TextField personEMailField;
    @FXML
    private TextField personAddressField;
    @FXML
    private TextField telephoneNumberField;
    @FXML
    private TextField usernameField;
    @FXML
    private PasswordField userPasswordField;
    @FXML
    private ChoiceBox choiceBoxField;
    @FXML
    private Button saveUserField;


    @FXML
    public void initNewUser(ActionEvent event){
        Personal person = new Personal(personNameField.getText(),personSurnameField.getText(),personEMailField.getText()
                ,telephoneNumberField.getText(),usernameField.getText(),userPasswordField.getText(),personAddressField.getText());

    }


}
