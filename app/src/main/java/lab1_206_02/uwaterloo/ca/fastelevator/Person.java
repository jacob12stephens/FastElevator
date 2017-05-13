package lab1_206_02.uwaterloo.ca.fastelevator;

/**
 * Created by Jacob Stephens on 2017-05-12.
 */

public class Person {
    private int end = 0;
    private int start = 0;
    private int timeStart = 0;
    private int timer = 0;

    Person(int time, int start, int end){
        this.timeStart = time;
        this.start = start;
        this.end = end;
    }

    public int getStart(){
        return start;
    }

    public int getEnd(){
        return end;
    }

    public int getTime(){
        return timeStart;
    }

}
