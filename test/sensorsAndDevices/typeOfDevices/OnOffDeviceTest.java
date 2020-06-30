package sensorsAndDevices.typeOfDevices;

import org.junit.Test;

import static org.junit.Assert.*;

public class OnOffDeviceTest {

    @Test
    public void changeCondition() {
        OnOffDevice device = new OnOffDevice("device", false);
        device.changeCondition(true);
        assertTrue(device.getCondition());
    }
}