package geometry;

public class TestMain {
    public static void main(String[] args) {
        Shape shape=new Shape();
        System.out.println(shape);
        Shape shape1=new Shape("red",false);
        System.out.println(shape1);
        Circle circle=new Circle();
        System.out.println(circle);
        circle=new Circle(3.5);
        System.out.println(circle);
        circle=new Circle(3.5,false,"black");
        System.out.println(circle);
        Rectangle rectangle=new Rectangle();
        System.out.println(rectangle);
        rectangle=new Rectangle(2.3,5.8);
        System.out.println(rectangle);
        rectangle=new Rectangle(2.5, 3.8,true,"orange");
        System.out.println(rectangle);
        Square square=new Square();
        System.out.println(square);
        square=new Square(2.4);
        System.out.println(square);
        square=new Square(4,"pink",true);
        System.out.println(square);
        System.out.println("dien tich: "+square.getArea()+", chu vi: "+square.getPerimeter());

    }
}
