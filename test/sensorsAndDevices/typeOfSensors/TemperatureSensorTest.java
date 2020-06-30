package sensorsAndDevices.typeOfSensors;

import org.junit.Test;
import sensorsAndDevices.Device;
import sensorsAndDevices.typeOfDevices.OnOffDevice;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class TemperatureSensorTest {

    @Test
    public void getName() {
        OnOffDevice onOffDevice = new OnOffDevice("airConditioning",true);
        ArrayList<Device> deviceSensorList = new ArrayList<Device>();
        deviceSensorList.add(onOffDevice);
        TemperatureSensor temperatureSensor = new TemperatureSensor(deviceSensorList, 35,"increaseTemp");
        assertTrue(temperatureSensor.getName().equals("increaseTemp"));
    }

    @Test
    public void getDeviceSensorList() {
        OnOffDevice onOffDevice = new OnOffDevice("airConditioning",true);
        ArrayList<Device> deviceSensorList = new ArrayList<Device>();
        deviceSensorList.add(onOffDevice);
        TemperatureSensor temperatureSensor = new TemperatureSensor(deviceSensorList, 17,"increaseTemp");
        assertTrue(temperatureSensor.getDeviceSensorList()!=null);
    }

    @Test
    public void turnOnSensor() {
        OnOffDevice onOffDeviceData = new OnOffDevice("airConditioning",false);
        ArrayList<Device> deviceSensorListData = new ArrayList<Device>();
        deviceSensorListData.add(onOffDeviceData);

        OnOffDevice onOffDevice = new OnOffDevice("airConditioning",true);
        ArrayList<Device> deviceSensorList = new ArrayList<Device>();
        deviceSensorList.add(onOffDevice);
        TemperatureSensor temperatureSensor = new TemperatureSensor(deviceSensorList, 17,"increaseTemp");
        temperatureSensor.turnOnSensor(deviceSensorListData,17);
        assertTrue(deviceSensorListData.get(0).getCondition());
    }
}