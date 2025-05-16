package Loops.Label;

public class Q1 {
    public static void main(String[]args){
        outer:for(int i=1;i<=5;i++){
            inner:for(int j=1;j<=5;j++){
                if(j==2){
//                    continue outer;
                    continue inner;
                }
                System.out.println(i + " " + j);
            }
            System.out.println("");
        }
    }
}
