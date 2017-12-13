package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Vehicle {
    private String vehicleType;
    private String vehicleModel;
    private String vehicleColour;
    private String vehiclePlateNumber;
    private String vehicleManufacturer;
    private int vehicleKilometer;    //it can be an integer ?
    private double vehiclePrice;        //it can be an integer ?
    private String vehicleStatus;       //Turn boolen
    private double vehicleGains;        //it can be an integer ?
    public static List<Vehicle> info = new ArrayList<>();
    public static ObservableList <Vehicle> vehicleObservableList = FXCollections.observableArrayList();

    Vehicle(String vehicleType, String vehicleModel, String vehicleColour, String vehicleLisancePlate, int vehicleKilometer
    , double vehiclePrice,String vehicleManufacturer){
        setVehicleType(vehicleType);
        setVehicleModel(vehicleModel);
        setVehicleColour(vehicleColour);
        setVehiclePlateNumber(vehicleLisancePlate);
        setVehicleKilometer(vehicleKilometer);
        setVehiclePrice(vehiclePrice);
        setVehicleManufacturer(vehicleManufacturer);
        setVehicleStatus("OUT Service");
        setVehicleGains(0);
        info.add(this);
        vehicleObservableList.add(this);
    }

    //Set methods of Attributes
    public void setVehicleColour(String vehicleColour) {
        this.vehicleColour = vehicleColour;
    }
    public void setVehicleGains(double vehicleGains) {
        this.vehicleGains = vehicleGains;
    }
    public void setVehicleKilometer(int vehicleKilometer) {
        this.vehicleKilometer = vehicleKilometer;
    }
    public void setVehiclePlateNumber(String vehiclePlateNumber) {
        this.vehiclePlateNumber = vehiclePlateNumber;
    }
    public void setVehicleModel(String vehicleModel) {
        this.vehicleModel = vehicleModel;
    }
    public void setVehiclePrice(double vehiclePrice) {
        this.vehiclePrice = vehiclePrice;
    }
    public void setVehicleStatus(String vehicleStatus) {
        this.vehicleStatus = vehicleStatus;
    }
    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }
    public void setVehicleManufacturer(String vehicleManufacturer) {
        this.vehicleManufacturer = vehicleManufacturer;
    }

    public void initializeVehicleToFile() throws IOException {
        FileOutputStream fos = new FileOutputStream("Vehicle.data");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        for (Vehicle vehicle : info) {
            oos.writeObject(vehicle);
        }
        fos.close();
    }
    public void initializeVehicleFromFile() throws IOException, ClassNotFoundException {
        FileInputStream fis = new FileInputStream("Vehicle.data");
        ObjectInputStream ois = new ObjectInputStream(fis);
        boolean eof = true;
        try {
            while (eof) {
                Vehicle obj = (Vehicle) ois.readObject();
                if (obj != null) {
                    info.add(obj);
                } else {
                    eof = false;
                }
            }
        } catch (EOFException eofex) {
            System.out.println("End of file Exception");
        } finally {

        }
    }

    //Get methods of attributes
    public String getVehicleColour() {
        return vehicleColour;
    }
    public double getVehicleGains() {
        return vehicleGains;
    }
    public int getVehicleKilometer() {
        return vehicleKilometer;
    }
    public String getVehiclePlateNumber() {
        return vehiclePlateNumber;
    }
    public String getVehicleModel() {
        return vehicleModel;
    }
    public double getVehiclePrice() {
        return vehiclePrice;
    }
    public String getVehicleStatus() {
        return vehicleStatus;
    }
    public String getVehicleType() {
        return vehicleType;
    }
    public String getVehicleManufacturer() {
        return vehicleManufacturer;
    }


}
