package sensorsAndDevices;

import org.junit.Test;
import sensorsAndDevices.notify.Notify;

import static org.junit.Assert.*;

public class DeviceTest {
    @Test
    public void testDeviceSetName(){
        Device device = new Device();
        device.setName("tv");
        assertEquals("tv", device.getName());
    }

    @Test
    public void testDeviceSetCondition(){
        Device device = new Device();
        device.setCondition(true);
        assertEquals(true, device.getCondition());
    }

    @Test
    public void testDeviceLinkObserver(){
        Device device = new Device();
        Notify notify = new Notify();
        device.linkObserver(notify);
        assertTrue(device.getObservers().get(0)!=null);
    }

}