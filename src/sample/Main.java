package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("LogInMenu.fxml"));
        primaryStage.setTitle("Rent A Car");
        primaryStage.setScene(new Scene(root, 1024, 640));
        primaryStage.show();
    }

    

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Personal.initializePersonalsFromFile();
        launch(args);
    }
}
