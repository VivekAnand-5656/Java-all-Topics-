package Strings;

public class Comparison {
//    String name;
//    String check;
//    void checkStr(String name,String check){
//        this.name=name;
//        this.check=check;
//        if(name==check){
//            System.out.println("Both are Same.");
//        } else {
//            System.out.println("Both are not Same!");
//        }
//    }

    public static void main(String[] args) {
//        Comparison cmp = new Comparison();
//        cmp.checkStr("Vivek","Vivek Anand");
//        its check by vlaue
        String name="Vivek";
        String newName="Vivek Anand";
        if(name.equals(newName)){
            System.out.println("Both are Same.");
        } else {
            System.out.println("Not Same!");
        }
    }
}
