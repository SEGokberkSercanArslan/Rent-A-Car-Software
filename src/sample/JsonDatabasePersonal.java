package sample;

import org.json.simple.JSONObject;

import java.util.ArrayList;
import java.util.List;

public class JsonDatabasePersonal extends Personal{

    public static List<JsonDatabasePersonal> personalDatabase = new ArrayList<JsonDatabasePersonal>();
    public static int counter=0;

    public JsonDatabasePersonal(){

        personalDatabase.add(this);
        counter++;
    }
    public void initalizePersonalToDatabase(int index){
        JSONObject personal = new JSONObject();
        personal.put("Name",Personal.info.get(index).getName());
    }

}
