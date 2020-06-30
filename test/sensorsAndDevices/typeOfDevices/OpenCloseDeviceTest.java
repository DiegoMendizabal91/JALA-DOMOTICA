package sensorsAndDevices.typeOfDevices;

import org.junit.Test;

import static org.junit.Assert.*;

public class OpenCloseDeviceTest {

    @Test
    public void changeCondition() {
        OpenCloseDevice device = new OpenCloseDevice("device", false);
        device.changeCondition(true);
        assertTrue(device.getCondition());
    }
}