package convertDecimalToBinary;

import java.util.Stack;

public class DecimalToBinary {
    public DecimalToBinary() {
    }

    Stack<Integer> stack = new Stack<>();

    public void convertDecimalToBinary(int number) {
        while (number != 0) {
            int surplus = number % 2;
            stack.push(surplus);
            number = number / 2;
        }
        while (!(stack.isEmpty())) {
            System.out.print(stack.pop() + " ");
        }
    }
}
