import java.util.ArrayList;

public class ProximitySensor extends Sensor {

    String activator;

    public ProximitySensor(ArrayList<Device> deviceSensorList, String activator) {
        this.deviceSensorList = deviceSensorList;
        this.activator = activator;
    }

    @Override
    public void turnOnSensor(ArrayList<Device> deviceList, String activator){
        if(this.activator.equals(activator)) {
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
