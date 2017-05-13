package lab1_206_02.uwaterloo.ca.fastelevator;

import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import org.json.JSONArray;
import org.json.JSONObject;

import java.io.IOException;
import java.io.InputStream;

/**
 * Created by fredd on 5/12/2017.
 */

public class JSONparserForReal extends AppCompatActivity{

    Integer[] eleFloorStrArr = new Integer[2];
    String[][] eventsStrArr = new String[250][3];


    public JSONparserForReal(Integer[] hotel, String[][] events){

        eleFloorStrArr = hotel;
        eventsStrArr = events;


        mainFunc();
    }

    public void mainFunc(){
        String JSON4 = loadJSONFromAsset();

        try {

            JSONObject obj = new JSONObject(JSON4);

            String floorsArray = new String(obj.getString("floors"));
            String elevatorsArray = new String(obj.getString("elevators"));
            JSONArray eventsArray = new JSONArray(obj.getString("events"));

            eleFloorStrArr[0] = Integer.parseInt(floorsArray);
            eleFloorStrArr[1] = Integer.parseInt(elevatorsArray);

            for (int i = 0; i < eventsArray.length(); i++) {
                JSONObject objact = new JSONObject(eventsArray.getString(i));
                eventsStrArr[i][0] = new String(objact.getString("time"));
                eventsStrArr[i][1] = new String(objact.getString("start"));
                eventsStrArr[i][2] = new String(objact.getString("end"));
            }

            Log.d("My App", obj.toString());

        } catch (Throwable t) {
            Log.e("My App", "Could not parse malformed JSON: \"" + JSON4 + "\"");
        }
    }




    public String loadJSONFromAsset() {
        String json = "if parsing fails";
        try {

            InputStream is = getAssets().open("elevator_practice1.json");

            int size = is.available();

            byte[] buffer = new byte[size];

            is.read(buffer);

            is.close();

            json = new String(buffer, "UTF-8");


        } catch (IOException ex) {
            ex.printStackTrace();
            return null;
        }
        return json;
    }
}
