import java.util.Scanner;

public class BinarySeachRecursive {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Size Of Array:");
        int size = input.nextInt();
        int[] myArray = new int[size];
        System.out.println("Enter value into array");
        for (int i = 0; i < myArray.length; i++) {
            System.out.print("Element " + i + ": ");
            myArray[i] = input.nextInt();
        }
        System.out.println("Display Array");
        for (int item : myArray) {
            System.out.print(item + "\t");
        }
        System.out.println("\nSort up");
        for (int i = 0; i < myArray.length - 1; i++) {
            int min = myArray[i];
            int index = i;
            for (int j = i + 1; j < myArray.length; j++) {
                if (min > myArray[j]) {
                    min = myArray[j];
                    index = j;
                }
            }
            myArray[index] = myArray[i];
            myArray[i] = min;
        }
        for (int item : myArray) {
            System.out.print(item + "\t");
        }
        System.out.println("\nEnter the number to search: ");
        int key = input.nextInt();
        int left = 0;
        int right = myArray.length - 1;
        int temp = binarySearch(myArray, key, left, right);
        if (temp == -1) {
            System.out.println("Not " + key + " in  Array");
        } else {
            System.out.println(" In array at position: " + temp);
        }

    }

    //    public static int binarySearch(int[] array, int key) {
//        int left = 0;
//        int right = array.length - 1;
//        while (right >= left) {
//            int mid = (left + right) / 2;
//            if (key == array[mid]) {
//                return mid;
//            } else if (key > array[mid]) {
//                left = mid + 1;
//            } else {
//                right = mid - 1;
//            }
//        }
//        return -1;
//    }
    public static int binarySearch(int[] array, int key, int left, int right) {
        if(right>=left) {
            int mid = (left + right) / 2;
            if (key == array[mid]) {
                return mid;
            } else if (key > array[mid]) {
                return binarySearch(array, key, mid + 1, right);
            } else {
                return binarySearch(array, key, left, mid - 1);
            }
        }
        return -1;
    }
}
