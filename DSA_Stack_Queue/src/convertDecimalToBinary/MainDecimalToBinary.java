package convertDecimalToBinary;

public class MainDecimalToBinary {
    public static void main(String[] args) {
        DecimalToBinary decimalToBinary=new DecimalToBinary();
        int number=21;
        System.out.print(number+ " Decimal to Binary: ");
        decimalToBinary.convertDecimalToBinary(number);
    }
}
