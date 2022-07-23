package point;

import java.util.Arrays;

public class TestPoint {
    public static void main(String[] args) {
        Point2D point2D=new Point2D();
        System.out.println(point2D);
        point2D=new Point2D(5f,6f);
        System.out.println(point2D);
        Point3D point3D=new Point3D();
        System.out.println(point3D);
        point3D=new Point3D(3.0f,6.3f,9.7f);
        System.out.println(point3D);
    }


}
