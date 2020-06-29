import java.util.ArrayList;

public interface Sensor {

    default void turnOnSensor(ArrayList<Device> deviceList){
    }

    default void turnOnSensor(ArrayList<Device> deviceList, int activator){
    }

    default void turnOnSensor(ArrayList<Device> deviceList, String activator) {
    }
}
