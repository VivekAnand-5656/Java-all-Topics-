package OOPs.Interface.PracticeSet;

public interface RemoteControl {
    void turnOn();
    void turnOff();
}
class Television implements RemoteControl{
    public boolean isOn;
    Television(boolean isOn){
        this.isOn = isOn;
    }
    public void turnOn(){
        if(isOn == true){
            System.out.println("Televesion On");
        }
    }
    public void turnOff(){
        if(isOn!= true){
            System.out.println("Television Off");
        }
    }
}
class Fan implements RemoteControl{
    public boolean isOn;
    Fan (boolean isOn){
        this.isOn = isOn;

    }
    public void turnOn(){
        if(isOn == true){
            System.out.println("Fan On");
        }
    }
    public void turnOff(){
        if(isOn != true){
            System.out.println("Fan Off");
        }
    }

    public static void main(String[] args) {
        Television tv = new Television(false);
        tv.turnOn();
        tv.turnOff();
        Fan fn = new Fan(true);
        fn.turnOn();
        fn.turnOff();
    }
}
