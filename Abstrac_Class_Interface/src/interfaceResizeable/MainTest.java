package interfaceResizeable;

import comparable.Circle;
import comparable.Rectangle;

public class MainTest {
    public static void main(String[] args) {
        double percent = (Math.random() * 100) + 1;
        Circle[] circle = new Circle[3];
        circle[0] = new Circle(4);
        circle[1] = new Circle(6);
        circle[2] = new Circle(2);

        System.out.println("Circle");
        for (Circle item : circle) {
            item.resize(percent);
        }

        Rectangle[] rectangles = new Rectangle[3];
        rectangles[0] = new Rectangle(2, 4);
        rectangles[1] = new Rectangle(1, 5);
        rectangles[2] = new Rectangle(4, 6);

        System.out.println("Rectangle");
        for (Rectangle rectangle : rectangles) {
            rectangle.resize(percent);
        }
    }
}
