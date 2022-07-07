import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        double bmi, weight, height;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Emter a Weight (KG)!");
        weight = scanner.nextDouble();
        System.out.println("Enter a height!(met)");
        height = scanner.nextDouble();
        bmi = weight / (height * height);

        if (bmi >= 30.0) {
            System.out.println("BMI= " + bmi + " You are Obese");
        } else if (bmi >= 25.0) {
            System.out.println("BMI= " + bmi + " You are Overweight");
        } else if (bmi >= 18.5) {
            System.out.println("BMI= " + bmi + " You are Normal");
        } else {
            System.out.println("BMI= " + bmi + " You are Underweight");
        }
    }
}
