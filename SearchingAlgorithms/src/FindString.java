import java.util.LinkedList;
import java.util.Scanner;

public class FindString {
    public static void main(String[] args) {
        String myString;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string:!");
        myString = input.nextLine();

        LinkedList<Character> max = new LinkedList<>();
        for (int i = 0; i < myString.length(); i++) {
            LinkedList<Character> list = new LinkedList<>();
            list.add(myString.charAt(i));
            for (int j = i + 1; j < myString.length(); j++) {
                if (myString.charAt(j) > list.getLast()) {
                    list.add(myString.charAt(j));
                }
            }
            if(list.size()>max.size()){
                max.clear();
                max.addAll(list);
            }
            list.clear();
        }
        for (char ch:max) {
            System.out.print(ch);
        }
    }
}
