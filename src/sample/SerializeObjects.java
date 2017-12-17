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
        System.out.println("All objects written in file successfully");
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
        }
    }

}
