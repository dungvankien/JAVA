public class Fan {
    final int SLOW = 1;
    final int MEDIUM = 2;
    final int FAST = 3;
    private int speed = SLOW;
    private boolean on = false;
    private double radius = 5;
    private String color = "Blue";

    public int getSLOW() {
        this.on = true;
        return SLOW;
    }

    public int getMEDIUM() {
        this.on = true;
        return MEDIUM;
    }

    public int getFAST() {
        this.on = true;
        return FAST;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(final int speed) {
        this.speed = speed;
        this.on = true;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Fan() {
    }

    public String toString() {
        if (on) {
            return "Speed: " + getSpeed() + ", Color: " + getColor() + ", Radius: " + getRadius() + ", fan in on";
        } else {
            return "Color: " + getColor() + ", Radius: " + getRadius() + ", fan in off";
        }
    }
}
