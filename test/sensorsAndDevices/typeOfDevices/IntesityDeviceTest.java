package sensorsAndDevices.typeOfDevices;

import org.junit.Test;

import static org.junit.Assert.*;

public class IntesityDeviceTest {

    @Test
    public void getIntensity() {
        IntesityDevice device = new IntesityDevice("device", false, 35);
        assertEquals(35, device.getIntensity());
    }

    @Test
    public void setIntensity() {
        IntesityDevice device = new IntesityDevice("device", false, 35);
        device.setIntensity(15);
        assertEquals(15, device.getIntensity());
    }

    @Test
    public void changeCondition() {
        IntesityDevice device = new IntesityDevice("device", false, 35);
        device.changeCondition(true,25);
        assertEquals(25, device.getIntensity());
        assertEquals(true, device.getCondition());
    }
}