public class Circle {
    private static double radius = 1.0;
    private String color = "red";

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    static double getRadius() {
        return radius;

    }

    static double getArea() {
        return radius * radius * Math.PI;
    }
}
