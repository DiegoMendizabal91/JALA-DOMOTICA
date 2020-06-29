import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
public class ReadDeviceFile {
    public static ArrayList<Device> ReadFile() {
        ArrayList<Device> lines = new ArrayList<Device>();
        try {
            //the file to be opened for reading
            FileInputStream fis = new FileInputStream("F:/JALA/Domotica/JALA-DOMOTICA/src/DeviceList.txt");
            Scanner sc = new Scanner(fis);    //file to be scanned
            //returns true if there is another line to read

            while (sc.hasNextLine()) {
                String line = sc.nextLine();
//                lines.add(new Device(line));
            }
            sc.close();     //closes the scanner
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return lines;
    }
}