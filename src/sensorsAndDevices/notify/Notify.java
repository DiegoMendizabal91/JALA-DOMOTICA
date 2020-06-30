package sensorsAndDevices.notify;

import sensorsAndDevices.Device;
import sensorsAndDevices.typeOfDevices.IntesityDevice;

public class Notify implements Observer {

    @Override
    public void update(Device device) {
        // action a realizar depues de que se entera que hubo un cambio
        String boolString;

        switch(device.getClass().getSimpleName()){
            case "OpenCloseDevice":
                if (device.getCondition()){
                    boolString = "Open";
                } else{
                    boolString = "Close";
                }
                System.out.println(String.format("Message: device: %s, condition update to:%s"
                        , device.getName(), boolString));
                break;
            case "OnOffDevice":
                if (device.getCondition()){
                    boolString = "On";
                } else{
                    boolString = "Off";
                }
                System.out.println(String.format("Message: device: %s, condition update to:%s"
                        ,device.getName(), boolString));
                break;
            case "IntesityDevice":

                IntesityDevice intesityDevice = (IntesityDevice)device;

                if (intesityDevice.getCondition()){
                    boolString = "On";
                } else{
                    boolString = "Off";
                }
                System.out.println(String.format("Message: device: %s, condition update to:%s, intensity update to %d"
                        ,intesityDevice.getName() , boolString, intesityDevice.getIntensity()));
                break;
        }
    }
}
