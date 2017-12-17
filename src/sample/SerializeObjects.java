package sample;


import java.io.*;
import java.util.ArrayList;

public class SerializeObjects implements Serializable {

    public static void initializePersonalObjectToFile(Personal object) throws IOException {
        FileOutputStream file = new FileOutputStream("Personals.data");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(file);
        objectOutputStream.writeObject(object);
    }
    public static void initialziePersonalObjectsToFile() throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream("Personals.data");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        for(int counter=0;counter<Personal.info.size();counter++){
            objectOutputStream.writeObject(Personal.info.get(counter));
        }
        System.out.println("All personal objects written in file successfully");
        objectOutputStream.close();
        fileOutputStream.close();
    }
    public static void initializePersonalObjectsFromFile() throws IOException {
        FileInputStream file = new FileInputStream("Personals.data");
        ObjectInputStream objectInputStream = new ObjectInputStream(file);
        boolean eof = true;
        try {
            while (eof) {
                Personal obj = (Personal) objectInputStream.readObject();
                if (obj != null) {
                    Personal.info.add(obj);
                    System.out.println("Object written");

                } else {
                    eof = false;
                    System.out.println("end of file");
                }
            }
        } catch (EOFException eofex) {
            objectInputStream.close();
        } catch (ClassNotFoundException e) {
            System.out.println("class not found");
            e.printStackTrace();
        } finally {
            for (int counter = 0; counter < Personal.info.size(); counter++) {
                Personal.personalObservableList.add(Personal.info.get(counter));
            }
            System.out.println("All Personals Recorded Successful");
            file.close();
        }
    }
    public static void initializeVehicleObjectsToFile() throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream("Vehicle.data");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        for (int counter=0;counter<Vehicle.info.size();counter++){
            objectOutputStream.writeObject(Vehicle.info.get(counter));
        }
        System.out.println("All vehicle objects written in file successfully");
        objectOutputStream.close();
        fileOutputStream.close();
    }
    public static void initializeVehicleObjectsFromFile() throws IOException {
        FileInputStream file = new FileInputStream("Vehicle.data");
        ObjectInputStream objectInputStream = new ObjectInputStream(file);
        boolean eof = true;
        try {
            while (eof) {
                Vehicle obj = (Vehicle) objectInputStream.readObject();
                if (obj != null) {
                    Vehicle.info.add(obj);
                    System.out.println("Object written");

                } else {
                    eof = false;
                    System.out.println("end of file");
                }
            }
        } catch (EOFException eofex) {
            objectInputStream.close();
        } catch (ClassNotFoundException e) {
            System.out.println("class not found");
            e.printStackTrace();
        } finally {
            try {
                for (int counter = 0; counter < Personal.info.size(); counter++) {
                    Vehicle.vehicleObservableList.add(Vehicle.info.get(counter));
                }
            }
            catch (IndexOutOfBoundsException ex){
                System.out.println("No vehicles in file");
            }

            System.out.println("All Vehicles Recorded Successful");
            file.close();
        }
    }
    public static void clearVehicleData() throws FileNotFoundException {
        PrintWriter printWriter = new PrintWriter("Vehicle.data");
        printWriter.write("");
        printWriter.close();
    }
    public static void clearPersonalsData() throws FileNotFoundException {
        PrintWriter printWriter = new PrintWriter("Personals.data");
        printWriter.write("");
        printWriter.close();
    }
}
