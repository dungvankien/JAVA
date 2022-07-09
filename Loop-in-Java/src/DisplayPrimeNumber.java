import java.util.Scanner;

public class DisplayPrimeNumber {
    public static void main(String[] args) {
        int count = 0;
        int myNumber;
        int i = 2;
        int j;
        boolean flag;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of primes!");
        myNumber = input.nextInt();

        while (count < myNumber) {
            flag = true;
            for (j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    flag = false;
                    break;
                }

            }
            if (flag) {
                count++;
                System.out.print(" " + i);
            }
            i += 1;
        }

        System.out.println("\n Primes Number less than 100!");

        i = 2;
        while (i < 100) {
            flag = true;
            for (j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    flag = false;
                    break;
                }
            }

            if (flag) {
                System.out.print(" " + i);
            }
            i += 1;
        }
    }
}