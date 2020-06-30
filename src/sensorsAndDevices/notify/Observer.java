package sensorsAndDevices.notify;

import sensorsAndDevices.Device;

public interface Observer { //
    public void update(Device device);// actualizar cuando el sujeto dispare un evento cuando el device notifique al notify que se va a actualizar
}
