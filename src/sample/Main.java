package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("LogInMenu.fxml"));
        primaryStage.setTitle("Rent A Car");
        primaryStage.setScene(new Scene(root, 1024, 640));
        primaryStage.setResizable(false);
        primaryStage.show();

    }

    public static void main(String[] args) throws IOException {
        //SerializeObjects.initializePersonalObjectToFile(new Personal("Gökberk Sercan","Arslan","example@outlook.com","5554441010","admin","admin","None","SE360","Admin"));
        SerializeObjects.initializePersonalObjectsFromFile();

        FileInputStream fileInputStream = new FileInputStream("Vehicle.data");
        Scanner scanner = new Scanner(fileInputStream);
        if (scanner.hasNext()) {
            fileInputStream.close();
            SerializeObjects.initializeVehicleObjectsFromFile();
        }
        FileInputStream fileInputStream2 = new FileInputStream("Vehicle.data");
        Scanner scanner2 = new Scanner(fileInputStream);
        if(!scanner2.hasNext()){
            fileInputStream2.close();
            SerializeObjects.initializeRentObjectsFromFile();
        }
        FileInputStream fileInputStream3 = new FileInputStream("Vehicle.data");
        Scanner scanner3 = new Scanner(fileInputStream);
        if(!scanner3.hasNext()){
            fileInputStream3.close();
            SerializeObjects.initializeRentLogObjectsFromFile();
        }
        launch(args);
    }
}
