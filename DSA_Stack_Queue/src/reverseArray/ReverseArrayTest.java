package reverseArray;

import java.util.Arrays;

public class ReverseArrayTest {
    public static void main(String[] args) {
        ReverseArray reverseArray=new ReverseArray();
        int[] arr={1,2,3,4,5,6};
        arr=reverseArray.reverseInt(arr);
        System.out.println(Arrays.toString(arr));
        String myString="chuong trình đặt biệt";
        System.out.println((reverseArray.reverseString(myString)));
        String myChar="qưe12";
        System.out.println(reverseArray.reverseString(myChar));
    }
}
