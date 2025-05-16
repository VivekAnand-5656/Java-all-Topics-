public class RandomNumber {
    public int randomNum(){
        return (int) (Math.random()*9);
    }
    public static void main(String[] args) {
        RandomNumber num = new RandomNumber();
        System.out.println("Random : "+num.randomNum());
    }
}
