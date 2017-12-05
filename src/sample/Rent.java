package sample;

import java.io.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Rent {
    private String customerName;
    private String customerSurname;
    private String customerAddress;
    private String customerTelephoneNumber;
    private String customerEmailAdress;
    private Date vehicleRentDate;
    private Date vehicleOffDutyDatePlanned;
    private Date vehicleOffDutyDateReal;
    private boolean vehicleDutyStatus;
    private double rentalFee;
    private double delayFee;
    private double calculatedTotalFee;

    static List<Rent> info = new ArrayList<Rent>();

    Rent(String customerName,String customerSurname,String customerAddress,String customerTelephoneNumber,String customerEmailAdress
    ,Date vehicleRentDate, Date vehicleOffDutyDatePlanned,Date vehicleOffDutyDateReal,boolean vehicleDutyStatus,double rentalFee
    ,double delayFee , double calculatedTotalFee){
        setCustomerName(customerName);
        setCustomerSurname(customerSurname);
        setCustomerAddress(customerAddress);
        setCustomerTelephoneNumber(customerTelephoneNumber);
        setCustomerEmailAdress(customerEmailAdress);
        setVehicleRentDate(vehicleRentDate);
        setVehicleOffDutyDatePlanned(vehicleOffDutyDatePlanned);
        setVehicleOffDutyDateReal(vehicleOffDutyDateReal);
        setVehicleDutyStatus(vehicleDutyStatus);
        setRentalFee(rentalFee);
        setDelayFee(delayFee);
        setCalculatedTotalFee(calculatedTotalFee);
        info.add(this);
    }

    //Set methods of attributes
    public void setCalculatedTotalFee(double calculatedTotalFee) {
        this.calculatedTotalFee = calculatedTotalFee;
    }
    public void setCustomerEmailAdress(String custoerEmailAdress) {
        this.customerEmailAdress = custoerEmailAdress;
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

    public void initializeRentToFile() throws IOException {
        FileOutputStream fos = new FileOutputStream("Rent.data");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        for (Rent rent : info) {
            oos.writeObject(rent);
        }
        fos.close();
    }

    public void initializeRentFromFile() throws IOException, ClassNotFoundException {
        FileInputStream fis = new FileInputStream("Rent.data");
        ObjectInputStream ois = new ObjectInputStream(fis);
        boolean eof = true;
        try {
            while (eof) {
                Rent obj = (Rent) ois.readObject();
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
    public Date getVehicleOffDutyDatePlanned() {
        return vehicleOffDutyDatePlanned;
    }
    public Date getVehicleOffDutyDateReal() {
        return vehicleOffDutyDateReal;
    }
    public Date getVehicleRentDate() {
        return vehicleRentDate;
    }
    public boolean getVehicleDutyStatus(){
        return vehicleDutyStatus;
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
    public String getCustomerEmailAdress() {
        return customerEmailAdress;
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
