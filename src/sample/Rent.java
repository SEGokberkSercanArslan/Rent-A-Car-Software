package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.io.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Rent implements Serializable{
    private LocalDate vehicleRentDate;
    private LocalDate vehicleOffDutyDatePlanned;
    private LocalDate vehicleOffDutyDateReal;
    private static Vehicle  rentVehicle;
    private static Customer rentCustomer;
    private double rentalFee;
    private double delayFee;
    private double calculatedTotalFee;

    public static List<Rent> info = new ArrayList<Rent>();
    public static ObservableList<Rent> rentObservableList = FXCollections.observableArrayList();

    Rent(Vehicle rentVehicle, Customer rentCustomer, LocalDate vehicleRentDate, LocalDate vehicleOffDutyDatePlanned, boolean vehicleDutyStatus, double rentalFee
    , double delayFee){
        setRentVehicle(rentVehicle);
        setRentCustomer(rentCustomer);
        setVehicleRentDate(vehicleRentDate);
        setVehicleOffDutyDatePlanned(vehicleOffDutyDatePlanned);
        setRentalFee(rentalFee);
        setDelayFee(delayFee);
        setCalculatedTotalFee(0);
        info.add(this);
        rentObservableList.add(this);
    }

    //Set methods of attributes

    public static void setRentCustomer(Customer rentCustomer) {
        Rent.rentCustomer = rentCustomer;
    }
    public static void setRentVehicle(Vehicle rentVehicle) {
        Rent.rentVehicle = rentVehicle;
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
    public void setVehicleOffDutyDatePlanned(LocalDate vehicleOffDutyDatePlanned) {
        this.vehicleOffDutyDatePlanned = vehicleOffDutyDatePlanned;
    }
    public void setVehicleRentDate(LocalDate vehicleRentDate) {
        this.vehicleRentDate = vehicleRentDate;
    }
    public void setVehicleOffDutyDateReal(LocalDate vehicleOffDutyDateReal) {
        this.vehicleOffDutyDateReal = vehicleOffDutyDateReal;
    }

    //Get methods of attributes

    public static Customer getRentCustomer() {
        return rentCustomer;
    }
    public static Vehicle getRentVehicle() {
        return rentVehicle;
    }
    public LocalDate getVehicleOffDutyDatePlanned() {
        return vehicleOffDutyDatePlanned;
    }
    public LocalDate getVehicleOffDutyDateReal() {
        return vehicleOffDutyDateReal;
    }
    public LocalDate getVehicleRentDate() {
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


}
