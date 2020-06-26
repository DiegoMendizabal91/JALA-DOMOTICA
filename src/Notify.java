import java.util.ArrayList;

public class Notify implements Observer {


    @Override
    public void update(String name, String state) {
        // action a realizar depues de que se entera que hubo un cambio
        System.out.println(String.format("Cambio en el dispositivo %s con el estado %s", name, state));
    }
}
