import java.util.Scanner;

public class AreaRectangle {
    public static void main(String[] args) {
        float width;
        float height;
        float area;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter width:");
        width = scanner.nextFloat();
        System.out.println("Emter height");
        height = scanner.nextFloat();
        area = width * height;
        System.out.println("Area Rectangle: " + area);
    }
}
