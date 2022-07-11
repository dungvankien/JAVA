import java.util.Scanner;

public class DeleteElementInArray {
    public static void main(String[] args) {
        int[] myArray;
        int size, x;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter array size: ");
        size = input.nextInt();
        myArray = new int[size];
        for (int i = 0; i < myArray.length; i++) {
            System.out.print("Enter element " + i + ":\t");
            myArray[i] = input.nextInt();
        }
        System.out.println("My Array: ");
        for (int item : myArray) {
            System.out.print(item + "\t");
        }
        System.out.println("\nEnter the element to delete ");
        x = input.nextInt();
        int[] newArray = deleteElement(x, myArray);
        System.out.println("New Array");
        for (int item : newArray) {
            System.out.print(item + "\t");
        }

    }

    public static int[] deleteElement(int number, int[] array) {
        int index;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == number) {
                index = i;
                for (; i < array.length - 1; i++) {
                    array[i] = array[i + 1];
                }
                i = index - 1;
            }
        }
        return array;
    }
}
