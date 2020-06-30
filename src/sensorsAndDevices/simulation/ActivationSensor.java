package sensorsAndDevices.simulation;

import sensorsAndDevices.typeOfSensors.ActionSensor;
import sensorsAndDevices.Device;
import sensorsAndDevices.Sensor;
import sensorsAndDevices.typeOfSensors.ProximitySensor;
import sensorsAndDevices.typeOfSensors.TemperatureSensor;

import java.util.ArrayList;

public class ActivationSensor {
    public void activateSensor(ArrayList<Device> deviceDataList, String sensorName, ArrayList<Sensor> sensorList, String action){
        for(int i=0; sensorList.size()>i; i++){
            if(sensorList.get(i).getClass().getSimpleName().equals("ProximitySensor")){
                ProximitySensor proximitySensor = (ProximitySensor) sensorList.get(i);
                if(proximitySensor.getName().equals(sensorName)) {
                    proximitySensor.turnOnSensor(deviceDataList, action);
                }
            }
        }
        System.out.println(String.format("*****************************************"));
    }

    public void activateSensor(ArrayList<Device> deviceDataList, String sensorName, ArrayList<Sensor> sensorList, int action){
        for(int i=0; sensorList.size()>i; i++){
            if(sensorList.get(i).getClass().getSimpleName().equals("TemperatureSensor")){
                TemperatureSensor temperatureSensor = (TemperatureSensor) sensorList.get(i);
                if(temperatureSensor.getName().equals(sensorName)) {
                    temperatureSensor.turnOnSensor(deviceDataList, action);
                }
            }
        }
        System.out.println(String.format("*****************************************"));
    }

    public void activateSensor(ArrayList<Device> deviceDataList, String sensorName, ArrayList<Sensor> sensorList){
        for(int i=0; sensorList.size()>i; i++){
            if(sensorList.get(i).getClass().getSimpleName().equals("ActionSensor")){
                ActionSensor actionSensor = (ActionSensor) sensorList.get(i);
                if(actionSensor.getName().equals(sensorName)){
                    actionSensor.turnOnSensor(deviceDataList);
                }
            }
        }
        System.out.println(String.format("*****************************************"));
    }

    public void changeSingleDevice(String deviceName, ArrayList<Device> deviceList, boolean condition, int intensity) {
        for(int i=0; deviceList.size()>i; i++){
            if(deviceList.get(i).getName().equals(deviceName)){
                deviceList.get(i).changeCondition(condition, intensity);
            }
        }
    }
}
