import java.util.ArrayList;

import static java.lang.Integer.parseInt;

public class SensorFactory {
    public Sensor getSensor(String sensorName, String trigger, String action, ArrayList<Device> instructionList) {

        switch (trigger) {
            case "PS":
                return new ProximitySensor(instructionList, action, sensorName);
            case "AS":
                return new ActionSensor(instructionList, action);
            case "TS":
                int temperature = parseInt(action);
                return new TemperatureSensor(instructionList, temperature, sensorName);
        }
        return null;
    }

}
