package OOPs.Encapsulation.Set_1;

import java.util.Scanner;

public class CarRunning {
    private double speed;
    public void setSpeed(double speed){
        if(speed>0){
            this.speed =speed;
        }
    }
    public void accelerate(){
            speed+=10;
            System.out.println("Current Speed: "+speed);

    }
    public void brek(){
            speed-=10;
            System.out.println("Current Speed: "+speed);

    }

    public static void main(String[] args) {
        CarRunning run = new CarRunning();
        run.setSpeed(120);
        run.accelerate();
        run.brek();
        run.brek();
        run.accelerate();
    }
}
