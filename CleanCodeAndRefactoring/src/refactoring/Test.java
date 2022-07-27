package refactoring;

public class Test extends FizzBuzz {
    public static void main(String[] args) {
        int[] myArray={5,6,9,10,23,24};
        for (int item:myArray) {
            System.out.println(fizzBuzz(item));
        }
    }
}
