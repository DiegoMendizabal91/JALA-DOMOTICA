package sensorsAndDevices.simulation;

import org.junit.Test;
import sensorsAndDevices.Device;
import sensorsAndDevices.ReadManager;
import sensorsAndDevices.Sensor;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class ActivationSensorTest {



    @Test
    public void activateSensorProximity() {
        ActivationSensor activationSensor = new ActivationSensor();
        ReadManager read = new ReadManager();
        //Loading sensorsAndDevices.Device Data
        ArrayList<Device> deviceDataList = new ArrayList<Device>();
        deviceDataList = read.ReadDevicesFile();

        //Loading sensors data
        ArrayList<String> lineList = new ArrayList<String>();
        ArrayList<Sensor> sensorList = new ArrayList<Sensor>();

        lineList=read.ReadSensorsFile();
        sensorList=read.setSensorList(lineList);
        activationSensor.activateSensor(deviceDataList,"openFrontDoor",sensorList,"frontDoorOpen");
        assertTrue(deviceDataList.get(11).getCondition());
    }

    @Test
    public void activateSensorMode() {
        ActivationSensor activationSensor = new ActivationSensor();
        ReadManager read = new ReadManager();
        //Loading sensorsAndDevices.Device Data
        ArrayList<Device> deviceDataList = new ArrayList<Device>();
        deviceDataList = read.ReadDevicesFile();

        //Loading sensors data
        ArrayList<String> lineList = new ArrayList<String>();
        ArrayList<Sensor> sensorList = new ArrayList<Sensor>();

        lineList=read.ReadSensorsFile();
        sensorList=read.setSensorList(lineList);
        activationSensor.activateSensor(deviceDataList,"kitchenMode",sensorList);
        assertTrue(deviceDataList.get(10).getCondition());
    }

    @Test
    public void activateSensorTemperature() {
        ActivationSensor activationSensor = new ActivationSensor();
        ReadManager read = new ReadManager();
        //Loading sensorsAndDevices.Device Data
        ArrayList<Device> deviceDataList = new ArrayList<Device>();
        deviceDataList = read.ReadDevicesFile();

        //Loading sensors data
        ArrayList<String> lineList = new ArrayList<String>();
        ArrayList<Sensor> sensorList = new ArrayList<Sensor>();

        lineList=read.ReadSensorsFile();
        sensorList=read.setSensorList(lineList);
        activationSensor.activateSensor(deviceDataList,"temperatureTurnOn",sensorList,17);
        assertTrue(deviceDataList.get(15).getCondition());
    }

    @Test
    public void changeSingleDevice() {
        ActivationSensor activationSensor = new ActivationSensor();
        ReadManager read = new ReadManager();
        //Loading sensorsAndDevices.Device Data
        ArrayList<Device> deviceDataList = new ArrayList<Device>();
        deviceDataList = read.ReadDevicesFile();

        //Loading sensors data
        ArrayList<String> lineList = new ArrayList<String>();
        ArrayList<Sensor> sensorList = new ArrayList<Sensor>();

        lineList=read.ReadSensorsFile();
        sensorList=read.setSensorList(lineList);
        activationSensor.changeSingleDevice("airConditioning",deviceDataList,true,17);
        assertTrue(deviceDataList.get(15).getCondition());
    }
}