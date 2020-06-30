package sensorsAndDevices;

import sensorsAndDevices.factory.DeviceFactory;
import sensorsAndDevices.factory.SensorFactory;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class ReadManager {

    public static ArrayList<Device> ReadDevicesFile() {
        DeviceFactory deviceFactory = new DeviceFactory();
        ArrayList<Device> deviceList = new ArrayList<Device>();
        try {
            //the file to be opened for reading
            FileInputStream fis = new FileInputStream("src/resources/DeviceList.txt");
            Scanner sc = new Scanner(fis);    //file to be scanned
            //returns true if there is another line to read

            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                Device device = deviceFactory.getDevice(line);
                deviceList.add(device);
            }
            sc.close();     //closes the scanner
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return deviceList;
    }

    public static ArrayList<String> ReadSensorsFile() {
        ArrayList<String> lineList = new ArrayList<String>();
        try {
            //the file to be opened for reading
            FileInputStream fis = new FileInputStream("src/resources/SensorList.txt");
            Scanner sc = new Scanner(fis);    //file to be scanned
            //returns true if there is another line to read
            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                lineList.add(line);
            }
            sc.close();     //closes the scanner
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return lineList;
    }

    public ArrayList<Sensor> setSensorList(ArrayList<String> lineList){
        String sensorName="";
        String trigger="";
        String action="";
        DeviceFactory deviceFactory = new DeviceFactory();
        SensorFactory sensorFactory = new SensorFactory();
        ArrayList<Device> instructionList = new ArrayList<Device>();
        ArrayList<Sensor> sensorList = new ArrayList<Sensor>();
        for(int i=0; lineList.size() > i; i++){
            String[] split = lineList.get(i).split(",");
            if(split[0].equals("*")){
                sensorName = split[1];
                trigger = split[2];
                action = split[3];
            } else if(!(split[0].equals("."))){
                Device device = deviceFactory.getDevice(lineList.get(i));
                instructionList.add(device);
            }
            if(split[0].equals(".")){
                ArrayList<Device> copy = new ArrayList<Device>();
                for (Device s:instructionList) {
                    copy.add(s);
                }
                Sensor sensor = sensorFactory.getSensor(sensorName, trigger, action, copy);
                sensorList.add(sensor);
                instructionList.clear();
            }
        }
        return sensorList;
    }
}