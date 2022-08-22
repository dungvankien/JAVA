package triangleException;

import java.util.Scanner;

public class TriangleException {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập 3 cạnh của tam giác");
        System.out.println("Cạnh a: ");
        double a = scanner.nextDouble();
        System.out.println("Cạnh b: ");
        double b = scanner.nextDouble();
        System.out.println("Cạnh c: ");
        double c = scanner.nextDouble();
        TriangleException triangleException = new TriangleException();
        triangleException.checkTriangle(a, b, c);

    }

    public void checkTriangle(double a, double b, double c) {
        try {
            if (a > 0 && b > 0 && c > 0 && (a + b) > c && (a + c) > b && (b + c) > a){
                System.out.println("ĐÓ là 3 cạch của tam giác");
            } else {
                throw new RuntimeException();
            }
        } catch (Exception e ) {
            System.out.println("Không phải 3 cạch của tamg giác");
        }
    }
}
