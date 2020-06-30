package sensorsAndDevices;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class ReadManagerTest {

    @Test
    public void readDevicesFile() {
        ReadManager read = new ReadManager();
        //Loading sensorsAndDevices.Device Data
        ArrayList<Device> deviceDataList = new ArrayList<Device>();
        deviceDataList = read.ReadDevicesFile();
        assertTrue(deviceDataList.size()==16);
    }

    @Test
    public void readSensorsFile() {
        ReadManager read = new ReadManager();
        ArrayList<String> lineList = new ArrayList<String>();
        lineList=read.ReadSensorsFile();
        assertTrue(lineList.size()==26);
    }

    @Test
    public void setSensorList() {
        ReadManager read = new ReadManager();
        ArrayList<String> lineList = new ArrayList<String>();
        ArrayList<Sensor> sensorList = new ArrayList<Sensor>();
        lineList=read.ReadSensorsFile();
        sensorList=read.setSensorList(lineList);
        assertTrue(sensorList.size()==4);
    }
}