import java.util.Scanner;

public class InterestCalculator {
    public static void main(String[] args) {
        double myMoney;
        int  month;
        double interestRate;
        double totalInterest;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter investment amount:");
        myMoney = scanner.nextDouble();
        System.out.println("Enter number of months:");
        month = scanner.nextInt();
        System.out.println("Enter annual interest rate in percentage:");
        interestRate = scanner.nextDouble();

        totalInterest = myMoney * month * interestRate / 100 / 12;
        System.out.println("Total of interest: " + totalInterest);
    }
}
