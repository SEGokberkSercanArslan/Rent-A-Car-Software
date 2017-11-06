package sample;

public class Vehicle {
    private String vehicleType;
    private String vehicleModel;
    private String vehicleColour;
    private String vehicleLisancePlate;
    private String vehicleKilometer;
    private String vehiclePrice;
    private String vehicleStatus;
    private String vehicleGains;

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
    public void setVehicleStatus(String vehicleStatus) {
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
    public String getVehicleStatus() {
        return vehicleStatus;
    }
    public String getVehicleType() {
        return vehicleType;
    }
}
