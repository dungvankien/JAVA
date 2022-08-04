package baiTap_ArrayList;

import java.util.Arrays;

public class MyListTest {
    public static void main(String[] args) {
        MyList<String> myList = new MyList<>();
        myList.add("Huy");
        myList.add("Ngô");
        myList.add("tai");
        System.out.println(myList.toString());
        myList.add(2, "truc");
        System.out.println(myList.toString());
        System.out.println(myList.remove(0));
        System.out.println(myList.toString());
        System.out.println(myList.size());
        System.out.println(myList.contanins("Ngô"));
        System.out.println(myList.indexOf("Ng"));
        System.out.println(myList.get(2));
        System.out.println(Arrays.toString(myList.clone()));
        myList.clear();
        System.out.println(myList.toString());


    }


}
