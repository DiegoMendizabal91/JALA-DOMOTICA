package sensorsAndDevices.factory;

import org.junit.Test;
import sensorsAndDevices.Device;
import sensorsAndDevices.Sensor;
import sensorsAndDevices.typeOfDevices.OnOffDevice;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class SensorFactoryTest {

    @Test
    public void getActionSensor() {
        OnOffDevice device = new OnOffDevice("tv",true);
        ArrayList<Device> instructionList = new ArrayList<Device>();
        instructionList.add(device);
        SensorFactory sensorFactory = new SensorFactory();
        Sensor sensor = sensorFactory.
                getSensor("openDoorSensor","AS","Opendoor", instructionList);
        assertTrue(sensor.getClass().getSimpleName().equals("ActionSensor"));
    }

    @Test
    public void getProximitySensor() {
        OnOffDevice device = new OnOffDevice("tv",true);
        ArrayList<Device> instructionList = new ArrayList<Device>();
        instructionList.add(device);
        SensorFactory sensorFactory = new SensorFactory();
        Sensor sensor = sensorFactory.
                getSensor("openDoorSensor","PS","Opendoor", instructionList);
        assertTrue(sensor.getClass().getSimpleName().equals("ProximitySensor"));
    }

    @Test
    public void getIntensitySensor() {
        OnOffDevice device = new OnOffDevice("tv",true);
        ArrayList<Device> instructionList = new ArrayList<Device>();
        instructionList.add(device);
        SensorFactory sensorFactory = new SensorFactory();
        Sensor sensor = sensorFactory.
        getSensor("openDoorSensor","TS","17", instructionList);
        assertTrue(sensor.getClass().getSimpleName().equals("TemperatureSensor"));
    }
}