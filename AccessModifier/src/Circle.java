public class Circle {
    private static double radius = 1.0;
    private final String color = "red";

    public Circle() {
    }

    public Circle(double radius) {
        Circle.radius = radius;
    }

    public static double getRadius() {
        return radius;

    }

    public static double getArea() {
        return radius * radius * Math.PI;
    }
}
