package OOPs;

public class ReturnObject {
    String message;
    ReturnObject (String message){
        this.message=message;
    }
    ReturnObject getObject(){
        return new ReturnObject("Return an object");
    }

    public static void main(String[] args) {
        ReturnObject obj = new ReturnObject("Hello");
        ReturnObject newObj = obj.getObject();
        System.out.println(newObj.message);
    }

}
