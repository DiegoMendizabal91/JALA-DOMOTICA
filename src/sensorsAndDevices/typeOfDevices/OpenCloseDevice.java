package sensorsAndDevices.typeOfDevices;

import sensorsAndDevices.Device;
import sensorsAndDevices.notify.Notify;

public class OpenCloseDevice extends Device {
    public OpenCloseDevice(String name, boolean condition) {
        this.name = name;
        this.condition = condition;
        Notify notify = new Notify();
        linkObserver(notify);
    }

    @Override
    public void changeCondition(boolean condition) {
        // Change device state

        setCondition(condition);
        sendNotify();
    }

    @Override
    public void printDevice(){
        String boolString;
        if (condition){
            boolString = "Open";
        } else{
            boolString = "Close";
        }
        System.out.println(String.format("device name: %s, condition: %s", name, boolString));
    }

}
