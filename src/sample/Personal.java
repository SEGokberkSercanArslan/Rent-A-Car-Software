package sample;

import java.util.ArrayList;
import java.util.List;





public class Personal {
    private String name;
    private String surname;
    private String emailAdress;
    private String telephoneNumber;
    private String username;
    private String password;
    static List <Personal> info = new ArrayList<Personal>();



    public Personal(String name,String surname,String emailAdress,String telephoneNumber,String username,String password){
        setEmailAdress(emailAdress);
        setTelephoneNumber(telephoneNumber);
        setName(name);
        setSurname(surname);
        setPassword(password);
        setUsername(username);
        info.add(this);
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

}
