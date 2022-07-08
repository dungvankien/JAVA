import java.util.Scanner;

public class CheckPrime {
    public static void main(String[] args) {
        int myNumber;
        boolean flag = true;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Number: ");
        myNumber = scanner.nextInt();

        if (myNumber > 1) {
            for (int i = 2; i < myNumber; i++) {
                if (myNumber % i == 0) {
                    flag = false;
                    break;
                }
            }
        } else {
            flag = false;
        }

        if (flag) {
            System.out.printf("Is Prime %d", myNumber);
        } else {
            System.out.printf("Not Prime %d", myNumber);
        }
    }
}
