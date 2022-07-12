import java.util.Scanner;

public class SumColumnArray {
    public static void main(String[] args) {
        double[][] myArray;
        int column, row;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter two-dimensional array size");
        System.out.println("Emter row: ");
        row = input.nextInt();
        System.out.println("Enter column");
        column = input.nextByte();
        System.out.println("Enter value into array");
        myArray = new double[row][column];
        for (int i = 0; i < myArray.length; i++) {
            for (int j = 0; j < myArray[i].length; j++) {
                myArray[i][j] = input.nextDouble();
            }
        }
        System.out.println("Display array");
        for (double[] doubles : myArray) {
            for (double aDouble : doubles) {
                System.out.print(aDouble + "\t");
            }
            System.out.println();
        }
        int indexCol;
        do {
            System.out.println("Enter the column to sum");
            indexCol = input.nextInt();
            if (indexCol > column) {
                System.out.println("Column does not exist! ");
            }
        } while (indexCol > column);
        double sumCol = 0.0;
        for (double[] doubles : myArray) {
            sumCol += doubles[indexCol - 1];
        }
        System.out.println("Sum of column: " + indexCol + " result: " + sumCol);
    }
}
