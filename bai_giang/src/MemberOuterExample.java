public class MemberOuterExample {
    private int exam = 30;
    // khai bao Inner Class
    class Inner {
        void printMessage() {
            System.out.println("Gia tri cua bien exam la: " + exam);
        }
    }
    // phan ket thuc cua khai bao
    public static void main(String[] args) {
        MemberOuterExample obj = new MemberOuterExample();
        MemberOuterExample.Inner in = obj.new Inner();
        in.printMessage();
    }
}
