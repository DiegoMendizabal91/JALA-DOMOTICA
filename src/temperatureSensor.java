import java.util.ArrayList;

public class temperatureSensor extends Sensor {
    int activator;

    public temperatureSensor(ArrayList<Device> deviceSensorList, int activator) {
        this.deviceSensorList = deviceSensorList;
        this.activator = activator;
    }

    @Override
    public void turnOnSensor(ArrayList<Device> deviceList, int activator){
        if(this.activator == activator) {
            for (int i = 0; i < deviceList.size(); i++) {
                for (int j = 0; j < deviceSensorList.size(); j++) {
                    if(deviceList.get(i).getName().equals(deviceSensorList.get(j).getName())){
                        if(deviceList.get(i).getClass().getSimpleName().equals("IntesityDevice")){
                            deviceList.get(i).changeCondition(deviceSensorList.get(j).getCondition(),
                                    ((IntesityDevice) deviceSensorList.get(j)).getIntensity());
                        }else{
                            deviceList.get(i).changeCondition(deviceSensorList.get(j).condition);
                        }
                    }
                }
            }
        }
    }
}
