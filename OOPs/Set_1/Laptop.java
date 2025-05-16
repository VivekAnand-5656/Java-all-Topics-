package OOPs.Set_1;

import java.util.Scanner;

public class Laptop {
    String brand;
    String processor;
    int ramSize;
    boolean isPowerOn;

    void powerOn(){
        if(isPowerOn==true){
            System.out.println("Powered On.");
        } else {
            System.out.println("Powered Off");
        }
    }
    void upgradeRam(int extraRAM){
        ramSize+=extraRAM;
        System.out.println("Total RAM: "+ramSize);
    }
    void showLaptopinfo(){
        System.out.println("Brand: "+brand+" Processor: "+processor+" RAM size: "+ramSize);
    }
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        Laptop det = new Laptop();
        System.out.println("Enter Brand: ");
        det.brand = inp.nextLine();
        System.out.println("Enter Processor: ");
        det.processor = inp.nextLine();
        System.out.println("Enter RAM size: ");
        det.ramSize = inp.nextInt();
        System.out.println("Enter Power :");
        det.isPowerOn = inp.nextBoolean();
        det.powerOn();
        System.out.println("Enter increase RAM size: ");
        int ram = inp.nextInt();
        det.upgradeRam(ram);
        det.showLaptopinfo();
    }
}
