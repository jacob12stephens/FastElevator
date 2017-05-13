package lab1_206_02.uwaterloo.ca.fastelevator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.json.JSONArray;
import org.json.JSONObject;
import org.w3c.dom.Text;

import java.io.IOException;
import java.io.InputStream;

public class MainActivity extends AppCompatActivity {

    TextView timeminuteview;
    TextView timesecondview;
    TextView floornumber;
    TextView direction;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);




        Button btn = (Button) findViewById(R.id.AutoRun);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Run(v);
            }
        });




//
//
//        Person[] people = new Person[20];
//        people[0] = new Person(12, 1, 7);
//        people[1] = new Person(21, 7, 9);
//        people[2] = new Person(55, 4, 5);
//        people[3] = new Person(63, 0, 3);
//        people[4] = new Person(94, 9, 7);
//        people[5] = new Person(104, 4, 7);
//        people[6] = new Person(124, 3, 7);
//        people[7] = new Person(141, 1, 3);
//        people[8] = new Person(166, 1, 5);
//        people[9] = new Person(185, 2, 9);
//        people[10] = new Person(207, 9, 1);
//        people[11] = new Person(221, 1, 9);
//        people[12] = new Person(256, 5, 9);
//        people[13] = new Person(269, 1, 5);
//        people[14] = new Person(298, 2, 3);
//        people[15] = new Person(310, 0, 8);
//        people[16] = new Person(335, 0, 6);
//        people[17] = new Person(342, 3, 6);
//        people[18] = new Person(363, 0, 8);
//        people[19] = new Person(398, 8, 3);
//
//
//
//        int numofloor = 10;
//        int numofelevators = 1;
//
//        int dividefloors = numofloor/ numofelevators;
//        int [] callstimes= {1, 7, 12, 18 , 20, 30};
//
//        int [] startfloors = {2, 9, 7, 6, 5, 1};
//        int [] endfloors = {7,1, 2, 9, 2, 9};
//        int currentfloor =0;
//
//        int numinelevator =0;
//        int numoffelevator =0;
//        int peopletoadd =0;
//
//        int timetaken =0;
//        //floornumber = (TextView) findViewById(R.id.currentfloorlocation);
//        //direction = (TextView) findViewById(R.id.upDown);
//
//        //write whilie loop to go on until t= 1000 and numpeopleonelevator and numoffelevator > 0
//        //insider check for new people
//        //
//        int time =0;
//        while(time< 1000){
//            //time< 1000 || numinelevator > 0 || numoffelevator >0
//            //get the list of all the people waiting and in the elevator
//            //this is the time for the first person
//            //create an array full of people to add waiting
//            for (int i = 0; i <19; i++){
//                //int a = people[i].getTime();
//                //int b = people[i+1].getTime();
//                //int timedifference = a - b;
//                int startfloor = people[i].getStart();
//                int endfloor = people[i].getEnd();
//                int floordiff;
//
//                if(startfloor > endfloor){
//                    floordiff = startfloor- endfloor;
//                    //direction.setText("Down");
//                }
//                else{
//                    floordiff = endfloor- startfloor;
//                    //direction.setText("Up");
//                }
//
//                int changeelevator;
//                if(currentfloor > startfloor){
//                    changeelevator = currentfloor - startfloor;
//                    //then set endfloor to the current floor
//                    currentfloor = endfloor;
//                    //direction.setText("Down");
//                    //floornumber.setText(currentfloor);
//                }
//                else{
//                    changeelevator = startfloor - currentfloor;
//                    //then set endfloor to the current floor
//                    currentfloor = endfloor;
//                    //direction.setText("Up");
//                    //floornumber.setText(currentfloor);
//                }
//
//                //now the actual math
//                timetaken = timetaken + (3 * changeelevator + 10 * 2 + 3 * floordiff);
//
//
//
//
//            }
//
//            int minutes;
//            int seconds;
//
//            minutes = timetaken/60;
//            seconds = timetaken - minutes*60;
//
//            //timerConvert(timetaken, minutes, seconds);
//
//            String min = Integer.toString(minutes);
//            String sec = Integer.toString(seconds);
//            //TextView time;
//            //TextView floornumber;
//            //TextView direction;
//
//            timeminuteview = (TextView) findViewById(R.id.minutes);
//            timeminuteview.setText(min + ":") ;
//
//            timesecondview = (TextView) findViewById(R.id.second);
//            timesecondview.setText(sec);
//
//            //check to see if you have a person on the curent floor that the elevator is in
//            //find the fastest route to unload all the people in
//
//            time++;
//        }





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

    public void peopleAdd(int time, int [] timeadd, int [] startfloor, int [] endfloor){
        int elementnum = 0;
        int i=0;
        while(i <= timeadd[i]){
            if(i== timeadd[i]){
                elementnum = i;
            }
            i++;


        }
    }



    public void timerConvert(int timer, int min, int sec){
        min = timer/60;
        sec = timer - min*60;
    }

    public void Run(View v){

//        //first is floors and second is elevators
//        Integer[] hotel = new Integer[2];
//
//        //the first event, in order times start end
//        String[][] events = new String[250][3];
//        JSONparserForReal jsonparser = new JSONparserForReal(hotel, events);

        String JSON4 = loadJSONFromAsset();

        Integer[] eleFloorStrArr = new Integer[2];
        String[][] eventsStrArr = new String[250][3];

        try {

            JSONObject obj = new JSONObject(JSON4);

            String floorsArray = new String(obj.getString("floors"));
            String elevatorsArray = new String(obj.getString("elevators"));
            JSONArray eventsArray = new JSONArray(obj.getString("events"));

//            Integer[] eleFloorStrArr = new Integer[2];
//            String[][] eventsStrArr = new String[eventsArray.length()][3];

            eleFloorStrArr[0] = Integer.parseInt(floorsArray);
            eleFloorStrArr[1] = Integer.parseInt(elevatorsArray);

            for (int i = 0; i < eventsArray.length(); i++) {
                JSONObject objact = new JSONObject(eventsArray.getString(i));
                eventsStrArr[i][0] = new String(objact.getString("time"));
                eventsStrArr[i][1] = new String(objact.getString("start"));
                eventsStrArr[i][2] = new String(objact.getString("end"));
            }

            Log.e("My App", eventsStrArr[150][1]);

        } catch (Throwable t) {
            Log.e("My App", "Could not parse malformed JSON: \"" + JSON4 + "\"");
        }

//        Person[] people = new Person[20];
//        people[0] = new Person(12, 1, 7);
//        people[1] = new Person(21, 7, 9);
//        people[2] = new Person(55, 4, 5);
//        people[3] = new Person(63, 0, 3);
//        people[4] = new Person(94, 9, 7);
//        people[5] = new Person(104, 4, 7);
//        people[6] = new Person(124, 3, 7);
//        people[7] = new Person(141, 1, 3);
//        people[8] = new Person(166, 1, 5);
//        people[9] = new Person(185, 2, 9);
//        people[10] = new Person(207, 9, 1);
//        people[11] = new Person(221, 1, 9);
//        people[12] = new Person(256, 5, 9);
//        people[13] = new Person(269, 1, 5);
//        people[14] = new Person(298, 2, 3);
//        people[15] = new Person(310, 0, 8);
//        people[16] = new Person(335, 0, 6);
//        people[17] = new Person(342, 3, 6);
//        people[18] = new Person(363, 0, 8);
//        people[19] = new Person(398, 8, 3);



        int numofloor = eleFloorStrArr[0];
        int numofelevators = eleFloorStrArr[1];

        int currentfloor =0;

        int timetaken =0;
        //floornumber = (TextView) findViewById(R.id.currentfloorlocation);
        //direction = (TextView) findViewById(R.id.upDown);

        //write whilie loop to go on until t= 1000 and numpeopleonelevator and numoffelevator > 0
            //insider check for new people
            //
        int time =0;
        while(time< 1000){
            //time< 1000 || numinelevator > 0 || numoffelevator >0
            //get the list of all the people waiting and in the elevator
            //this is the time for the first person
            //create an array full of people to add waiting
            for (int i = 0; i <19; i++){
                //int a = people[i].getTime();
                //int b = people[i+1].getTime();
                //int timedifference = a - b;

                int startfloor = Integer.valueOf(eventsStrArr[0][1]);
                int endfloor = Integer.valueOf(eventsStrArr[0][2]);
                int floordiff;

                if(startfloor > endfloor){
                    floordiff = startfloor- endfloor;
                    //direction.setText("Down");
                }
                else{
                    floordiff = endfloor- startfloor;
                    //direction.setText("Up");
                }

                int changeelevator;
                if(currentfloor > startfloor){
                    changeelevator = currentfloor - startfloor;
                    //then set endfloor to the current floor
                    currentfloor = endfloor;
                    //direction.setText("Down");
                    //floornumber.setText(currentfloor);
                }
                else{
                    changeelevator = startfloor - currentfloor;
                    //then set endfloor to the current floor
                    currentfloor = endfloor;
                    //direction.setText("Up");
                    //floornumber.setText(currentfloor);
                }


                //now the actual math
                timetaken = timetaken + (3 * changeelevator + 10 * 2 + 3 * floordiff);




            }

            int minutes;
            int seconds;

            minutes = timetaken/60;
            seconds = timetaken - minutes*60;

            //timerConvert(timetaken, minutes, seconds);

            String min = Integer.toString(minutes);
            String sec = Integer.toString(seconds);
            //TextView time;
            //TextView floornumber;
            //TextView direction;

            timeminuteview = (TextView) findViewById(R.id.minutes);
            timeminuteview.setText(min + " : ");

            timesecondview = (TextView) findViewById(R.id.second);
            timesecondview.setText(sec);

            //check to see if you have a person on the curent floor that the elevator is in
            //find the fastest route to unload all the people in

            time++;
        }


    }

}

