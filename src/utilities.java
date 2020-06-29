import java.util.ArrayList;

public class utilities {
    public static void printArray(ArrayList<Device> deviceDataList){

        System.out.println("************ Device General Status ************");

        for (int i=0; i < deviceDataList.size(); i++) {
            deviceDataList.get(i).printDevice();
        }
    }
}
