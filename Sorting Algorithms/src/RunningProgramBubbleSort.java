public class RunningProgramBubbleSort {
    public static void main(String[] args) {
        int[] list = {2, 3, 2, 5, 6, 1, -2, 3, 14, 12};
        System.out.println("Show the original list");
        for (int item : list) {
            System.out.print(item + "\t");
        }
        int temp;
        int step = 0;
        for (int i = 0; i < list.length; i++) {
            for (int j = list.length - 1; j > i; j--) {
                if (list[j] < list[j - 1]) {
                    temp = list[j - 1];
                    list[j - 1] = list[j];
                    list[j] = temp;
                    System.out.println("\nProgram run step " + (step += 1) + ": ");
                    for (int item : list) {
                        System.out.print(item + "\t");
                    }
                }
            }
        }
    }
}
