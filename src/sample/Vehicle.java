package sample;

import javax.print.DocFlavor;
import java.util.ArrayList;
import java.util.List;

public class Vehicle {
    private String vehicleType;
    private String vehicleModel;
    private String vehicleColour;
    private String vehicleLisancePlate;
    private String vehicleKilometer;    //it can be an integer ?
    private String vehiclePrice;        //it can be an integer ?
    private boolean vehicleStatus;       //Turn boolen
    private String vehicleGains;        //it can be an integer ?

    static List<Vehicle> info = new ArrayList<>();

    Vehicle(String vehicleType, String vehicleModel, String vehicleColour, String vehicleLisancePlate, String vehicleKilometer
    , String vehiclePrice, boolean vehicleStatus,String vehicleGains){
        setVehicleType(vehicleType);
        setVehicleModel(vehicleModel);
        setVehicleColour(vehicleColour);
        setVehicleLisancePlate(vehicleLisancePlate);
        setVehicleKilometer(vehicleKilometer);
        setVehiclePrice(vehiclePrice);
        setVehicleStatus(vehicleStatus);
        setVehicleGains(vehicleGains);
        info.add(this);
    }
    //Set methods of Attributes
    public void setVehicleColour(String vehicleColour) {
        this.vehicleColour = vehicleColour;
    }
    public void setVehicleGains(String vehicleGains) {
        this.vehicleGains = vehicleGains;
    }
    public void setVehicleKilometer(String vehicleKilometer) {
        this.vehicleKilometer = vehicleKilometer;
    }
    public void setVehicleLisancePlate(String vehicleLisancePlate) {
        this.vehicleLisancePlate = vehicleLisancePlate;
    }
    public void setVehicleModel(String vehicleModel) {
        this.vehicleModel = vehicleModel;
    }
    public void setVehiclePrice(String vehiclePrice) {
        this.vehiclePrice = vehiclePrice;
    }
    public void setVehicleStatus(boolean vehicleStatus) {
        this.vehicleStatus = vehicleStatus;
    }
    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    //Get methods of attributes
    public String getVehicleColour() {
        return vehicleColour;
    }
    public String getVehicleGains() {
        return vehicleGains;
    }
    public String getVehicleKilometer() {
        return vehicleKilometer;
    }
    public String getVehicleLisancePlate() {
        return vehicleLisancePlate;
    }
    public String getVehicleModel() {
        return vehicleModel;
    }
    public String getVehiclePrice() {
        return vehiclePrice;
    }
    public boolean getVehicleStatus() {
        return vehicleStatus;
    }
    public String getVehicleType() {
        return vehicleType;
    }
}
