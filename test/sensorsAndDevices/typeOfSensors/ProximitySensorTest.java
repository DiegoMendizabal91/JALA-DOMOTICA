package sensorsAndDevices.typeOfSensors;

import org.junit.Test;
import sensorsAndDevices.Device;
import sensorsAndDevices.typeOfDevices.OnOffDevice;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class ProximitySensorTest {

    @Test
    public void getName() {
        OnOffDevice onOffDevice = new OnOffDevice("tv",true);
        ArrayList<Device> deviceSensorList = new ArrayList<Device>();
        deviceSensorList.add(onOffDevice);
        ProximitySensor proximitySensor = new ProximitySensor(deviceSensorList, "turnOnTv","openDoor");
        assertTrue(proximitySensor.getName().equals("openDoor"));
    }

    @Test
    public void getDeviceSensorList() {
        OnOffDevice onOffDevice = new OnOffDevice("tv",true);
        ArrayList<Device> deviceSensorList = new ArrayList<Device>();
        deviceSensorList.add(onOffDevice);
        ProximitySensor proximitySensor = new ProximitySensor(deviceSensorList, "turnOnTv","openDoor");
        assertTrue(proximitySensor.getDeviceSensorList()!=null);
    }

    @Test
    public void turnOnSensor() {
        OnOffDevice onOffDeviceData = new OnOffDevice("tv",false);
        ArrayList<Device> deviceSensorListData = new ArrayList<Device>();
        deviceSensorListData.add(onOffDeviceData);

        OnOffDevice onOffDevice = new OnOffDevice("tv",true);
        ArrayList<Device> deviceSensorList = new ArrayList<Device>();
        deviceSensorList.add(onOffDevice);
        ProximitySensor proximitySensor = new ProximitySensor(deviceSensorList, "turnOnTv","openDoor");
        proximitySensor.turnOnSensor(deviceSensorListData,"turnOnTv");
        assertTrue(deviceSensorListData.get(0).getCondition());
    }
}