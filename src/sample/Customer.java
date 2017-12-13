package sample;


import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.util.ArrayList;

public class Customer implements Comparable<Customer> {
    private String name;
    private String surname;
    private String address;
    private String telephoneNumber;
    private String idNumber;

    Customer(String name , String surname, String address , String telephoneNumber , String idNumber){
        setName(name);
        setSurname(surname);
        setAddress(address);
        setTelephoneNumber(telephoneNumber);
        setIdNumber(idNumber);
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

    @Override
    public int compareTo(Customer o) {
        return 0;
    }
}
