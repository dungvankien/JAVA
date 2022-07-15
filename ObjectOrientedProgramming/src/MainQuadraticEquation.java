import java.util.Scanner;

public class MainQuadraticEquation {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("Emter a #0: ");
        double a=input.nextDouble();
        System.out.println("Enter b: ");
        double b=input.nextDouble();
        System.out.println("Enter c: ");
        double c=input.nextDouble();
        QuadraticEquation quadraticEquation=new QuadraticEquation(a,b,c);
        System.out.println("Enter: "+quadraticEquation.getA()+ "*X2 + "+quadraticEquation.getB()+" *X + "+quadraticEquation.getC()+" = 0");
        System.out.println("Dental= "+ quadraticEquation.getDiscriminant()+". "+quadraticEquation.getResult());
    }
}
