package sensorsAndDevices;

import sensorsAndDevices.notify.Observable;
import sensorsAndDevices.notify.Observer;

import java.util.ArrayList;


public class Device implements Observable {

    private ArrayList<Observer> observers = new ArrayList<Observer>();
    protected String name;
    protected boolean condition;


    public void setName(String name){

        this.name = name;
    }

    public String getName(){

        return this.name;
    }

    public boolean getCondition() {
        return condition;
    }

    public void setCondition(boolean condition) {
        this.condition = condition;
    }

    public void linkObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void sendNotify(Device device) {

        for(Observer observer:observers){
            observer.update(device);
        }
    }

    public void printDevice(){

    }

    public void changeCondition(boolean condition){

    }

    public void changeCondition(boolean condition, int intensity){

    }
}
