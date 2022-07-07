import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double a;
        double b;
        double c;
        double answer;

        System.out.println("Linear Equaton Resolver");
        System.out.println("Given a equation as a*x + b =c, please enter constants;");
        Scanner obj = new Scanner(System.in);
        System.out.println("a: ");
        a = obj.nextDouble();
        System.out.println("b: ");
        b = obj.nextDouble();
        System.out.println("c: ");
        c = obj.nextDouble();

        if (a != 0) {
            answer = (c - b) / a;
            System.out.println("Equation pass with x= " + answer);
        } else {
            if (b == c) {
                System.out.println("The solution is all x");
            } else {
                System.out.println("No solution");
            }
        }
    }
}
