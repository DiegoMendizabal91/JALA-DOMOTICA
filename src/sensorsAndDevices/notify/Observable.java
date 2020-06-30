package sensorsAndDevices.notify;

import sensorsAndDevices.Device;

public interface Observable {
    public void sendNotify(Device device);// avisar que esta cambiando de estado y hay que mandar la notificacion
}
