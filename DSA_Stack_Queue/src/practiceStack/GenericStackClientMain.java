package practiceStack;

import static practiceStack.GenericStackClient.stackOfIntegers;
import static practiceStack.GenericStackClient.stackOfStrings;

public class GenericStackClientMain {
    public static void main(String[] args) {
        System.out.println("1. Stack of integer");
        stackOfIntegers();
        System.out.println("\n2. Stack of Strings");
        stackOfStrings();
    }
}
