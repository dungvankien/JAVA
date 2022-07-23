package circle;

public class TestCircle {
    public static void main(String[] args) {
        Cylinder cylinder=new Cylinder(3.0,4);
        System.out.println(cylinder);
        cylinder=new Cylinder(6.0,"black",9.0);
        System.out.println(cylinder);
        Circle circle=new Circle(4.0,"pink");
        System.out.println(circle);
    }
}
