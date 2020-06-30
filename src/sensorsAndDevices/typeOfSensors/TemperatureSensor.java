package sensorsAndDevices.typeOfSensors;

import sensorsAndDevices.Device;
import sensorsAndDevices.Sensor;
import sensorsAndDevices.typeOfDevices.IntesityDevice;

import java.util.ArrayList;

public class TemperatureSensor implements Sensor {
    private int activator;
    private ArrayList<Device> deviceSensorList = new ArrayList<Device>();
    private String name;

    public String getName() {
        return name;
    }

    public TemperatureSensor(ArrayList<Device> deviceSensorList, int activator, String name) {
        this.deviceSensorList = deviceSensorList;
        this.activator = activator;
        this.name = name;
    }

    public ArrayList<Device> getDeviceSensorList() {
        return deviceSensorList;
    }

    @Override
    public void turnOnSensor(ArrayList<Device> deviceList, int activator){
        if(this.activator == activator) {
            for (int i = 0; i < deviceList.size(); i++) {
                for (int j = 0; j < deviceSensorList.size(); j++) {
                    if(deviceList.get(i).getName().equals(deviceSensorList.get(j).getName())){
                        if(deviceList.get(i).getClass().getSimpleName().equals("IntesityDevice")){
                            deviceList.get(i).changeCondition(deviceSensorList.get(j).getCondition(),
                                    ((IntesityDevice) deviceSensorList.get(j)).getIntensity());
                        }else{
                            deviceList.get(i).changeCondition(deviceSensorList.get(j).getCondition());
                        }
                    }
                }
            }
        }
    }
}
