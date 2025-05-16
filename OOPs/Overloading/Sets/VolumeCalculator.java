package OOPs.Overloading.Sets;

public class VolumeCalculator {
    int volume(int side){
        int cube = side*side*side;
        return cube;
    }
    int volume(int len,int breadth,int height){
        int cuboid = len*breadth*height;
        return cuboid;
    }
    double volume(double radius,double height){
        double cylinder = 3.14*radius*radius*height;
        return cylinder;
    }
    public static void main(String[] args) {
        VolumeCalculator vl = new VolumeCalculator();
        System.out.println("Cube: "+vl.volume(5));
        System.out.println("Cuboid: "+vl.volume(5,6,10));
        System.out.println("Cylinder: "+vl.volume(2.0,5.0));
    }
}
