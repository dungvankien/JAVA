package interfaceColorable;

import comparable.Circle;
import comparable.Rectangle;
import comparable.Shape;
import comparable.Square;

public class MainTestColorable {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(4);
        shapes[1] = new Rectangle(4, 2);
        shapes[2] = new Square(6);
        for (Shape shape : shapes) {
            System.out.println(shape);
            if (shape instanceof Square) {
                System.out.println(((Square) shape).getArea());
                ((Square) shape).howToColor();
            }
        }
    }
}
