public class MainFan {
    public static void main(String[] args) {
        Fan fan1 = new Fan();
        Fan fan2=new Fan();
        fan1.setSpeed(fan1.FAST);
        fan1.setRadius(10.0);
        fan1.setColor("Yellow");
        System.out.println("fan1: "+ fan1);
        System.out.println("fan2: "+ fan2);
    }
}
