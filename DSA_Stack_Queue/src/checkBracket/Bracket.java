package checkBracket;

import java.util.Stack;

public class Bracket {
    final char BRACKET_LEFT = '(';
    final char BRACKET_RIGHT = ')';

    public Bracket() {
    }

    Stack<Character> bStackLeft = new Stack<>();
    Stack<Character> bStackRight = new Stack<>();


    public boolean checkBracket(String string) {
        char[] strings = string.toCharArray();
        for (char c : strings) {
            if (c == BRACKET_LEFT) {
                bStackLeft.push(c);
            }
            if (c == BRACKET_RIGHT) {
                bStackRight.push(c);
            }
        }
        if (bStackRight.size() == bStackLeft.size()) {
            return true;
        } else {
            return false;
        }
    }
}
