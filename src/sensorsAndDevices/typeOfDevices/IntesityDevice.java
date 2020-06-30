package sensorsAndDevices.typeOfDevices;

import sensorsAndDevices.Device;
import sensorsAndDevices.notify.Notify;

public class IntesityDevice extends Device {

    private int intensity;
    public IntesityDevice(String name, boolean condition, int intensity) {
        this.name = name;
        this.condition = condition;
        this.intensity = intensity;
        Notify notify = new Notify();
        linkObserver(notify);
    }

    public int getIntensity() {
        return intensity;
    }

    public void setIntensity(int intensity) {
        this.intensity = intensity;
    }

    @Override
    public void changeCondition(boolean condition, int intensity) {
        // Change device state
        setCondition(condition);
        setIntensity(intensity);
        sendNotify();
    }

    @Override
    public void printDevice(){
        String boolString;
        if (condition){
            boolString = "On";
        } else{
            boolString = "Off";
        }
        System.out.println(String.format("device: %s, condition: %s, intensity:%d", name, boolString, intensity));
    }
}
