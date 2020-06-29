public class OnOffDevice extends Device {
    public OnOffDevice(String name, boolean condition) {
        this.name = name;
        this.condition = condition;
        Notify notify = new Notify();
        linkObserver(notify);
    }

    public void changeCondition(boolean condition) {
        // Change device state
        setCondition(condition);
        sendNotify(this);
    }

    @Override
    public void printDevice(){
        String boolString;
        if (condition){
            boolString = "On";
        } else{
            boolString = "Off";
        }
        System.out.println(String.format("device: %s, condition: %s", name, boolString));
    }
}
