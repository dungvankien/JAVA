package reverseArray;

import java.util.EmptyStackException;
import java.util.Stack;

public class ReverseArray {
    public int[] reverseInt(int[] arr) {
        Stack<Integer> stack = new Stack<>();
        for (int j : arr) {
            stack.push(j);
        }
        int[] tempArray = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            tempArray[i] = stack.pop();
        }
        return tempArray;
    }

    public String reverseString(String string) {
        if (string.length() == 0) {
            throw new EmptyStackException();
        }
        if (!string.contains(" ")) {
            Stack<Character> wStack = new Stack<>();
            for (int i = 0; i < string.length(); i++) {
                wStack.push(string.charAt(i));
            }
            String tempChar = "";
            for (int i = 0; i < string.length(); i++) {
                tempChar += wStack.pop();
            }
            return tempChar;
        } else {
            Stack<String> wStack = new Stack<>();
            String[] strings = string.split(" ");
            for (String s : strings) {
                wStack.push(s);
            }
            String tempString = "";
            for (int i = 0; i < strings.length; i++) {
                tempString += wStack.pop() + " ";
            }
            return tempString;
        }
    }
}
