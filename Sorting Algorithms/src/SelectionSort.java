public class SelectionSort {
    public static void main(String[] args) {
        double[] list = {1, 9, 4.5, 6.6, 5.7, -4.5};
        System.out.println("Show the original list");
        for (double item : list) {
            System.out.print(item + "\t");
        }
        selectionSort(list);
        System.out.println("\nShow list after sorting");
        for (double item : list) {
            System.out.print(item + "\t");
        }
    }

    public static void selectionSort(double[] array) {
        int index=0;
        double max;
        for (int i = 0; i < array.length-1; i++) {
            max = array[i];
            for (int j = i+1; j < array.length;j++) {
                if (max < array[j]) {
                    max = array[j];
                    index = j;
                }
            }
            array[index] = array[i];
            array[i] = max;
        }
    }
}
