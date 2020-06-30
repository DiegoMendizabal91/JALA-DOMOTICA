package sensorsAndDevices.factory;

import sensorsAndDevices.Device;
import sensorsAndDevices.typeOfDevices.IntesityDevice;
import sensorsAndDevices.typeOfDevices.OnOffDevice;
import sensorsAndDevices.typeOfDevices.OpenCloseDevice;

import static java.lang.Integer.parseInt;

public class DeviceFactory {

        public Device getDevice(String line) {

            String name;
            String condition;
            int intensity;

            String[] split = line.split(",");
            name = split[0];
            condition = split[1];
            if (split.length == 3) {
                intensity = parseInt(split[2]);
                if (condition.equals("on")) {
                    return new IntesityDevice(name, true, intensity);
                } else {
                    return new IntesityDevice(name, false, intensity);
                }
            } else if (condition.equals("open") || condition.equals("close")) {
                if (condition.equals("open")) {
                    return new OpenCloseDevice(name, true);
                } else {
                    return new OpenCloseDevice(name, false);
                }
            } else if (condition.equals("on") || condition.equals("off")) {
                if (condition.equals("on")) {
                    return new OnOffDevice(name, true);
                } else {
                    return new OnOffDevice(name, false);
                }
            }

            return null;
        }
}
