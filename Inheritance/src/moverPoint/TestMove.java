package moverPoint;

public class TestMove {
    public static void main(String[] args) {
        Point point=new Point(4.0f,5.0f);
        System.out.println(point);
        MoveablePoint mv=new MoveablePoint(2.0f,6.0f);
        System.out.println(mv);
        mv=new MoveablePoint(3.0f,3.0f,4.0f,3.0f);
        System.out.println(mv);
        System.out.println(mv.move());



    }
}
