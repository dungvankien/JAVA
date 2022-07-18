public class StudentPractic {
    private static String name = "John";
    private static String classes = "CO2";

    public StudentPractic() {
    }

    protected void setName(String name) {
        StudentPractic.name = name;
    }

    protected void setClasses(String classes) {
        StudentPractic.classes = classes;
    }

    public void display() {
        System.out.println("Student name: " + name + ", Classes: " + classes);
    }
}
