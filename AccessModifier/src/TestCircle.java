public class TestCircle {
    public static void main(String[] args) {
        System.out.println("radius: " + Circle.getRadius() + ", Area: " + Circle.getArea());
        Circle c = new Circle(4);
        System.out.println("radius: " + Circle.getRadius() + ", Area: " + Circle.getArea());

    }
}
