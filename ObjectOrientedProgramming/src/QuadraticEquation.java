public class QuadraticEquation {
    private final double a;
    private final double b;
    private final double c;

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public double getDiscriminant() {
        return b * b - 4 * a * c;
    }

    public String getResult() {
        double dental = getDiscriminant();
        if (dental > 0) {
            return "Result: x1= " + (-b + Math.sqrt(dental)) / (2 * a) + " , x2= " + (-b - Math.sqrt(dental)) / (2 * a);
        } else if (dental == 0) {
            return "Result: x1=x2= " + -b / (2 * a);
        } else {
            return "Result: The equation has no real roots";
        }
    }
}
