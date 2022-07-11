import java.util.Scanner;

public class FindMaxArray_2 {
    public static void main(String[] args) {
        int sizeHeight = 5;
        int sizeWidth = 5;
        double max;
        double[][] myarray = new double[sizeWidth][sizeHeight];
        Scanner input = new Scanner(System.in);
        System.out.println("Enter value Array ");
        for (int i = 0; i < sizeWidth; i++) {
            for (int j = 0; j < sizeHeight; j++) {
                myarray[i][j] = input.nextDouble();
            }
        }
        System.out.println("Array");
        for (int i = 0; i < myarray.length; i++) {
            for (int j = 0; j < myarray[i].length; j++) {
                System.out.print(myarray[i][j] + "  ");
            }
            System.out.println();
        }
        max = myarray[0][0];
        int indexi=0;
        int indexj = 0;
        for (int i = 0; i < myarray.length; i++) {
            for (int j = 0; j < myarray[i].length; j++) {
                if (max < myarray[i][j]) {
                    max = myarray[i][j];
                    indexi = i;
                    indexj = j;
                }
            }
        }
        System.out.println("Element max: " + max + " index: " + indexi + " . " + indexj);
    }
}
