package triangle;

public class TriangleClassifier {
    public static String checkTriangle(double a, double b, double c) {
        if (a + b > c && a + c > b && b + c > a) {
            if (a * a == b * b + c * c || b * b == a * a + c * c || c * c == b * b + a * a) {
                return "Tam giác vuông";
            } else if (a == b && b == c) {
                return "Tam giác điều";
            } else if (a == b || a == c || b == c) {
                return "Tam giác cân";
            } else if (a * a > b * b + c * c || b * b > a * a + c * c || c * c > b * b + a * a) {
                return "Tam giác tù";
            } else {
                return "Tam giác nhọn";
            }
        } else {
            return "Không phải là tam giác";
        }

    }
}
