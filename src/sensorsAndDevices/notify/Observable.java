package sensorsAndDevices.notify;

import sensorsAndDevices.Device;

public interface Observable {
    public void sendNotify();// avisar que esta cambiando de estado y hay que mandar la notificacion
}
