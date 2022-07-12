import java.io.IOException;
import java.util.Scanner;

public class CharacterCount {
    public static void main(String[] args) throws IOException {
        String myString;
        char myChar;
        int count;
        boolean flag;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a character '0': Exit");
        System.out.println("Enter a String:");
        myString = input.nextLine();
        do {
            System.out.println("Enter a character:");
            myChar = input.next().charAt(0);
            flag = false;
            count = 0;
            for (int i = 0; i < myString.length(); i++) {
                if (myString.charAt(i) == myChar) {
                    count++;
                    flag = true;
                }
            }
            if (flag) {
                System.out.println("Display char: " + myChar + ". Count: " + count);
            }
            else if (myChar != '0') {
                System.out.println("The character " + myChar + " is not in the string");
            }
            else {
                System.exit(0);
            }

        } while (!(myChar == '0'));
    }
}
