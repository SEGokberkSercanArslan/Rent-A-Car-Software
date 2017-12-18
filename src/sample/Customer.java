package sample;


import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.util.ArrayList;
import java.util.Comparator;

public class Customer implements Comparable<Customer> {
    private String name;
    private String surname;
    private String address;
    private String telephoneNumber;
    private String driverLicenceNumber;
    private String idNumber;

    Customer(String name , String surname, String address , String telephoneNumber , String idNumber , String driverLisanceNumber){
        setName(name);
        setSurname(surname);
        setAddress(address);
        setTelephoneNumber(telephoneNumber);
        setIdNumber(idNumber);
        setDriverLicenceNumber(driverLisanceNumber);
        info.add(this);
        customerObservableList.add(this);
    }

    public static ArrayList<Customer> info = new ArrayList<Customer>();
    public static ObservableList<Customer> customerObservableList = FXCollections.observableArrayList();

    public void setName(String name) {
        this.name = name;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public void setTelephoneNumber(String telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
    }
    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }
    public void setDriverLicenceNumber(String driverLicenceNumber) {
        this.driverLicenceNumber = driverLicenceNumber;
    }

    public String getName() {
        return name;
    }
    public String getSurname() {
        return surname;
    }
    public String getAddress() {
        return address;
    }
    public String getTelephoneNumber() {
        return telephoneNumber;
    }
    public String getIdNumber() {
        return idNumber;
    }
    public String getDriverLicenceNumber() {
        return driverLicenceNumber;
    }

    private static Comparator<String> ALPHABETICAL_ORDER = new Comparator<String>() {
        public int compare(String str1, String str2) {
            int res = String.CASE_INSENSITIVE_ORDER.compare(str1, str2);
            if (res == 0) {
                res = str1.compareTo(str2);
            }
            return res;
        }
    };
    @Override
    public int compareTo(Customer o) {
        return ALPHABETICAL_ORDER.compare(this.name,o.name);
    }
}
