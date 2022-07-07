import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        int year;
        boolean checkLeap;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a year: ");
        year = scanner.nextInt();
        if (year % 4 == 0 && (year % 100) != 0) {
            checkLeap = true;
        } else if ((year % 100 == 0) && (year % 400 == 0)) {
            checkLeap = true;
        } else {
            checkLeap = false;
        }
        if (checkLeap) {
            System.out.println(year + " is a leap year!");
        } else {
            System.out.println(year + "is not a leap year!");
        }
    }
}
