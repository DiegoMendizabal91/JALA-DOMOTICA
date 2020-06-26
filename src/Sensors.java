import java.util.ArrayList;

public class Sensors {
    ArrayList<Device> deviceSensorList = new ArrayList<Device>();

    public Sensors(String device1, String state1, String device2, String state2) {
        deviceSensorList.add(new Device(device1, state1));
        deviceSensorList.add(new Device(device2, state2));
    }

    public void turnOnSensor(ArrayList<Device> deviceList){

        for (int i = 0; i < deviceList.size(); i++) {
            for (int j = 0; j < deviceSensorList.size(); j++) {
                if(deviceList.get(i).getName().equals(deviceSensorList.get(j).getName())){
                    deviceList.get(i).changeState(deviceSensorList.get(j).getName(),
                            deviceSensorList.get(j).getState());
                }
            }
        }
    }

}
