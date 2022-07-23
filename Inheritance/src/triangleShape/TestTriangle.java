package triangleShape;

import java.util.Scanner;

public class TestTriangle {
    public static void main(String[] args) {
        double side1;
        double side2;
        double side3;
        String color;

        do {
            System.out.print("Enter the length of side 1 of the triangle: ");
            side1 = side();
            if (side1 <= 0.0) {
                System.out.println("Re-enter data");
            }
        } while (side1 <= 0.0);

        do {
            System.out.print("Enter the length of side 2 of the triangle: ");
            side2 = side();
            if (side2 <= 0.0) {
                System.out.println("Re-enter data");
            }
        } while (side2 <= 0.0);

        do {
            System.out.print("Enter the length of side 3 of the triangle: ");
            side3 = side();
            if (side3 <= 0.0) {
                System.out.println("Re-enter data");
            }
        } while (side3 <= 0.0);

        do {
            System.out.print("Enter triangle color: ");
            Scanner input = new Scanner(System.in);
            color = input.nextLine();
            if (checkColor(color) != null) {
                System.out.println("Re-enter data");
            }
        } while (checkColor(color) != null);

        Triangle triangle1 = new Triangle();
        System.out.println(triangle1);
        Triangle triangle2 = new Triangle(side1, side2, side3, color);
        System.out.println(triangle2);
    }

    public static double side() {
        try {
            Scanner input = new Scanner(System.in);
            return input.nextDouble();
        } catch (Exception e) {
            System.out.println("Enter error data");
            return -1;
        }

    }

    public static String checkColor(String color) {
        try {
            Double.parseDouble(color);
            return "Enter error data";
        } catch (Exception e) {
            return null;
        }
    }
}
