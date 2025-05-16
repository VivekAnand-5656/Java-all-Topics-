package OOPs.MutatorMethod;

public class NewStudent {
    private String name;
    private String mail;
    private long mobileNum;
    public void setName(String name,String mail,long mobileNum){
        this.name=name;
        this.mail=mail;
        this.mobileNum=mobileNum;
    }
    public String getName(){
        return name;
    }
    public String getMail(){
        return mail;
    }

   public long getMobileNum(){
        return mobileNum;
   }
    public static void main(String[] args) {
        NewStudent det = new NewStudent();
        det.setName("Vivek Anand","va691187@gmail.com",1234567890);
        System.out.println("Name: "+det.getName()+" mail: "+det.getMail()+" Mobile Num: "+det.getMobileNum());
    }
}
