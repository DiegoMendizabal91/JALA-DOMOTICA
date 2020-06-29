import java.util.ArrayList;


public class Device implements Observable {

    private ArrayList<Observer> observers = new ArrayList<Observer>();
    protected String name;
    protected boolean condition;
    protected String state;

//    public Device(String line){
//        observers = new ArrayList<Observer>();
//        String[] split = line.split(",");
//        name = split[0];
//        state = split[1];
//        Notify notify = new Notify();
//        linkObserver(notify);
//    }
//
//    public Device(String name, String state){
//        observers = new ArrayList<Observer>();
//        this.name = name;
//        this.state = state;
//        Notify notify = new Notify();
//        linkObserver(notify);
//    }

    public void setName(String name){

        this.name = name;
    }

    public String getName(){

        return this.name;
    }

    public String getState(){

        return this.state;
    }

    public void setState(String state){

        this.state = state;
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
