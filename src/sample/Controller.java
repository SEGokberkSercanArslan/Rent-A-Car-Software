package sample;

import javafx.fxml.FXML;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.PasswordField;
import javafx.stage.Stage;
import javafx.stage.Window;


public class Controller {

    @FXML
    private String userName;
    @FXML
    private String password;
    @FXML
    private TextField UserNameField;
    @FXML
    private PasswordField PasswordField;
    @FXML
    private Button LogInButton;
    @FXML
    private Button ForgotPasswordButton;


    @FXML
    public void setUserName(String username){
        this.userName = username ;
    }
    @FXML
    public void setPassword(String password) {
        this.password = password;
    }
    @FXML
    public String getPassword() {
        return password;
    }
    @FXML
    public String getUserName() {
        return userName;
    }

    @FXML
    public void logInButton(ActionEvent event){
        System.out.println(UserNameField.getText());


    }
    @FXML
    public void forgotPasswordButton(ActionEvent event){

    }

    /*Prototype of changing between scenes*/
    public void changeScreenButtonPushed(ActionEvent event) throws Exception {

        Parent tableViewParent = FXMLLoader.load(getClass().getResource("MainMenu.fxml"));
        Scene tableViewScene = new Scene(tableViewParent);
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        window.setScene(tableViewScene);
        window.show();
    }


}
