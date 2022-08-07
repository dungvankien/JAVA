package palindrome;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class CheckStringPalindrome {
    public CheckStringPalindrome() {
    }

    public boolean checkPalindrome(String string) {
        Queue<Character> queue = new LinkedList<>();
        Stack<Character> stack = new Stack<>();
        if (string.length() == 0) {
            throw new RuntimeException("Empty String");
        } else {
            String lowerString = string.toLowerCase();
            char[] strings = lowerString.toCharArray();
            for (char c : strings) {
                queue.add(c);
                stack.push(c);
            }
            while (!stack.isEmpty()) {
                if (stack.pop() != queue.poll()) {
                    return false;
                }
            }
            return true;
        }
    }
}
