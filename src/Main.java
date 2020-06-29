import java.util.ArrayList;


public class Main {

    public static void printArray(ArrayList<Device> deviceDataList){

        System.out.println("************ Device General Status ************");

        for (int i=0; i < deviceDataList.size(); i++) {
            deviceDataList.get(i).printDevice();
        }
    }

    public static void main(String[] args) {
        boolean on = true;
        boolean off = false;
        boolean close = false;
        boolean trigger = true;

        // Cargando DATA
        //Devices
        Device windows = new OpenCloseDevice("windows", close);
        Device tv = new OnOffDevice("tv", off);
        Device radio = new OnOffDevice("radio", off);
        Device coffeeMaker = new OnOffDevice("coffeeMaker", off);
        Device microwave = new OnOffDevice("microwave", off);
        Device PC = new OnOffDevice("PC", off);
        Device airConditioning = new IntesityDevice("airConditioning", off, 15);
        Device oven = new IntesityDevice("oven", off, 45);
        Device lightsKitchen = new IntesityDevice("lightsKitchen", off, 90);
        Device lightsFrontDoor = new IntesityDevice("lightsFrontDoor", off, 90);
        Device lightsLivingDoor = new IntesityDevice("lightsLivingDoor", off,90);
        Device lightsRoom = new IntesityDevice("lightsRoom", off,90);
        Device curtainsRoom = new OpenCloseDevice("lightsCurtain", close);

        ArrayList<Device> deviceDataList = new ArrayList<Device>();
        deviceDataList.add(windows);
        deviceDataList.add(tv);
        deviceDataList.add(radio);
        deviceDataList.add(coffeeMaker);
        deviceDataList.add(microwave);
        deviceDataList.add(PC);
        deviceDataList.add(airConditioning);
        deviceDataList.add(lightsKitchen);
        deviceDataList.add(oven);
        deviceDataList.add(lightsFrontDoor);
        deviceDataList.add(lightsLivingDoor);
        deviceDataList.add(lightsRoom);
        deviceDataList.add(curtainsRoom);


        //Instructions
        ArrayList<Device> deviceInstructionList = new ArrayList<Device>();
        Device lightsFrontDoorI = new IntesityDevice("lightsFrontDoor", on, 75);
        Device tvI = new OnOffDevice("tv", on);
        Device lightsLivingDoorI = new IntesityDevice("lightsLivingDoor", on,40);

        deviceInstructionList.add(lightsFrontDoorI);
        deviceInstructionList.add(tvI);
        deviceInstructionList.add(lightsLivingDoorI);


        Sensor openFrontDoor = new ActionSensor(deviceInstructionList);
        openFrontDoor.turnOnSensor(deviceDataList);



        printArray(deviceDataList);







        // A State ---> B notifyState
        // B notifyState Observa --> State, Observador, y el sujeto(Observable)
        // notify es observador
        // device es observado(sujeto)
//        ArrayList<Device> deviceList = new ArrayList<Device>();
//        ReadDeviceFile read = new ReadDeviceFile();
//        deviceList = read.ReadFile();
//
//        Sensors frontDoorOpen = new Sensors("lights","on","tv","on");
//        frontDoorOpen.turnOnSensor(deviceList);

//        deviceList.get(0).changeState("door", "close"); // el disparador

    }
}
