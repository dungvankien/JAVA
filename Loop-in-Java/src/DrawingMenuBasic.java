import java.util.Scanner;

public class DrawingMenuBasic {
    public static void main(String[] args) {
        StringBuilder star = new StringBuilder();
        StringBuilder blank = new StringBuilder();
        String hidden;
        int choice=-1;
        int myHeightTriangle = 8;
        int myHeight = 5;
        int myWidth = 8;
        int i, j;
        int medial;

        Scanner input = new Scanner(System.in);
        while (choice != 0) {
            System.out.println("Menu");
            System.out.println("1: Print the rectangle:");
            System.out.println("2: Print the square triangle");
            System.out.println("3: Print isosceles triangle");
            System.out.println("4: Exit");
            System.out.println("Choice Number");
            choice = input.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Print the rectangle:");
                    for (i = 0; i < myHeight; i++) {
                        for (j = 0; j < myWidth; j++) {
                            star.append("  *");
                        }
                        System.out.println(star);
                        star = new StringBuilder();
                    }
                    break;
                case 2:
                    System.out.println("Print the square triangle: ");
                    System.out.println("Bottom-left ");
                    for (i = 0; i < myHeightTriangle; i++) {
                        star = new StringBuilder();
                        for (j = 0; j <= i; j++) {
                            star.append("  *");
                        }
                        System.out.println(star);
                    }
                    System.out.println("Top-left ");
                    medial = myHeightTriangle;
                    for (i = 0; i < myHeightTriangle; i++) {
                        star = new StringBuilder();
                        medial--;
                        for (j = medial; j >= 0; j--) {
                            star.append("  *");
                        }
                        System.out.println(star);
                    }
                    System.out.println("Bottom-right ");
                    star = new StringBuilder("  *");
                    medial = myHeightTriangle - 1;
                    for (i = 0; i < myHeightTriangle; i++) {
                        for (j = 0; j < medial; j++) {
                            blank.append("   ");
                        }
                        hidden = blank.toString() + star;
                        System.out.println(hidden);
                        star.append("  *");
                        medial--;
                        blank = new StringBuilder();
                    }
                    System.out.println("Top-right ");
                    medial = myHeightTriangle;
                    for (i = 0; i < myHeightTriangle; i++) {
                        star = new StringBuilder();
                        for (j = 0; j < medial; j++) {
                            star.append("  *");
                        }
                        hidden = blank.toString() + star;
                        System.out.println(hidden);
                        medial--;
                        blank.append("   ");
                    }
                    star = new StringBuilder();
                    blank = new StringBuilder();
                    break;
                case 3:
                    System.out.println("Print isosceles triangle");
                    medial = myHeightTriangle - 1;
                    star = new StringBuilder("  *");
                    for (i = 0; i < myHeightTriangle; i++) {
                        for (j = 0; j < medial; j++) {
                            blank.append("   ");
                        }
                        hidden = blank.toString() + star;
                        System.out.println(hidden);
                        star.append("  *  *");
                        medial--;
                        blank = new StringBuilder();
                    }
                    star = new StringBuilder();
                    break;
                case 4:
                    System.exit(0);
                default:
                    System.out.println("No Choice!");
            }
        }
    }
}
