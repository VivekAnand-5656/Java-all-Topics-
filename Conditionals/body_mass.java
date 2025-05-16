package Conditionals;

import java.util.*;

//Develop a program to categorize a person's Body Mass Index (BMI) using else-if:
//        ● BMI < 18.5: Underweight
// ● BMI 18.5- 24.9: Normal
// ● BMI 25- 29.9: Overweight
// ● BMI >= 30: Obese
public class body_mass {
    public static void main(String[]args){
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter BMI:");
        float bmi = inp.nextFloat();
        if(bmi<=18.5){
            System.out.println("Underweight");
        } else if(bmi<=24.9){
            System.out.println("Normal");
        } else if(bmi<=29.9){
            System.out.println("Overweight");
        } else if(bmi>=30){
            System.out.println("Obese");
        }
    }
}
