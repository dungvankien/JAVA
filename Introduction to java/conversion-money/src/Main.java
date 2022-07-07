import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double rate=23000;
        double valueUSD;
        double valueVND;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter USD");
        valueUSD=scanner.nextDouble();
        valueVND=valueUSD*rate;
        System.out.println(valueUSD+ " USD conversion "+valueVND+" VND");
    }

}
