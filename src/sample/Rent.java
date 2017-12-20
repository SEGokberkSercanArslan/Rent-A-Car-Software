package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.io.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Rent implements Serializable{
    //Rent info
    private long vehicleRentDate;
    private long vehicleOffDutyDatePlanned;
    private LocalDate vehicleOffDutyDateReal;
    private static Vehicle  rentVehicle;
    private static Customer rentCustomer;
    private static Personal rentPersonal;
    private double rentalFee;
    private double delayFee;
    private double calculatedTotalFee;
    private boolean isItLog;
    //Vehicle info
    private String vehicleType;
    private String vehicleModel;
    private String vehicleColour;
    private String vehiclePlateNumber;
    private String vehicleManufacturer;
    private int vehicleKilometer;
    private double vehiclePrice;
    private String vehicleStatus;
    private double vehicleGains;
    //Customer info
    private String name;
    private String surname;
    private String address;
    private String telephoneNumber;
    private String driverLicenceNumber;
    private String idNumber;
    //Personal Info
    private String personalName;
    private String personalSurname;
    private String personalID;
    private String personalPrivilege;

    public static List<Rent> info = new ArrayList<Rent>();
    public static ObservableList<Rent> rentObservableList = FXCollections.observableArrayList();
    public static List<Rent> rentLog = new ArrayList<Rent>();
    public static ObservableList<Rent> rentLogObservableList = FXCollections.observableArrayList();


    Rent(Vehicle rentVehicle, Customer rentCustomer,Personal rentPersonal, long vehicleRentDate, long vehicleOffDutyDatePlanned, boolean vehicleDutyStatus, double rentalFee
    , double delayFee,boolean isItLog){
        setRentVehicle(rentVehicle);
        setRentCustomer(rentCustomer);
        setVehicleRentDate(vehicleRentDate);
        setVehicleOffDutyDatePlanned(vehicleOffDutyDatePlanned);
        setRentalFee(rentalFee);
        setDelayFee(delayFee);
        setCalculatedTotalFee(0);
        setRentPersonal(rentPersonal);
        setItLog(isItLog);
        // Vehicle Objects
        setVehicleType(rentVehicle.getVehicleType());
        setVehicleModel(rentVehicle.getVehicleModel());
        setVehicleColour(rentVehicle.getVehicleColour());
        setVehiclePlateNumber(rentVehicle.getVehiclePlateNumber());
        setVehicleManufacturer(rentVehicle.getVehicleManufacturer());
        setVehicleKilometer(rentVehicle.getVehicleKilometer());
        setVehiclePrice(rentVehicle.getVehiclePrice());
        setVehicleStatus("IN Service");
        setVehicleGains(rentVehicle.getVehicleGains());
        // Customer Objects
        setName(rentCustomer.getName());
        setSurname(rentCustomer.getSurname());
        setAddress(rentCustomer.getAddress());
        setTelephoneNumber(rentCustomer.getTelephoneNumber());
        setDriverLicenceNumber(rentCustomer.getDriverLicenceNumber());
        setIdNumber(rentCustomer.getIdNumber());
        //Personal Objects
        setPersonalName(rentPersonal.getName());
        setPersonalSurname(rentPersonal.getSurname());
        setPersonalID(rentPersonal.getIdNumber());
        setPersonalPrivilege(rentPersonal.getPrivilege());
        info.add(this);
        rentObservableList.add(this);
        initializedVehicleInWork();
    }

    public static void initializedVehicleInWork(){
        for(int counter=0;counter<Vehicle.info.size();counter++){
            if(Objects.equals(rentVehicle.getVehiclePlateNumber(), Vehicle.info.get(counter).getVehiclePlateNumber())){
                Vehicle.info.get(counter).setVehicleStatus("IN Service");
            }
        }
        for (int counter=0;counter<Vehicle.vehicleObservableList.size();counter++){
            if(Objects.equals(rentVehicle.getVehiclePlateNumber(), Vehicle.vehicleObservableList.get(counter).getVehiclePlateNumber())){
                Vehicle.vehicleObservableList.get(counter).setVehicleStatus("IN Service");
            }
        }
    }

    public static void initializeVehicleOutWork(){
        for(int counter=0;counter<Vehicle.info.size();counter++){
            if (Objects.equals(rentVehicle.getVehiclePlateNumber(), Vehicle.info.get(counter).getVehiclePlateNumber())){
                Vehicle.info.get(counter).setVehicleStatus("OUT Service");
            }
        }
        for (int counter=0;counter<Vehicle.vehicleObservableList.size();counter++){
            if(Objects.equals(rentVehicle.getVehiclePlateNumber(), Vehicle.vehicleObservableList.get(counter).getVehiclePlateNumber())){
                Vehicle.vehicleObservableList.get(counter).setVehicleStatus("OUT Service");
            }
        }
    }


    /*"Out Class set and Get objects*/
    //Set Objects methods
    public static void setRentVehicle(Vehicle rentVehicle) {
        Rent.rentVehicle = rentVehicle;
    }
    public static void setRentCustomer(Customer rentCustomer) {
        Rent.rentCustomer = rentCustomer;
    }



    public void setName(String name) {
        this.name = name;
    }
    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public void setDriverLicenceNumber(String driverLicenceNumber) {
        this.driverLicenceNumber = driverLicenceNumber;
    }
    public static void setInfo(List<Rent> info) {
        Rent.info = info;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }
    public void setTelephoneNumber(String telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
    }
    public void setVehicleColour(String vehicleColour) {
        this.vehicleColour = vehicleColour;
    }
    public void setVehicleGains(double vehicleGains) {
        this.vehicleGains = vehicleGains;
    }
    public void setVehicleKilometer(int vehicleKilometer) {
        this.vehicleKilometer = vehicleKilometer;
    }
    public void setVehicleManufacturer(String vehicleManufacturer) {
        this.vehicleManufacturer = vehicleManufacturer;
    }
    public void setVehicleModel(String vehicleModel) {
        this.vehicleModel = vehicleModel;
    }
    public void setVehiclePlateNumber(String vehiclePlateNumber) {
        this.vehiclePlateNumber = vehiclePlateNumber;
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

    //Get Object Methods

    public static Vehicle getRentVehicle() {
        return rentVehicle;
    }
    public static Customer getRentCustomer() {
        return rentCustomer;
    }
    public String getIdNumber() {
        return idNumber;
    }
    public double getVehicleGains() {
        return vehicleGains;
    }
    public double getVehiclePrice() {
        return vehiclePrice;
    }
    public int getVehicleKilometer() {
        return vehicleKilometer;
    }
    public String getAddress() {
        return address;
    }
    public String getDriverLicenceNumber() {
        return driverLicenceNumber;
    }
    public String getName() {
        return name;
    }
    public String getTelephoneNumber() {
        return telephoneNumber;
    }
    public String getSurname() {
        return surname;
    }
    public String getVehicleColour() {
        return vehicleColour;
    }
    public String getVehicleManufacturer() {
        return vehicleManufacturer;
    }
    public String getVehicleModel() {
        return vehicleModel;
    }
    public String getVehiclePlateNumber() {
        return vehiclePlateNumber;
    }
    public String getVehicleStatus() {
        return vehicleStatus;
    }
    public String getVehicleType() {
        return vehicleType;
    }

    //Set methods of attributes
    public static void setRentPersonal(Personal rentPersonal) {
        Rent.rentPersonal = rentPersonal;
    }
    public void setCalculatedTotalFee(double calculatedTotalFee) {
        this.calculatedTotalFee = calculatedTotalFee;
    }
    public void setDelayFee(double delayFee) {
        this.delayFee = delayFee;
    }
    public void setRentalFee(double rentalFee) {
        this.rentalFee = rentalFee;
    }
    public void setVehicleOffDutyDatePlanned(long vehicleOffDutyDatePlanned) {
        this.vehicleOffDutyDatePlanned = vehicleOffDutyDatePlanned;
    }
    public void setVehicleRentDate(long vehicleRentDate) {
        this.vehicleRentDate = vehicleRentDate;
    }
    public void setVehicleOffDutyDateReal(LocalDate vehicleOffDutyDateReal) {
        this.vehicleOffDutyDateReal = vehicleOffDutyDateReal;
    }

    //Get methods of attributes

    public static Personal getRentPersonal() {
        return rentPersonal;
    }
    public long getVehicleOffDutyDatePlanned() {
        return vehicleOffDutyDatePlanned;
    }
    public LocalDate getVehicleOffDutyDateReal() {
        return vehicleOffDutyDateReal;
    }
    public long getVehicleRentDate() {
        return vehicleRentDate;
    }
    public double getCalculatedTotalFee() {
        return calculatedTotalFee;
    }
    public double getDelayFee() {
        return delayFee;
    }
    public double getRentalFee() {
        return rentalFee;
    }

    //Personal getter and setter methods
    public String getPersonalPrivilege() {
        return personalPrivilege;
    }
    public void setPersonalPrivilege(String personalPrivilege) {
        this.personalPrivilege = personalPrivilege;
    }
    public String getPersonalID() {
        return personalID;
    }
    public void setPersonalID(String personalID) {
        this.personalID = personalID;
    }
    public String getPersonalSurname() {
        return personalSurname;
    }
    public void setPersonalSurname(String personalSurname) {
        this.personalSurname = personalSurname;
    }
    public String getPersonalName() {
        return personalName;
    }
    public void setPersonalName(String personalName) {
        this.personalName = personalName;
    }

    public boolean isItLog() {
        return isItLog;
    }

    public void setItLog(boolean itLog) {
        isItLog = itLog;
    }
}
