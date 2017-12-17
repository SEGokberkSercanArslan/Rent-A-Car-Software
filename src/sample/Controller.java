package sample;

import javafx.fxml.FXML;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.PasswordField;
import javafx.stage.Stage;
import javafx.stage.Window;

import java.io.IOException;
import java.net.URL;
import java.util.Objects;
import java.util.ResourceBundle;


public class Controller {

    @FXML
    private String userName;
    @FXML
    private String password;
    @FXML
    public TextField UserNameField;
    @FXML
    public PasswordField PasswordField;
    @FXML
    public Button LogInButton;
    @FXML
    public Button ForgotPasswordButton;


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
    public void logInButton(ActionEvent event) throws IOException {
        setUserName(UserNameField.getText());
        setPassword(PasswordField.getText());
        boolean usernameFound = false;
        boolean passwordFound = false;
        for(int counter =0;counter<Personal.info.size();counter++){
            if (Objects.equals(Personal.info.get(counter).getUsername(),getUserName())){
                usernameFound = true;
                if(Objects.equals(Personal.info.get(counter).getPassword(),getPassword())){
                    Personal.initializeCurrentUser(counter);
                    Parent MainMenu = FXMLLoader.load(getClass().getResource("MainMenu.fxml"));
                    Scene MainMenuScene = new Scene(MainMenu);
                    Stage MainMenuStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
                    MainMenuStage.setScene(MainMenuScene);
                    MainMenuStage.show();
                }
                else {
                Alert WrongPassword = new Alert(Alert.AlertType.ERROR);
                WrongPassword.setTitle("Error");
                WrongPassword.setHeaderText("Wrong Password");
                WrongPassword.setContentText("Password you've given us is not match username.");
                WrongPassword.showAndWait();
                }
            }
        }
        if(!usernameFound){
            Alert WrongUsername = new Alert(Alert.AlertType.ERROR);
            WrongUsername.setTitle("Error");
            WrongUsername.setHeaderText("Wrong Username");
            WrongUsername.setContentText("Username you've given us is not match any username on database.");
            WrongUsername.showAndWait();
        }

    }
    @FXML
    public void forgotPasswordButton(ActionEvent event){

    }

    @FXML//Don't need anymore
    public void changeScreenButtonPushed(ActionEvent event) throws Exception {

        Parent tableViewParent = FXMLLoader.load(getClass().getResource("MainMenu.fxml"));
        Scene tableViewScene = new Scene(tableViewParent);
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        window.setScene(tableViewScene);
        window.show();
    }

    @FXML
    public void menuItemAbout(ActionEvent event){
        Alert softwareInfo = new Alert(Alert.AlertType.INFORMATION);
        softwareInfo.setTitle("About Software");
        softwareInfo.setHeaderText("Rent A Car software for more information please contact se-sercan@outlook.com");
        softwareInfo.setContentText("The software created by Gökberk Sercan Arslan");
        softwareInfo.showAndWait();
    }


}
