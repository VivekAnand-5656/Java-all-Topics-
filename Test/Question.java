package Test;

public class Question {
    public int sum(int num,int num2){
        int s = num+num2;
        return s;
    }
    public double sum(int num,int num2,int num3){
        int s2 = num+num2+num3;
        return s2;
    }
    public static void main(String[] args) {
        Question rep = new Question();
        System.out.println(rep.sum(2,5));
        System.out.println(rep.sum(2,5,7));
    }
}
