package sensorsAndDevices.typeOfSensors;

import org.junit.Test;
import sensorsAndDevices.Device;
import sensorsAndDevices.typeOfDevices.OnOffDevice;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class ActionSensorTest {

    @Test
    public void getName() {
        OnOffDevice onOffDevice = new OnOffDevice("tv",true);
        ArrayList<Device> deviceSensorList = new ArrayList<Device>();
        deviceSensorList.add(onOffDevice);
        ActionSensor actionSensor = new ActionSensor(deviceSensorList, "turnOnTv");
        assertTrue(actionSensor.getName().equals("turnOnTv"));
    }

    @Test
    public void getDeviceSensorList() {
        OnOffDevice onOffDevice = new OnOffDevice("tv",true);
        ArrayList<Device> deviceSensorList = new ArrayList<Device>();
        deviceSensorList.add(onOffDevice);
        ActionSensor actionSensor = new ActionSensor(deviceSensorList, "turnOnTv");
        assertTrue(actionSensor.getDeviceSensorList()!=null);
    }

    @Test
    public void turnOnSensor() {
        OnOffDevice onOffDeviceData = new OnOffDevice("tv",false);
        ArrayList<Device> deviceSensorListData = new ArrayList<Device>();
        deviceSensorListData.add(onOffDeviceData);

        OnOffDevice onOffDevice = new OnOffDevice("tv",true);
        ArrayList<Device> deviceSensorList = new ArrayList<Device>();
        deviceSensorList.add(onOffDevice);
        ActionSensor actionSensor = new ActionSensor(deviceSensorList, "turnOnTv");
        actionSensor.turnOnSensor(deviceSensorListData);
        assertTrue(deviceSensorListData.get(0).getCondition());
    }
}