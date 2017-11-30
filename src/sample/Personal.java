package sample;

import java.util.ArrayList;
import java.util.List;





public class Personal {
    private String name;
    private String surname;
    private String emailAdress;
    private String telephoneNumber;
    private String address;
    private String username;
    private String password;
    private String idNumber;
    private String privladge;
    static List <Personal> info = new ArrayList<Personal>();
    private static Personal currentUser = new Personal();



    public Personal(String name,String surname,String emailAdress,String telephoneNumber,String username,String password,String address,String idNumber,String privladge){
        setEmailAdress(emailAdress);
        setTelephoneNumber(telephoneNumber);
        setName(name);
        setSurname(surname);
        setPassword(password);
        setUsername(username);
        setAddress(address);
        setIdNumber(idNumber);
        setPrivladge(privladge);
        info.add(this);
    }
    public Personal(){

    }

    //Set methods of attributes
    public void setSurname(String surname) {
        this.surname = surname;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public void setEmailAdress(String emailAdress) {
        this.emailAdress = emailAdress;
    }
    public void setTelephoneNumber(String telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }
    public void setPrivladge(String privladge) {
        this.privladge = privladge;
    }

    //Current User Prototype Function
    public static void initializeCurrentUser(int index) {
        //Personal.currentUser = currentUser;
        Personal.currentUser.setName(info.get(index).getName());
        Personal.currentUser.setUsername(info.get(index).getSurname());
        Personal.currentUser.setEmailAdress(info.get(index).getEmailAdress());
        Personal.currentUser.setTelephoneNumber(info.get(index).getTelephoneNumber());
        Personal.currentUser.setUsername(info.get(index).getUsername());
        Personal.currentUser.setPassword(info.get(index).getPassword());
        Personal.currentUser.setAddress(info.get(index).getAddress());
        Personal.currentUser.setIdNumber(info.get(index).getIdNumber());
        Personal.currentUser.setPrivladge(info.get(index).getPrivladge());
    }

    //Get methods of attributes
    public String getSurname() {
        return surname;
    }
    public String getName() {
        return name;
    }
    public String getPassword() {
        return password;
    }
    public String getEmailAdress() {
        return emailAdress;
    }
    public String getTelephoneNumber() {
        return telephoneNumber;
    }
    public String getUsername() {
        return username;
    }
    public String getAddress() {
        return address;
    }
    public String getIdNumber() {
        return idNumber;
    }
    public String getPrivladge() {
        return privladge;
    }
}
