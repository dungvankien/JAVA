import java.util.Scanner;

public class LeastCommonMultiple {
    public static void main(String[] args) {
        int number1;
        int number2;
        int number3;
        int common;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 1st integer: ");
        number1 = scanner.nextInt();
        System.out.println("Enter 2nd integer: ");
        number2 = scanner.nextInt();
        System.out.println("Enter 3rd integer: ");
        number3 = scanner.nextInt();
        if (number1 > number2 && number1 > number3) {
            common = number1;
            do {
                if (common % number1 == 0 && common % number2 == 0 && common % number3 == 0) {
                    break;
                }
                common = common + 1;
            }
            while (common < (Math.pow(2, 31) - 1));
        } else if (number2 > number3) {
            common = number2;
            do {
                if (common % number1 == 0 && common % number2 == 0 && common % number3 == 0) {
                    break;
                }
                common = common + 1;
            }
            while (common < (Math.pow(2, 31) - 1));
        } else {
            common = number3;
            do {
                if (common % number1 == 0 && common % number2 == 0 && common % number3 == 0) {
                    break;
                }
                common = common + 1;
            }
            while (common < (Math.pow(2, 31) - 1));
        }
        System.out.println("Least Common Multiple " + "1st: " + number1 + "  2nd: " + number2 + "  3rd: " + number3 + "  Result: " + common);
    }
}
