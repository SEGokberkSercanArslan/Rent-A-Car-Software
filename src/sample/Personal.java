package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.io.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;





public class Personal implements Serializable , Comparable<Personal> {
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
    protected static Personal currentUser = new Personal();
    public static ObservableList<Personal> personalObservableList = FXCollections.observableArrayList();


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
        personalObservableList.add(this);
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

    public void initializePersonalsToFile() throws IOException {
        FileOutputStream fos = new FileOutputStream("Personals.data");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        for (Personal per : info) {
            oos.writeObject(per);
        }
        fos.close();
    }

    public void initializePersonalsFromFile() throws IOException, ClassNotFoundException {
        FileInputStream fis = new FileInputStream("Personals.data");
        ObjectInputStream ois = new ObjectInputStream(fis);
        boolean eof = true;
        try {
            while (eof) {
                Personal obj = (Personal) ois.readObject();
                if (obj != null) {
                    info.add(obj);
                } else {
                    eof = false;
                }
            }
        } catch (EOFException eofex) {

        } finally {
            System.out.println("All Personals Recorded Successful");
        }
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
    public int compareTo(Personal personal) {
        return ALPHABETICAL_ORDER.compare(this.name,personal.name);
    }
}
