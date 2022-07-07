import java.util.Scanner;

public class Hello {
    public static void main(String[] args) {
        String fullName;
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Enter your name: ");
        fullName = scanner.nextLine();
        System.out.println("Hello: " + fullName);

    }
}
