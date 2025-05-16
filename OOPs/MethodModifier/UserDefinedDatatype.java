package OOPs.MethodModifier;
// Object
public class UserDefinedDatatype {
    public String msg;
    public int a;
    UserDefinedDatatype(String msg,int a){
        this.msg=msg;
        this.a=a;
        System.out.println(msg+" "+a);
    }
    UserDefinedDatatype getObject(){
        return new UserDefinedDatatype("Welcome to Coding ",56);
    }

   public static void main(String[] args) {
        UserDefinedDatatype user = new UserDefinedDatatype("Vivek Anand",56);
        UserDefinedDatatype newUser = user.getObject();

   }
}
