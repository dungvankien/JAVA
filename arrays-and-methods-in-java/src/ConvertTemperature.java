import java.util.Scanner;

public class ConvertTemperature {
    public static void main(String[] args) {
        int choice;
        double fahrenheit;
        double celsius;
        System.out.println("Menu\n1. Fahrenheit to Celsius\n2. Celsius to Fahrenheit\n0. Exit");
        Scanner input = new Scanner(System.in);
        do {
            System.out.println("Enter your choice");
            choice = input.nextInt();
            System.out.println();
            if (choice < 0 || choice > 2) {
                System.out.println("No list!");
                System.out.println("Enter your choice");
                choice = input.nextInt();
            }
            switch (choice) {
                case 1:
                    System.out.println("Enter Fahrenheit");
                    fahrenheit = input.nextDouble();
                    System.out.println("Fahrenheit to celsius: " + fahrenheitToSelsius(fahrenheit));
                    break;
                case 2:
                    System.out.println("Enter Celsius: ");
                    celsius = input.nextDouble();
                    System.out.println("Celsius to fahrenheit: " + celsiusToFahrenheit(celsius));
                    break;
                case 0:
                    System.exit(0);
            }
        } while (true);
    }

    public static double celsiusToFahrenheit(double celsius) {
        return 9.0 * celsius / 5.0 + 32;
    }

    public static double fahrenheitToSelsius(double fahrenheit) {
        return (5.0 / 9) * (fahrenheit - 32);
    }
}

