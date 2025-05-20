package OOPs.Inheritance.Set_1;

public class Device {
    String deviceName = "Samsung Galaxy";
    void showInfo(){
        System.out.println("Device Name: "+deviceName);
    }
}
class Mobile extends Device{
    String os = "Android";
    void showInfo(){
        super.showInfo();
        System.out.println("Operating System: "+os);
    }

    public static void main(String[] args) {
        Mobile obj = new Mobile();
        obj.showInfo();
    }
}
