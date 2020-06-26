import java.util.ArrayList;


public class Device implements Observable {

    private ArrayList<Observer> observers;
    private String name;
    private String state;

    public Device(String line){
        observers = new ArrayList<Observer>();
        String[] split = line.split(",");
        name = split[0];
        state = split[1];
        Notify notify = new Notify();
        linkObserver(notify);
    }

    public Device(String name, String state){
        observers = new ArrayList<Observer>();
        this.name = name;
        this.state = state;
        Notify notify = new Notify();
        linkObserver(notify);
    }

    public void setName(String name){
        this.state = state;
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

    public void changeState(String name, String state) {
        // Change device state
        setName(name);
        setState(state);
        sendNotify(name, state);
    }
    public void changeDeviceState(Device device) {
        sendNotify(device.name, device.state);
    }

    public void linkObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void sendNotify(String name, String state) {
        for(Observer observer:observers){
            observer.update(name, state);
        }
    }
}
