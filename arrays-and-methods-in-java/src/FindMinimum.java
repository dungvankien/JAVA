import java.util.Scanner;

public class FindMinimum {
    public static void main(String[] args) {
        int size;
        int[] array;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter size array");
        size = input.nextInt();
        array = new int[size];
        for (int i = 0; i < array.length; i++) {
            System.out.print("Enter element " + i + ": ");
            array[i]=input.nextInt();
        }
        System.out.print("Array: ");
        for(int k:array){
            System.out.print(k+"\t");
        }
        int index=miniValue(array);
        System.out.println("\nThe smallest element in the array is: "+array[index]);
    }

    public static int miniValue(int[] array) {
        int index = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[index] > array[i]) {
                index = i;
            }
        }
        return index;
    }

}

