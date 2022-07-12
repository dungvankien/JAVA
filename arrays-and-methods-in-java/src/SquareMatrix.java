import java.util.Scanner;

public class SquareMatrix {
    public static void main(String[] args) {
        double[][] myArray;
        int size;
        Scanner input=new Scanner(System.in);
        System.out.println("Enter size for square matrix:");
        size=input.nextInt();
        System.out.println("Enter value into matrix:");
        myArray=new double[size][size];
        for(int i=0;i< myArray.length;i++){
            for (int j=0;j<myArray[i].length;j++){
                System.out.print("Enter element "+i+","+j+": ");
                myArray[i][j]=input.nextDouble();
            }
        }
        System.out.println("Display Array: ");
        for (double[] doubles : myArray) {
            for (double aDouble : doubles) {
                System.out.print(aDouble + "\t");
            }
            System.out.println();
        }
        double sumDiagonalsOne=0;
        double sumDiagonalsTwo=0;
        for(int i=0;i< myArray.length;i++){
            sumDiagonalsOne+=myArray[i][i];
            sumDiagonalsTwo+=myArray[i][myArray.length-1-i];
        }
        System.out.println("Sum of diagonals 1: "+sumDiagonalsOne);
        System.out.println("Sum of diagonals 2: "+sumDiagonalsTwo);
    }
}
