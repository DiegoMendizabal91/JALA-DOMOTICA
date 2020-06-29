import java.util.ArrayList;


public class Main {



    public static void main(String[] args) {

        Simulator simulate = new Simulator();
        simulate.startSimulation();

//        ReadManager read = new ReadManager();
//        //Loading Device Data
//        ArrayList<Device> deviceDataList = new ArrayList<Device>();
//        deviceDataList = read.ReadDevicesFile();
//
//        //Loading sensors data
//        ArrayList<String> lineList = new ArrayList<String>();
//        ArrayList<Sensor> sensorList = new ArrayList<Sensor>();
//
//        lineList=read.ReadSensorsFile();
//        sensorList=read.setSensorList(lineList);
//
//        //Simulator
//        //I Arrive at house I open the front door
//        String Action = "frontDoorOpen";
//        sensorList.get(0).turnOnSensor(deviceDataList, Action);
//        //lightsEntrance,on,100
//        //lightsLivingRoom,on,75
//        //livingRoomTv,on
//        //airConditioning,on,25
//        //livingRoomWindow,open
//        //livingRoomCurtains,open
//        //I want to dinner, I Manually set the dinner mode
//        sensorList.get(0).turnOnSensor(deviceDataList);
//        //lightsLivingRoom,off,75
//        //lightsKitchen,on,95
//        //radio,on
//        //coffeeMaker,on
//        //livingRoomTv,off
//        //kitchenWindow,open
//        //it starts to get hot I turn off the air conditioning
//        deviceDataList.get(15).changeCondition(false,23);
//        //I want to watch a movie, I Manually set the cinema mode
//        sensorList.get(0).turnOnSensor(deviceDataList);
//        //lightsKitchen,off,95
//        //radio,off
//        //livingRoomTv,on
//        //livingRoomWindow,close
//        //livingRoomCurtains,close
//        //It start to get cold, automatically the temperature sensor turns on
//        sensorList.get(0).turnOnSensor(deviceDataList, 17);
//
//
//
//        sensorList.get(0).turnOnSensor(deviceDataList, "frontDoorOpen");
//        sensorList.get(1).turnOnSensor(deviceDataList, "frontDoorOpen2");
//        utilities.printArray(deviceDataList);

    }
}
