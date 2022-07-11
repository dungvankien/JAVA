import java.util.Scanner;

public class ReadNumbers {
    public static void main(String[] args) {
        int myNumber;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a positive integer less than 1000 ");
        System.out.println("Exit -1");
        do {
            myNumber = input.nextInt();
            if (myNumber < 10) {
                System.out.println("Read number: " + oneNine(myNumber));
            } else if (myNumber < 20) {
                System.out.println("Read number: " + tenNinety(myNumber));
            } else if (myNumber < 100) {
                int readNumberOne = (myNumber / 10) * 10;
                int readNumberTwo = myNumber % 10;
                if (readNumberTwo == 0) {
                    System.out.println("Read number: " + tenNinety(readNumberOne));
                } else {
                    System.out.println("Read number: " + tenNinety(readNumberOne) + " " + oneNine(readNumberTwo));
                }
            } else {
                int readNumberOne = (myNumber / 100);
                int readNumberTwo = (myNumber % 100) / 10 * 10;
                int readNumberThree = (myNumber % 100) % 10;
                if (readNumberTwo == 0 && readNumberThree == 0) {
                    System.out.println("Read number: " + oneNine(readNumberOne) + " hundred");
                } else if (readNumberTwo != 0 && readNumberThree == 0) {
                    System.out.println("Read number: " + oneNine(readNumberOne) + " hundred " + "and " + tenNinety(readNumberTwo));
                }
                else if(readNumberTwo == 0){
                    System.out.println("Read number: " + oneNine(readNumberOne) + " hundred " + "and " + oneNine(readNumberThree));
                }
                else if(readNumberTwo<20){
                    System.out.println("Read number: " + oneNine(readNumberOne) + " hundred " + "and " + tenNinety((myNumber % 100)));
                }
                else {
                    System.out.println("Read number: " + oneNine(readNumberOne) + " hundred " + "and " + tenNinety(readNumberTwo) + " " + oneNine(readNumberThree));
                }

            }
        } while (myNumber != -1);
    }

    public static String oneNine(int number) {
        switch (number) {
            case 0:
                return "zero";
            case 1:
                return "one";
            case 2:
                return "two";
            case 3:
                return "three";
            case 4:
                return "four";
            case 5:
                return "five";
            case 6:
                return "six";
            case 7:
                return "seven";
            case 8:
                return "eight";
            case 9:
                return "nine";
        }
        return null;
    }
    public static String tenNinety(int number) {
        switch (number) {
            case 10:
                return "ten";
            case 11:
                return "eleven";
            case 12:
                return "twelve";
            case 13:
                return "thirteen";
            case 14:
                return "fourteen";
            case 15:
                return "fifteen";
            case 16:
                return "sixteen";
            case 17:
                return "seventeen";
            case 18:
                return "eighteen";
            case 19:
                return "nineteen";
            case 20:
                return "twenty";
            case 30:
                return "thirty";
            case 40:
                return "forty";
            case 50:
                return "fifty";
            case 60:
                return "sixty";
            case 70:
                return "seventy";
            case 80:
                return "eighty";
            case 90:
                return "ninety";
        }
        return null;
    }
}
