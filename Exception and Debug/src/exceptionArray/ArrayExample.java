package exceptionArray;

import java.util.Random;
import java.util.Scanner;

public class ArrayExample {
    public Integer[] createRandom(){
        Random random=new Random();
        Integer[] arr=new Integer[100];
        System.out.println("Danh sách phần tử của mảng: ");
        for(int i=0;i<100;i++){
            arr[i]=random.nextInt(100);
            System.out.print(arr[i]+" ");
        }
        return arr;
    }

    public static void main(String[] args) {
        ArrayExample arrayExample=new ArrayExample();
        Integer[] arr= arrayExample.createRandom();
        Scanner scanner=new Scanner(System.in);
        System.out.println("\nVui lòng nhập chỉ số bất kỳ: ");
        int x=scanner.nextInt();
        try {
            System.out.println("giá trị của phần tử có chỉ số ở vị trí "+x+" là "+arr[x]);
        }catch (IndexOutOfBoundsException e){
            System.err.println("Chỉ số vượt quá giới hạn của mảng");
        }
    }
}
