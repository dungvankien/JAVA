package java_49;

import java.util.Scanner;

public class Vidu {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s;
        System.out.println("nhập vào chuỗi");
        s=sc.nextLine();
        System.out.println("-------------");
        // ham length()> độ dài của chuỗi
        System.out.println(s.length());
        int doDai=s.length();
        // hàm charAt(vị trí)>>lấy ra 1 ký tự tại vị trí
        for (int i=0; i<doDai;i++){
            System.out.println("Vị trí "+i+" là "+s.charAt(i));
        }
        // hàm getChars(vị trí bắt đầu, vị trí kết thức, mảng dữ liệu, vị trí bắt đầu lưu của mảng
        char[] arrayChar=new char[10];
        s.getChars(2,4,arrayChar,0);
        for (int i=0; i<arrayChar.length;i++){
            System.out.println("Giá trị của mảng tại "+i+" là "+arrayChar[i]);
        }
        //hàm getBytes >> có 3 cách lấy ra ký tự thành 1 mảng
        byte[] arrayBytes=s.getBytes();
        for (byte b:arrayBytes) {
            System.out.println(b);
        }
    }
}
