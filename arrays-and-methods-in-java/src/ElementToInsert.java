import java.util.Scanner;

public class ElementToInsert {
    public static void main(String[] args) {
        int[] myArray = {1, 4, 5, 6, 7, 3, 4, 2, 9};
        int[] newArray;
        Scanner input = new Scanner(System.in);
        System.out.println("index from: " + 0 + " to " + (myArray.length));
        System.out.println("Enter Element:");
        int element = input.nextInt();
        int index;
        do {
            System.out.println("Enter index:");
            index = input.nextInt();
        } while (index < 0 || index > myArray.length);
        newArray = new int[(myArray.length + 1)];
        for (int i = 0, j = 0; i < myArray.length; i++, j++) {
            if (index == i) {
                newArray[j] = element;
                j++;
            }
            newArray[j] = myArray[i];
            if (index == myArray.length) {
                newArray[index] = element;
            }
        }
        System.out.println("Old Array");
        for (int item : myArray) {
            System.out.print(item + "\t");
        }
        System.out.println("\nNew Array");
        for (int item : newArray) {
            System.out.print(item + "\t");
        }
    }
}
