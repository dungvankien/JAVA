import java.util.Scanner;

public class FindMaxArray {
    public static void main(String[] args) {
        int size;
        int[] array;
        int max, i, index = 0;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Emter a size on array:");
            size = scanner.nextInt();
            if (size > 20) {
                System.out.println("Size should not exceed 20");
            }
        } while (size > 20);
        array = new int[size];
        for (i = 0; i < array.length; i++) {
            System.out.print("Enter element " + (i + 1) + " : ");
            array[i] = scanner.nextInt();
        }
        System.out.println("Property list:");
        for (i = 0; i < array.length; i++) {
            System.out.print(array[i] + "\t");
        }
        max = array[0];
        for (i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
                index = i;
            }
        }
        System.out.println("\nThe largest property value in the list is: " + max + " ,at position: " + index);
    }
}
