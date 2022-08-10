package vaildateClass;


public class VaildateClassTest {
    public static void main(String[] args) {
        String[] class1={"C0318G","A1234M"};
        String[] class2={ "M0318G", "P0323A","a1234G"};
        VaildateClass vaildateClass=new VaildateClass();
        for(String item:class1){
            System.out.println(vaildateClass.vaildate(item));
        }
        for (String item :class2){
            System.out.println(vaildateClass.vaildate(item));
        }

    }

}
