package vaildateMobile;

public class VaildateMobileTest {
    public static void main(String[] args) {
        String[] mobile = {"(84)-(0978489648)", "(a8)-(22222222)"};
        VaildateMobile vaildateMobile = new VaildateMobile();
        for (String item : mobile) {
            System.out.println(vaildateMobile.vaildate(item));
        }
    }
}
