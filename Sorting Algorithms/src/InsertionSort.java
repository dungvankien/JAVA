public class InsertionSort {
    public static void main(String[] args) {
        double[] myArray = {3, 5, 1, 0, 7, 8, 1, 0};
        System.out.println("Show the original list");
        for (double item : myArray) {
            System.out.print(item + "\t");
        }
        runningProgramInsertionSort(myArray);

    }

    public static void runningProgramInsertionSort(double[] array) {
        double x;
        int pos, step = 0;
        for (int i = 1; i < array.length; i++) {
            x = array[i];
            pos = i;
            while (pos > 0 && x < array[pos - 1]) {
                array[pos] = array[pos - 1];
                pos--;
            }
            array[pos] = x;
            System.out.println("\nstep " + (step++) + ": ");
            for (double item : array) {
                System.out.print(item + "\t\t");
            }
        }
    }
}
