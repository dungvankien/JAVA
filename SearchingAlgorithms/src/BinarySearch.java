public class BinarySearch {
    public static void main(String[] args) {
        int[] list = {2, 4, 7, 10, 11, 45, 50, 59, 60, 66, 69, 70, 79};
        System.out.println("Value in list");
        for (int item : list) {
            System.out.print(item + "\t");
        }
        System.out.println("\n" + binarySearch(list, 2));
        System.out.println(binarySearch(list, 11));
        System.out.println(binarySearch(list, 79));
        System.out.println(binarySearch(list, 1));
        System.out.println(binarySearch(list, 5));
        System.out.println(binarySearch(list, 80));
    }

    public static int binarySearch(int[] list, int key) {
        int low = 0;
        int hight = list.length - 1;
        while (hight >= low) {
            int mid = (low + hight) / 2;
            if (key < list[mid]) {
                hight = mid - 1;
            } else if (key == list[mid]) {
                return mid;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }
}
