package sensorsAndDevices.simulation;

import sensorsAndDevices.Device;
import sensorsAndDevices.ReadManager;
import sensorsAndDevices.Sensor;
import sensorsAndDevices.typeOfSensors.ActivationSensor;
import utilities.utilities;

import java.util.ArrayList;

public class Simulator {

    public void startSimulation(){
        ActivationSensor activationSensor = new ActivationSensor();
        ReadManager read = new ReadManager();
        //Loading sensorsAndDevices.Device Data
        ArrayList<Device> deviceDataList = new ArrayList<Device>();
        deviceDataList = read.ReadDevicesFile();

        //Loading sensors data
        ArrayList<String> lineList = new ArrayList<String>();
        ArrayList<Sensor> sensorList = new ArrayList<Sensor>();

        lineList=read.ReadSensorsFile();
        sensorList=read.setSensorList(lineList);

        //sensorsAndDevices.typeOfDevices.OpenCloseDevice.Simulator
        //I Arrive at house I open the front door
        String Action = "frontDoorOpen";
        activationSensor.activateSensor(deviceDataList,"openFrontDoor",sensorList,"frontDoorOpen");
        //lightsEntrance,on,100
        //lightsLivingRoom,on,75
        //livingRoomTv,on
        //airConditioning,on,25
        //livingRoomWindow,open
        //livingRoomCurtains,open
        //I want to dinner, I Manually set the dinner mode
        activationSensor.activateSensor(deviceDataList,"kitchenMode",sensorList);
        //lightsLivingRoom,off,75
        //lightsKitchen,on,95
        //radio,on
        //coffeeMaker,on
        //livingRoomTv,off
        //kitchenWindow,open
        //it starts to get hot I turn off the air conditioning
        activationSensor.changeSingleDevice("airConditioning",deviceDataList,false,17);
        //I want to watch a movie, I Manually set the cinema mode
        activationSensor.activateSensor(deviceDataList,"cinemaMode",sensorList);
        //lightsKitchen,off,95
        //radio,off
        //livingRoomTv,on
        //livingRoomWindow,close
        //livingRoomCurtains,close
        //It start to get cold, automatically the temperature sensor turns on
        activationSensor.activateSensor(deviceDataList,"temperatureTurnOn",sensorList,17);


        utilities.printArray(deviceDataList);
    }
}
