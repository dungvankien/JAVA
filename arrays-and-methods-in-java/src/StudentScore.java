import java.util.Scanner;

public class StudentScore {
    public static void main(String[] args) {
        int size;
        Scanner input = new Scanner(System.in);
        do {
            System.out.println("Enter a size:");
            size = input.nextInt();
            if (size > 30) {
                System.out.println("Size should not exceed 30");
            }
        } while (size > 30);
        double[] array = new double[size];
        for (int i = 0; i < array.length; i++) {
            System.out.print("enter a mark for student " + (i + 1) + ": ");
            array[i] = input.nextDouble();
        }
        int count = 0;
        System.out.println("List of mark");
        for (double v : array) {
            System.out.print(v + "\t");
            if (v >= 5 && v <= 10) {
                count++;
            }
        }
        System.out.println("\nThe number of students passing the exam ís " + count);
    }
}
