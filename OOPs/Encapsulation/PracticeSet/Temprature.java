package OOPs.Encapsulation.PracticeSet;

public class Temprature {
    private double celcious;
    public Temprature(double celcious){
        this.celcious = celcious;
    }
    public void setCelcious(double celcious){
        this.celcious = celcious;
    }
    public double getFahrenheit(){
        return (celcious * 9/5) +32;
    }
    public double getKelvin(){
        return  celcious + 273.15;
    }

    public static void main(String[] args) {
        Temprature temp = new Temprature(25.0);
        System.out.println("Fahrenheit: "+temp.getFahrenheit());
        System.out.println("Kelvin: "+temp.getKelvin());
//        Update
        temp.setCelcious(32.5);
        System.out.println("Update Fahrenheit: "+temp.getFahrenheit());
        System.out.println("Update Kelvin: "+temp.getKelvin());
    }
}
