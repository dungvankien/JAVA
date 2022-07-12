public class InsertionSortFuntion {
    public static void main(String[] args) {
        int[] myArray = {8, 9, 2, 3, 6, 7, 8, 0};
        System.out.println("Show the original list");
        for (int item : myArray) {
            System.out.print(item + "\t");
        }
        insertionSort(myArray);
        System.out.println("\nShow list after sorting");
        for (int item : myArray) {
            System.out.print(item + "\t");
        }
    }

    public static void insertionSort(int[] array) {
        int x, pos;
        for (int i = 1; i < array.length; i++) {
            pos = i;
            x = array[i];
            while (pos > 0 && x < array[pos - 1]) {
                array[pos] = array[pos - 1];
                pos--;
            }
            array[pos] = x;
        }
    }
}
