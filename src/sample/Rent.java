package sample;

import java.util.Date;

public class Rent {
    private String customerName;
    private String customerSurname;
    private String customerAddress;
    private String customerTelephoneNumber;
    private String custoerEmailAdress;
    private Date vehicleRentDate;
    private Date vehicleOffDutyDatePlanned;
    private Date vehicleOffDutyDateReal;
    private boolean vehicleDutyStatus;
    private double rentalFee;
    private double delayFee;
    private double calculatedTotalFee;

    //Set methods of attributes
    public void setCalculatedTotalFee(double calculatedTotalFee) {
        this.calculatedTotalFee = calculatedTotalFee;
    }
    public void setCustoerEmailAdress(String custoerEmailAdress) {
        this.custoerEmailAdress = custoerEmailAdress;
    }
    public void setCustomerAddress(String customerAddress) {
        this.customerAddress = customerAddress;
    }
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }
    public void setCustomerSurname(String customerSurname) {
        this.customerSurname = customerSurname;
    }
    public void setCustomerTelephoneNumber(String customerTelephoneNumber) {
        this.customerTelephoneNumber = customerTelephoneNumber;
    }
    public void setDelayFee(double delayFee) {
        this.delayFee = delayFee;
    }
    public void setRentalFee(double rentalFee) {
        this.rentalFee = rentalFee;
    }
    public void setVehicleDutyStatus(boolean vehicleDutyStatus) {
        this.vehicleDutyStatus = vehicleDutyStatus;
    }
    public void setVehicleOffDutyDatePlanned(Date vehicleOffDutyDatePlanned) {
        this.vehicleOffDutyDatePlanned = vehicleOffDutyDatePlanned;
    }
    public void setVehicleRentDate(Date vehicleRentDate) {
        this.vehicleRentDate = vehicleRentDate;
    }
    public void setVehicleOffDutyDateReal(Date vehicleOffDutyDateReal) {
        this.vehicleOffDutyDateReal = vehicleOffDutyDateReal;
    }

    //Get methods of attributes
    public Date getVehicleOffDutyDatePlanned() {
        return vehicleOffDutyDatePlanned;
    }
    public Date getVehicleOffDutyDateReal() {
        return vehicleOffDutyDateReal;
    }
    public Date getVehicleRentDate() {
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
    public String getCustoerEmailAdress() {
        return custoerEmailAdress;
    }
    public String getCustomerAddress() {
        return customerAddress;
    }
    public String getCustomerName() {
        return customerName;
    }
    public String getCustomerSurname() {
        return customerSurname;
    }
    public String getCustomerTelephoneNumber() {
        return customerTelephoneNumber;
    }

}
