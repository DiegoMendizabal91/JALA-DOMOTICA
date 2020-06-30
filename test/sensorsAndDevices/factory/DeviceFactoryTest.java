package sensorsAndDevices.factory;

import org.junit.Test;
import sensorsAndDevices.Device;

import static org.junit.Assert.*;

public class DeviceFactoryTest {

    @Test
    public void getDeviceOnOff() {
        DeviceFactory deviceFactory = new DeviceFactory();
        Device device = deviceFactory.getDevice("tv,on");
        assertTrue(device.getClass().getSimpleName().equals("OnOffDevice"));
    }

    @Test
    public void getDeviceOpenClose() {
        DeviceFactory deviceFactory = new DeviceFactory();
        Device device = deviceFactory.getDevice("door,open");
        assertTrue(device.getClass().getSimpleName().equals("OpenCloseDevice"));
    }

    @Test
    public void getDeviceIntensity() {
        DeviceFactory deviceFactory = new DeviceFactory();
        Device device = deviceFactory.getDevice("oven,on,45");
        assertTrue(device.getClass().getSimpleName().equals("IntesityDevice"));
    }
}