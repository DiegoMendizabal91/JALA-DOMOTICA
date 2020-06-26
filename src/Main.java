import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        // A State ---> B notifyState
        // B notifyState Observa --> State, Observador, y el sujeto(Observable)
        // notify es observador
        // device es observado(sujeto)
        ArrayList<Device> deviceList = new ArrayList<Device>();
        ReadDeviceFile read = new ReadDeviceFile();
        deviceList = read.ReadFile();

        Sensors frontDoorOpen = new Sensors("lights","on","tv","on");
        frontDoorOpen.turnOnSensor(deviceList);

//        deviceList.get(0).changeState("door", "close"); // el disparador

    }
}
