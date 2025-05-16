package OOPs.Set_1;

public class MobilePhone {
    public String brand;
    public String model;
    public int batteryLevel;
    public boolean isOn;
    public int totalUsage;
    public void tornOn(){
        if (isOn==true){
            System.out.println("Hello Moto Switched On");
        } else {
            System.out.println("Switched Off.");
        }
    }
    public void usePhone(int minutes){
        totalUsage = minutes * 1;
        batteryLevel-=totalUsage;
        System.out.println("Batter Level: "+batteryLevel);
    }
    public void chargePhone(int amuont){
        totalUsage+=amuont;
        System.out.println("Charge Phone : "+totalUsage);
    }
    public static void main(String[] args) {
        MobilePhone check = new MobilePhone();
        check.isOn=false;
        check.tornOn();
        check.batteryLevel = 50;
        int min = 20;
        check.usePhone(min);
        int amt = 50;
        check.chargePhone(amt);
    }
}
