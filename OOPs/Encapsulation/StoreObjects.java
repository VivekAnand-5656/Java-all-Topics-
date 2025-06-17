package OOPs.Encapsulation;

import OOPs.PersonalPractice.BankDetail;

public class StoreObjects {

    public static void main(String[] args) {
        CarWala obj = new CarWala();
        obj.setBrand("Toyota",200,60);
        System.out.println("Brand: "+obj.getBrand());
        System.out.println("Speed: "+obj.getSpeed());
        System.out.println("Fuel: "+obj.getFuel());
//      ------
        BankDetail bank = new BankDetail();
        bank.setHolderName("Vivek Anand","85471425369",8569);
        bank.login();
        bank.show();

    }
}
